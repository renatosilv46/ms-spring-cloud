package com.ms_folha_pagamento.infra;

import org.springframework.cloud.client.ServiceInstance;

import java.net.URI;
import java.util.Map;

public class CustomServiceInstance implements ServiceInstance {
    private final String host;
    private final int port;

    public CustomServiceInstance(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public String getInstanceId() {
        return ServiceInstance.super.getInstanceId();
    }

    @Override
    public String getServiceId() {
        return "ms-recursos-humanos";
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public URI getUri() {
        return URI.create("http://" + host + ":" + port);
    }

    @Override
    public Map<String, String> getMetadata() {
        return Map.of();
    }

    @Override
    public String getScheme() {
        return "http";
    }
}
