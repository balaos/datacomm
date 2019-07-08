package com.bala.sprboot.model;

public class Response<T> {
	String status;
	String statusDesc;
	String action;
	T payload;
	public Response(String status, String statusDesc, String action, T payload) {
		super();
		this.status = status;
		this.statusDesc = statusDesc;
		this.action = action;
		this.payload = payload;
	}
	
	
	

}
