/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.accumulo.manager.http.rest;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.function.Supplier;

import org.apache.thrift.TBase;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TJSONProtocol;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Suppliers;

public class TBaseJson<T extends TBase<?,?>> {

  private final Class<T> type;
  private final String encoded;
  private final Supplier<T> obj;

  @SuppressWarnings("unchecked")
  public TBaseJson(T obj) {
    this.type = (Class<T>) obj.getClass();
    this.encoded = serialize(obj);
    this.obj = () -> obj;
  }

  @JsonCreator
  public TBaseJson(@JsonProperty("type") Class<T> type, @JsonProperty("encoded") String encoded) {
    this.type = type;
    this.encoded = encoded;
    this.obj = Suppliers.memoize(() -> {
      try {
        T o = type.getDeclaredConstructor().newInstance();
        deserialize(o, encoded);
        return o;
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    });
  }

  public Class<T> getType() {
    return type;
  }

  public String getEncoded() {
    return encoded;
  }

  @JsonIgnore
  public T getObject() {
    return obj.get();
  }

  public static <T extends TBase<?,?>> String serialize(T obj) {
    try {
      final TSerializer serializer = new TSerializer(new TJSONProtocol.Factory());
      return serializer.toString(obj);
    } catch (TException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T extends TBase<?,?>> void deserialize(T obj, String json) {
    try {
      final TDeserializer deserializer = new TDeserializer(new TJSONProtocol.Factory());
      deserializer.deserialize(obj, json, UTF_8.name());
    } catch (TException e) {
      throw new RuntimeException(e);
    }
  }
}
