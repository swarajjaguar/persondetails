package com.persondetails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	private int id;
	private String name;
	private String address;
	private long phn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	
	

}
