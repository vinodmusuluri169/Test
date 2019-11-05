package com.mkyong.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppDemo {

	public static void main(String[] args) {
		
   BeanFactory addressBeanFactory =new XmlBeanFactory(new ClassPathResource("Spring-Module-Address.xml"));
   
   Resource resource =new ClassPathResource("Spring-Module-Address.xml");
   BeanFactory factory =new XmlBeanFactory(resource,addressBeanFactory);
   
   HelloWorld helloworld =(HelloWorld) factory.getBean("helloBean");
   
   helloworld.printHello();
   
   User user =(User) factory.getBean("user");
   user.printUser();



	}

}
