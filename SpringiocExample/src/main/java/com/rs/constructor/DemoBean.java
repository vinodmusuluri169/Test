
package com.rs.constructor;

import java.util.List;

public class DemoBean {
	   public String uname, password;
	   public List<String> studentData;
	   
	    public DemoBean (String uname, String password)
	    {
	         this.uname = uname;
	         this.password = password;
	    }
	    public DemoBean(List<String> studentData) {
			super();
			this.studentData = studentData;
		}

		public void display() {
	    	System.out.println("myuserName:"+uname+ " and password:"+password);
		}
		public void printStudent() {	
			if(studentData != null) {
	    		System.out.println("size of list:"+studentData.size());
	    		for(String students:studentData) {
	    			System.out.println(students);
	    		}
	    	}	
			
		}
	}


