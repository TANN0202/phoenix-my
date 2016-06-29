package com.arvatosystems.demo.service.mock;

import com.arvatosystems.demo.dto.User;
import com.arvatosystems.demo.service.api.IUserService;
import com.arvatosystems.demo.service.api.idto.IUser;

/**
 * @author chao.liuc
 *
 */
public class UserServiceMock implements IUserService {


	public String hello(String str) {
		System.out.println("Mockup hello is called, input: " + str);
		return "Mockup: Hello " + str + "!";
	}

	public IUser getUser(Long id) {
		System.out.println("Mockup getUser is called input: " + id);
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
		// TODO Auto-generated method stub
		return user;
	}
}
