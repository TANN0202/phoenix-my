/*******************************************************************
 * Copyright (c) 2016 arvato
 * All rights reserved.
 *
 * Contributors:
 * arvato Systems (Shanghai) Co., Ltd.
 * 
 ******************************************************************/
package com.arvatosystems.demo.dto;

import com.arvatosystems.demo.service.api.idto.ITestSubResult;


/**
 * @author efun
 *
 */
public class TestSubResult implements java.io.Serializable, ITestSubResult{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	"_id":"574e9f69c135145d23ec60f8",
//	"order":"cf698334e69959c49a29984a08e1ab9a",
//	"keyworld":"react",
//	"Other":"react",
//	"state":"complete",
//	"NowPage":100,
//	"SaveTime":"2016-06-01T08:40:09.500Z"
	
	private String id;
	
	private String order;
	
	private String keyword;
	
	private String other;
	
	private String state;
	
	private Long nowPage;
	
	private String saveTime;
	
	public TestSubResult() {
		super();
	}

	public TestSubResult(String id, String order, String keyword, String other, String state, Long nowPage,
			String saveTime) {
		super();
		this.id = id;
		this.order = order;
		this.keyword = keyword;
		this.other = other;
		this.state = state;
		this.nowPage = nowPage;
		this.saveTime = saveTime;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getOrder()
	 */
	@Override
	public String getOrder() {
		return order;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setOrder(java.lang.String)
	 */
	@Override
	public void setOrder(String order) {
		this.order = order;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getKeyword()
	 */
	@Override
	public String getKeyword() {
		return keyword;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setKeyword(java.lang.String)
	 */
	@Override
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getOther()
	 */
	@Override
	public String getOther() {
		return other;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setOther(java.lang.String)
	 */
	@Override
	public void setOther(String other) {
		this.other = other;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getState()
	 */
	@Override
	public String getState() {
		return state;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setState(java.lang.String)
	 */
	@Override
	public void setState(String state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getNowPage()
	 */
	@Override
	public Long getNowPage() {
		return nowPage;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setNowPage(java.lang.Long)
	 */
	@Override
	public void setNowPage(Long nowPage) {
		this.nowPage = nowPage;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#getSaveTime()
	 */
	@Override
	public String getSaveTime() {
		return saveTime;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#setSaveTime(java.lang.String)
	 */
	@Override
	public void setSaveTime(String saveTime) {
		this.saveTime = saveTime;
	}

	/* (non-Javadoc)
	 * @see com.arvato.demo.model.ITestSubResult#toString()
	 */
	@Override
	public String toString() {
		return "TestSubResult [id=" + id + ", order=" + order + ", keyword=" + keyword + ", other=" + other
				+ ", state=" + state + ", nowPage=" + nowPage + ", saveTime=" + saveTime + "]";
	}



}
