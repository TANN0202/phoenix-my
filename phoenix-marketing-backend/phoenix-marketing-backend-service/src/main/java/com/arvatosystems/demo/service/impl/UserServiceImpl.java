/**
 * Project: dubbo-examples
 * 
 * File Created at 2012-2-17
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.arvatosystems.demo.service.impl;

import org.springframework.stereotype.Service;

import com.arvatosystems.demo.dto.User;
import com.arvatosystems.demo.service.api.IUserService;
import com.arvatosystems.demo.service.api.idto.IUser;

/**
 * @author chao.liuc
 *
 */
@Service
public class UserServiceImpl implements IUserService {


	public String hello(String str) {
		System.out.println("hello is called, input: " + str);
		return "Hello " + str + "!";
	}

	public IUser getUser(Long id) {
		System.out.println("getUser is called input: " + id);
		IUser user = new User(1L, "user", 1);
		if (id != null ) {
			String idString = Long.toString(id);
			user.setAge(Integer.parseInt(idString));
			user.setId(id);
			user.setName(user.getName()+idString);
		}
		
		return user;
	}
	
	

	/* (non-Javadoc)
	 * @see com.arvato.demo.service.api.IUserService#updaetUser(com.arvato.demo.model.IUser)
	 */
	@Override
	public IUser updaetUser(IUser user) {
		return user;
	}
}
