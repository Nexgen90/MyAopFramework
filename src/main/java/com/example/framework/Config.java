package com.example.framework;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
