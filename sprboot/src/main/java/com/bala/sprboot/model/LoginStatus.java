package com.bala.sprboot.model;

public class LoginStatus {
	String statusCode;
	String statusDesc;
	public LoginStatus(String sc, String sd) {
		// TODO Auto-generated constructor stub
		this.statusCode = sc;
		this.statusDesc = sd;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	

}
