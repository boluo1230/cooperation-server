package com.server.cooperation.service;

public interface RedisService {
    void setStringCache(String key, String value, long timeout);

    String getStringCache(String key);
}
