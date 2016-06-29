package com.arvatosystems.demo.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arvatosystems.demo.dto.User;
import com.arvatosystems.demo.service.api.IUserService;
import com.arvatosystems.demo.service.api.idto.IUser;

/**
 * GenericConsumer
 * 
 * @author chao.liuc
 */
public class GenericConsumer2 {

    public static void main(String[] args) throws Exception {
        String config = "classpath*:spring-*.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
        IUserService userservice = (IUserService) context.getBean("userservice");

		IUser user1 = userservice.getUser(1L);
        System.out.println(user1);
        
        IUser user = new User(2L, "user2", 2);
        
		IUser user2 = userservice.updaetUser(user);
        System.out.println(user2);
    }
}
