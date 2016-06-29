/*******************************************************************
 * Copyright (c) 2016 arvato
 * All rights reserved.
 *
 * Contributors:
 * arvato Systems (Shanghai) Co., Ltd.
 * 
 ******************************************************************/
package com.arvatosystems.demo.service.api.idto;

import java.util.List;
import java.util.Map;

/**
 * @author efun
 *
 */
public interface ITestResult {

	/**
	 * @return the cache
	 */
	public abstract boolean isCache();

	/**
	 * @param cache the cache to set
	 */
	public abstract void setCache(boolean cache);

	/**
	 * @return the data
	 */
	public abstract Map<String, List<ITestSubResult>> getData();

	/**
	 * @param data the data to set
	 */
	public abstract void setData(Map<String, List<ITestSubResult>> data);

	/**
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();

}