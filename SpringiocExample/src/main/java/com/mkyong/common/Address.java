package com.mkyong.common;

public class Address {
	
	private int id;
	private String area;
	private String userId;
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void printAddress() {
		System.out.println("id: " +id+ " Area: " +area+ " userId: " +userId);
	}
}
