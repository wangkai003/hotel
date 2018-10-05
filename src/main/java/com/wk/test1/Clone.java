package com.wk.test1;

import java.util.Date;

/**
 * 
 * @Title: Clone
 * @描述:克隆 原型模型
 * @author xwang
 * @date:2018年10月3日上午7:51:37
 */
public class Clone implements Cloneable {
	private String name;
	private Date birthday;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		return object;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Clone() {
		super();
	}

	public Clone(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
    
}
