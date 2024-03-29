package com.yangbin1.redisdemo.base;

import com.yangbin1.redisdemo.RedisdemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * junit 测试基类
 */
//SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//启动类,启用随即端口
@SpringBootTest(classes = RedisdemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//web项目支持，webEnvironment属性使用后不能用webAppconfiguration注解
//@WebAppConfiguration
public class BaseJunit {

    @Test
    public void runJunitTest() {
        System.out.println("Junit 启动测试");

    }
}