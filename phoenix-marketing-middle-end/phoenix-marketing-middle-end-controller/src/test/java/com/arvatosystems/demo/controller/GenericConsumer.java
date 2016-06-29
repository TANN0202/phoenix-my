package com.arvatosystems.demo.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvatosystems.demo.service.api.IUserService;

/**
 * GenericConsumer
 * 
 * @author chao.liuc
 */
public class GenericConsumer {

    public static void main(String[] args) throws Exception {
        String config = "classpath*:spring-*.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
        IUserService userservice = (IUserService) context.getBean("userservice");
        String str = userservice.hello("dubbo!");
        System.out.println(str);
    }
}
