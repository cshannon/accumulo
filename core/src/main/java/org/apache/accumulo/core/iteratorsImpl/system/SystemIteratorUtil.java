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
package org.apache.accumulo.core.iteratorsImpl.system;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.accumulo.core.client.IteratorSetting;
import org.apache.accumulo.core.conf.AccumuloConfiguration;
import org.apache.accumulo.core.data.Column;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.iterators.SortedKeyValueIterator;
import org.apache.accumulo.core.security.Authorizations;
import org.apache.accumulo.grpc.compaction.protobuf.PIteratorConfig;
import org.apache.accumulo.grpc.compaction.protobuf.PIteratorSetting;

/**
 * System utility class. Not for client use.
 */
public class SystemIteratorUtil {

  public static PIteratorSetting toPIteratorSetting(IteratorSetting is) {
    return PIteratorSetting.newBuilder().setPriority(is.getPriority()).setName(is.getName())
        .setIteratorClass(is.getIteratorClass()).putAllProperties(is.getOptions()).build();
  }

  public static IteratorSetting toIteratorSetting(PIteratorSetting pis) {
    return new IteratorSetting(pis.getPriority(), pis.getName(), pis.getIteratorClass(),
        pis.getPropertiesMap());
  }

  public static PIteratorConfig toIteratorConfig(List<IteratorSetting> iterators) {
    ArrayList<PIteratorSetting> pisList = new ArrayList<>();

    for (IteratorSetting iteratorSetting : iterators) {
      pisList.add(toPIteratorSetting(iteratorSetting));
    }

    return PIteratorConfig.newBuilder().addAllIterators(pisList).build();
  }

  public static SortedKeyValueIterator<Key,Value> setupSystemScanIterators(
      SortedKeyValueIterator<Key,Value> source, Set<Column> cols, Authorizations auths,
      byte[] defaultVisibility, AccumuloConfiguration conf) throws IOException {
    SortedKeyValueIterator<Key,Value> delIter =
        DeletingIterator.wrap(source, false, DeletingIterator.getBehavior(conf));
    ColumnFamilySkippingIterator cfsi = new ColumnFamilySkippingIterator(delIter);
    SortedKeyValueIterator<Key,Value> colFilter = ColumnQualifierFilter.wrap(cfsi, cols);
    return VisibilityFilter.wrap(colFilter, auths, defaultVisibility);
  }
}
