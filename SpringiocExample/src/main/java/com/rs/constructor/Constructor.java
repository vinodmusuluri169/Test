package com.rs.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Constructor {

	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module3.xml");
		Resource resource = new ClassPathResource("Spring-Module3.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		DemoBean obj = (DemoBean) factory.getBean("demo");
		obj.display();
		DemoBean obj1 = (DemoBean) factory.getBean("demo1");
		obj1.printStudent();
		
		
		
		
		

	}

}
