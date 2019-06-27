package com.yangbin1.utils;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @ClassName: CacheUtils
 * @Auther: yangbin1
 * @Date: 2019/6/27 10:02
 * @Description:
 */
public class CacheUtils {


    @Resource
    private RedisTemplate<String, String> redisTemplate;
    private static CacheUtils cacheUtils;

    @PostConstruct
    public void init() {
        cacheUtils = this;
        cacheUtils.redisTemplate = this.redisTemplate;
    }

    /**
     * 保存到hash集合中
     *
     * @param hName 集合名
     * @param key
     * @param value
     */
    public static void hashSet(String hName, String key, String value) {
        cacheUtils.redisTemplate.opsForHash().put(hName, key, value);
    }

    /**
     * 从hash集合里取得
     *
     * @param hName
     * @param key
     * @return
     */

    public static Object hashGet(String hName, String key) {
        return cacheUtils.redisTemplate.opsForHash().get(hName, key);
    }

    /**
     省略 N 多方法
     。。。。。。
     */
}
