package com.rs.bean.lifecycle;

public class School {
	private String name;
	private String Board;
	School(){
		System.out.println("Constructor of school bean is invoked.");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoard() {
		return Board;
	}
	public void setBoard(String board) {
		Board = board;
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing method of school bean is invoked"); }
	
	public void destroy()throws Exception{
		System.out.println("Destory method of school bean is invoked!"); }
	
	
	  public void init()throws Exception{
	  System.out.println("Init method of school bean is invoked."); }
	 
	
	}
	

	
	


