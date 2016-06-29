package com.arvatosystems.demo.dto;

import java.util.List;
import java.util.Map;

import com.arvatosystems.demo.service.api.idto.ITestResult;
import com.arvatosystems.demo.service.api.idto.ITestSubResult;

public class TestResult implements java.io.Serializable, ITestResult{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean cache;
	
	private Map<String, List<ITestSubResult>> data;
	
	
	public TestResult() {
		super();
	}

	public TestResult(boolean cache, Map<String, List<ITestSubResult>> data) {
		super();
		this.cache = cache;
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestResult#isCache()
	 */
	@Override
	public boolean isCache() {
		return cache;
	}


	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestResult#setCache(boolean)
	 */
	@Override
	public void setCache(boolean cache) {
		this.cache = cache;
	}


	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestResult#getData()
	 */
	@Override
	public Map<String, List<ITestSubResult>> getData() {
		return data;
	}


	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestResult#setData(java.util.Map)
	 */
	@Override
	public void setData(Map<String, List<ITestSubResult>> data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestResult#toString()
	 */
	@Override
	public String toString() {
		return "TestResult [cache=" + cache + ", data=" + data + "]";
	}

}
