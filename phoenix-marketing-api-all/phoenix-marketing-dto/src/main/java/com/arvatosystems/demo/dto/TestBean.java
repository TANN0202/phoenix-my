package com.arvatosystems.demo.dto;

import com.arvatosystems.demo.service.api.idto.ITestBean;

public class TestBean implements java.io.Serializable, ITestBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String token;
	
	private String parm;
	
	private Long timestamp;
	
	
	
	
	
	public TestBean() {
		super();
	}





	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestBean#getToken()
	 */
	@Override
	public String getToken() {
		return token;
	}





	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestBean#setToken(java.lang.String)
	 */
	@Override
	public void setToken(String token) {
		this.token = token;
	}





	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestBean#getParm()
	 */
	@Override
	public String getParm() {
		return parm;
	}





	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestBean#setParm(java.lang.String)
	 */
	@Override
	public void setParm(String parm) {
		this.parm = parm;
	}





	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestBean#getTimestamp()
	 */
	@Override
	public Long getTimestamp() {
		return timestamp;
	}





	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestBean#setTimestamp(java.lang.Long)
	 */
	@Override
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}





	public TestBean(String token, String parm, Long timestamp) {
		super();
		this.token = token;
		this.parm = parm;
		this.timestamp = timestamp;
	}




}
