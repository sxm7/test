package com.zcs.entity;

import java.util.List;

import org.springframework.stereotype.Controller;
@Controller
public class Fenye {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<Product> rows;
	
	private String pname;
	private Double startjiage;
	private Double eddjiage;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<Product> getRows() {
		return rows;
	}
	public void setRows(List<Product> rows) {
		this.rows = rows;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getStartjiage() {
		return startjiage;
	}
	public void setStartjiage(Double startjiage) {
		this.startjiage = startjiage;
	}
	public Double getEddjiage() {
		return eddjiage;
	}
	public void setEddjiage(Double eddjiage) {
		this.eddjiage = eddjiage;
	}
	
}
