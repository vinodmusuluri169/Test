package com.mkyong.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("Spring-Module.xml");
		 * 
		 * HelloWorld obj = (HelloWorld) context.getBean("helloBean"); obj.printHello();
		 */
    	BeanFactory addressBeanFactory =  new XmlBeanFactory(new ClassPathResource("Spring-Module2.xml"));
    	Resource res = new ClassPathResource("Spring-Module.xml");
    	BeanFactory factory = new XmlBeanFactory(res,addressBeanFactory);
    	// given above Resource object…
    	
    	Object ob = factory.getBean("helloBean");
    	 HelloWorld obj = (HelloWorld)ob;
    	 obj.printHello();
    	 
    	
     	
     	 User user = (User)factory.getBean("user");
     	 user.printUser();;
    	 
    }
}
