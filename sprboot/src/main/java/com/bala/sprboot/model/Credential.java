package com.bala.sprboot.model;

public class Credential {
	
	String un;
	String pwd;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Credential [un=" + un + ", pwd=" + pwd + "]";
	}
	
	
	

}
