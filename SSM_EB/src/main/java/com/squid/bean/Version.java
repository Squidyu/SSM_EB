package com.squid.bean;

public class Version {
	private long id;
	private String name;//版本民称
	public Version() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Version(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Version [id=" + id + ", name=" + name + "]";
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
