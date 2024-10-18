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
package org.apache.accumulo.manager.http;

import java.util.EnumSet;

import org.apache.accumulo.core.conf.Property;
import org.apache.accumulo.core.rpc.SslConnectionParams;
import org.apache.accumulo.manager.Manager;
import org.apache.accumulo.server.ServerContext;
import org.apache.accumulo.server.rpc.ThriftServerType;
import org.eclipse.jetty.server.AbstractConnectionFactory;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmbeddedRpcWebServer {
  private static final Logger LOG = LoggerFactory.getLogger(EmbeddedRpcWebServer.class);

  private static final EnumSet<Property> requireForSecure =
      EnumSet.of(Property.RPC_SSL_KEYSTORE_PATH, Property.RPC_SSL_KEYSTORE_PASSWORD,
          Property.RPC_SSL_TRUSTSTORE_PATH, Property.RPC_SSL_TRUSTSTORE_PASSWORD);

  private final Server server;
  private final ServerConnector connector;
  private final ServletContextHandler handler;
  private final boolean secure;

  public EmbeddedRpcWebServer(Manager manager, int port) {
    server = new Server();
    final ServerContext context = manager.getContext();
    secure = context.getThriftServerType() == ThriftServerType.SSL;

    connector = new ServerConnector(server, getConnectionFactories(context, secure));
    connector.setHost(manager.getHostname());
    connector.setPort(port);

    handler =
        new ServletContextHandler(ServletContextHandler.SESSIONS | ServletContextHandler.SECURITY);
    handler.getSessionHandler().getSessionCookieConfig().setHttpOnly(true);
    handler.setContextPath("/");
  }

  private static AbstractConnectionFactory[] getConnectionFactories(ServerContext context,
      boolean secure) {
    HttpConnectionFactory httpFactory = new HttpConnectionFactory();
    if (secure) {
      LOG.debug("Configuring Jetty to use TLS");
      final SslContextFactory.Server sslContextFactory = new SslContextFactory.Server();
      // // If the key password is the same as the keystore password, we don't
      // // have to explicitly set it. Thus, if the user doesn't provide a key
      // // password, don't set anything.
      // final String keyPass = conf.get(Property.MONITOR_SSL_KEYPASS);
      // if (!Property.MONITOR_SSL_KEYPASS.getDefaultValue().equals(keyPass)) {
      // sslContextFactory.setKeyManagerPassword(keyPass);
      // }
      SslConnectionParams sslParams = context.getServerSslParams();

      sslContextFactory.setKeyStorePath(sslParams.getKeyStorePath());
      sslContextFactory.setKeyStorePassword(sslParams.getKeyStorePass());
      sslContextFactory.setKeyStoreType(sslParams.getKeyStoreType());
      sslContextFactory.setTrustStorePath(sslParams.getTrustStorePath());
      sslContextFactory.setTrustStorePassword(sslParams.getTrustStorePass());
      sslContextFactory.setTrustStoreType(sslParams.getTrustStoreType());

      final String includedCiphers = context.getConfiguration().get(Property.RPC_SSL_CIPHER_SUITES);
      if (!Property.RPC_SSL_CIPHER_SUITES.getDefaultValue().equals(includedCiphers)) {
        sslContextFactory.setIncludeCipherSuites(includedCiphers.split(","));
      }

      // final String excludedCiphers = conf.get(Property.MONITOR_SSL_EXCLUDE_CIPHERS);
      // if (!Property.MONITOR_SSL_EXCLUDE_CIPHERS.getDefaultValue().equals(excludedCiphers)) {
      // sslContextFactory.setExcludeCipherSuites(excludedCiphers.split(","));
      // }

      final String[] includeProtocols = sslParams.getServerProtocols();
      if (includeProtocols != null && includeProtocols.length > 0) {
        sslContextFactory.setIncludeProtocols(includeProtocols);
      }

      SslConnectionFactory sslFactory =
          new SslConnectionFactory(sslContextFactory, httpFactory.getProtocol());
      return new AbstractConnectionFactory[] {sslFactory, httpFactory};
    } else {
      LOG.debug("Not configuring Jetty to use TLS");
      return new AbstractConnectionFactory[] {httpFactory};
    }
  }

  public void addServlet(ServletHolder restServlet, String where) {
    handler.addServlet(restServlet, where);
  }

  public int getPort() {
    return connector.getLocalPort();
  }

  public boolean isSecure() {
    return secure;
  }

  public void start() {
    try {
      server.addConnector(connector);
      server.setHandler(handler);
      server.start();
    } catch (Exception e) {
      stop();
      throw new RuntimeException(e);
    }
  }

  public void stop() {
    try {
      server.stop();
      server.join();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public boolean isRunning() {
    return server.isRunning();
  }

}
