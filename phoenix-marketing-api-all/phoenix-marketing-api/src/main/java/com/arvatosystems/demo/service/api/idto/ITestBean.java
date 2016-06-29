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
public interface ITestBean {

	/**
	 * @return the token
	 */
	public abstract String getToken();

	/**
	 * @param token the token to set
	 */
	public abstract void setToken(String token);

	/**
	 * @return the parm
	 */
	public abstract String getParm();

	/**
	 * @param parm the parm to set
	 */
	public abstract void setParm(String parm);

	/**
	 * @return the timestamp
	 */
	public abstract Long getTimestamp();

	/**
	 * @param timestamp the timestamp to set
	 */
	public abstract void setTimestamp(Long timestamp);

}