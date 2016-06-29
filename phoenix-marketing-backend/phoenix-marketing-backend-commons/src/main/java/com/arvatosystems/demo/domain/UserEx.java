package com.arvatosystems.demo.domain;

import javax.validation.constraints.NotNull;

import com.arvatosystems.demo.dto.User;

public class UserEx extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void setName(@NotNull String name) {
		this.name = name;
	}

}
