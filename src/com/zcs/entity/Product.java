package com.zcs.entity;

import org.springframework.stereotype.Controller;

@Controller
public class Product {
	private Integer pid;
	private String pname;
	private Double jiage;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getJiage() {
		return jiage;
	}
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	
	
}
