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
public interface ITestSubResult {

	/**
	 * @return the id
	 */
	public abstract String getId();

	/**
	 * @param id the id to set
	 */
	public abstract void setId(String id);

	/**
	 * @return the order
	 */
	public abstract String getOrder();

	/**
	 * @param order the order to set
	 */
	public abstract void setOrder(String order);

	/**
	 * @return the keyword
	 */
	public abstract String getKeyword();

	/**
	 * @param keyword the keyword to set
	 */
	public abstract void setKeyword(String keyword);

	/**
	 * @return the other
	 */
	public abstract String getOther();

	/**
	 * @param other the other to set
	 */
	public abstract void setOther(String other);

	/**
	 * @return the state
	 */
	public abstract String getState();

	/**
	 * @param state the state to set
	 */
	public abstract void setState(String state);

	/**
	 * @return the nowPage
	 */
	public abstract Long getNowPage();

	/**
	 * @param nowPage the nowPage to set
	 */
	public abstract void setNowPage(Long nowPage);

	/**
	 * @return the saveTime
	 */
	public abstract String getSaveTime();

	/**
	 * @param saveTime the saveTime to set
	 */
	public abstract void setSaveTime(String saveTime);

	/**
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();

}