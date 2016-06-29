package com.arvatosystems.demo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * GenericProvider
 * 
 * @author chao.liuc
 */
public class GenericProvider {
    
    public static void main(String[] args) throws Exception {
        String config = "classpath*:spring-*.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
        System.in.read();
    }
    
}
