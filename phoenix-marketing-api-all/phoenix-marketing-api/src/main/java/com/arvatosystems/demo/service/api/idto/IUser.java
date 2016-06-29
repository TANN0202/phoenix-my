/*******************************************************************
 * Copyright (c) 2016 arvato
 * All rights reserved.
 *
 * Contributors:
 * arvato Systems (Shanghai) Co., Ltd.
 * 
 ******************************************************************/
package com.arvatosystems.demo.service.api.idto;

/**
 * @author efun
 *
 */
public interface IUser {

	public abstract String getName();

	public abstract void setName(String name);

	public abstract Integer getAge();

	public abstract void setAge(Integer age);

	public abstract Long getId();

	public abstract void setId(Long id);

	public abstract String toString();

}