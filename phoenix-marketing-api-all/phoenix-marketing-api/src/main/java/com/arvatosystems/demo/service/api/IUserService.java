package com.arvatosystems.demo.service.api;

import com.arvatosystems.demo.service.api.idto.IUser;


/**
 * @author chao.liuc
 *
 */
public interface IUserService {

	String hello(String str);
	
	IUser getUser(Long id);
 
	IUser updaetUser(IUser user);
}
