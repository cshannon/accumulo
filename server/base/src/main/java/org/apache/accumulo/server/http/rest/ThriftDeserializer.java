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
package org.apache.accumulo.server.http.rest;

import java.io.IOException;
import java.lang.reflect.Constructor;

import org.apache.thrift.TBase;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class ThriftDeserializer<T extends TBase<?,?>> extends JsonDeserializer<T> {
  @Override
  public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    JsonNode tree = p.readValueAsTree();
    try {
      var thriftClassName = tree.get("type").asText();
      var encoded = tree.get("encoded").asText();

      Constructor<T> constructor = getThriftClass(thriftClassName).getDeclaredConstructor();
      T obj = constructor.newInstance();
      TBaseJson.deserialize(obj, encoded);

      return obj;

    } catch (ReflectiveOperationException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("unchecked")
  public Class<T> getThriftClass(String className) throws ClassNotFoundException {
    var clazz = Class.forName(className, false, ThriftDeserializer.class.getClassLoader());
    if (!TBase.class.isAssignableFrom(clazz)) {
      throw new IllegalArgumentException("Class " + clazz + " is not assignable to TBase");
    }
    return (Class<T>) clazz;
  }
}
