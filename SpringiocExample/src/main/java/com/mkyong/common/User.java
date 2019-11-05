package com.mkyong.common;

public class User {

	private int id;
	private String fullname;
	private Address address;

	User(int id, String fullname) {
		this.id = id;
		this.fullname = fullname;
	}
	
	/*
	 * User(int id, String fullname, Address address) { this.id = id; this.fullname
	 * = fullname; this.address = address; }
	 */
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printUser() {
		System.out.println("id: " + id + " and fullname:" + fullname);
/*		if (address != null) {
			address.printAddress();
*/		
		}
	}


