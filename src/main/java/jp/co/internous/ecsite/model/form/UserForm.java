package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class UserForm implements Serializable{
	
	private int id;
//	private String userName;
	private String fullName;
//	private String password;
	
	public int getId() {
		return id;
	}
//	public String getUserName() {
//		return userName;
//	}
	public String getFullName() {
		return fullName;
	}
//	public String getPassword() {
//		return password;
//	}
	public void setId(int id) {
		this.id = id;
	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
//	public void setPassword(String password) {
//		this.password = password;
//	}

}
