package com.yangbin1.service.impl;

import com.yangbin1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: UserServiceImpl
 * @Auther: yangbin1
 * @Date: 2019/6/27 11:41
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public String getString(String key) {
        ValueOperations<String, String> string = redisTemplate.opsForValue();
        if (redisTemplate.hasKey(key)) {
            System.out.println("在redis中取回");
            return string.get(key);
        } else {

        }
    }
}
