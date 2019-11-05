package com.rs.bean.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecuteApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("Spring-Module.xml");
		School school=(School) context.getBean("schoolBean", School.class);
		System.out.println("Name of the school"+school.getName());
		System.out.println("Board of Education"+school.getBoard());
		context.close();


	}

}
