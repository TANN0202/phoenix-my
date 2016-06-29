package com.arvatosystems.demo.dto;

import com.arvatosystems.demo.service.api.idto.IUser;

public class User implements java.io.Serializable, IUser{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	protected Long id;

	/**
	 * 姓名
	 */
	protected String name;
	
	/**
	 * 年龄
	 */
	protected Integer age;
	
	/**
	 * 构造函数
	 */
	public User() {
		super();
	}
	
	/**
	 * 构造函数
	 * @param id
	 * @param name
	 * @param age
	 */
	public User(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * @see com.arvato.demo.model.IUser#getName()
	 */
	@Override
	public String getName() {
		return name;
	}


	/**
	 * @see com.arvato.demo.model.IUser#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see com.arvato.demo.model.IUser#getAge()
	 */
	@Override
	public Integer getAge() {
		return age;
	}

	/**
	 * @see com.arvato.demo.model.IUser#setAge(java.lang.Integer)
	 */
	@Override
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @see com.arvato.demo.model.IUser#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/**
	 * @see com.arvato.demo.model.IUser#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @see com.arvato.demo.model.IUser#toString()
	 */
	@Override
	public String toString() {
		return "User: [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
