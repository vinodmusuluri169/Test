package com.mkyong.common;

import java.util.List;
import java.util.Map;

public class HelloWorld {
	private String name;
	private int id;	
	private Map studentsData;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setStudentsData(Map studentsData) {
		this.studentsData = studentsData;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);

		if (studentsData != null) {
			System.out.println("Total Students are :" + studentsData.size());
			for (Object student : studentsData.entrySet()) {
				System.out.println(student);
			}
		}
	}
}
