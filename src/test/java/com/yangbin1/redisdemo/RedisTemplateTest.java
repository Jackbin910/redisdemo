package com.yangbin1.redisdemo;

import com.yangbin1.redisdemo.base.BaseJunit;
import com.yangbin1.redisdemo.service.UserService;
import com.yangbin1.redisdemo.utils.SpringUtils;
import org.junit.Test;

public class RedisTemplateTest extends BaseJunit {

    @Test
    public void t1(){
        UserService userService = SpringUtils.getBean("userService");
        String key = "applicationName";
        String result = userService.getString(key);
        System.out.println(result);
    }
}
