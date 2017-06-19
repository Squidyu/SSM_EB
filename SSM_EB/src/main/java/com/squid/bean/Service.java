package com.squid.bean;

public class Service {
	private long id;
	private String name;//服务名
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", name=" + name + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
