package com.hari.codingtest;

import java.util.HashMap;

public class CacheWithElementsExpireTtl {

    private HashMap<Object, Object> map;
    private int ttl;

    CacheWithElementsExpireTtl() {
        map = new HashMap<>();
    }

    public void addKeyValueToCache(Object key, Object value, int ttl) {
    }

    public void removeKeyValueFromCache(Object key) {

    }

    public Object getValue(Object key) {

        return null;
    }

    public Object getTtlOfKey(Object key) {

        return null;
    }

}
