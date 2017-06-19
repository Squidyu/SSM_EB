package com.squid.bean;

/**
 * @author Squid
 *出版社
 */
public class Publish {
	private long id;
	private String name;//出版商
	public Publish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publish(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Publish [id=" + id + ", name=" + name + "]";
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
