package com.wk.annotation;
/**
 * 
 * @Title: Deno2
 * @描述:
 * @author xwang
 * @date:2018年10月3日下午1:58:08
 */
@MyAnnotation2("tb_user")
public class Deno2 {
     
	@Setfield(columnName="id",type="int",length=10)
	private int id;
	@Setfield(columnName="username",type="varchar",length=20)
	private String username;
	@Setfield(columnName="password",type="varchar",length=20)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Deno2(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Deno2() {
		super();
	}
	
}
