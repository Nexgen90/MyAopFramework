package com.example.framework.infrastructure.proxyConfigurators;

public interface ProxyConfigurator {
    Object replaceWithProxyIfNeeded(Object t, Class implClass);
}
