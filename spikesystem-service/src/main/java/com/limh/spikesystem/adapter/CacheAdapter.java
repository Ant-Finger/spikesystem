package com.limh.spikesystem.adapter;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 缓存适配器
 * @author Limh
 * @date 2021/2/3
 */
public interface CacheAdapter {
    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit unit);

    void setnx(String key, String value);

    void setex(String key, String value);

    Boolean del(String key);

    String get(String key);

    <T> T getJson(String key, Class<T> type);

    Long decrementOne(String key);

    Long decrement(String key, long nums);

    Long increaseOne(String key);

    Long increase(String key, long nums);

    String execute(List<String> keys, Object... args);
}
