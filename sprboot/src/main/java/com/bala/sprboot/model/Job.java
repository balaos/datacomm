package com.bala.sprboot.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Job {
	
	int jobid;
	String workType;
	String serviceType;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}
	public Job(int jobid, String workType, String serviceType) {
		super();
		this.jobid = jobid;
		this.workType = workType;
		this.serviceType = serviceType;
	}
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
}
