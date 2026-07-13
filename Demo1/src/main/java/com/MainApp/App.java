package com.MainApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//       //locating resource
//    	Resource r = new ClassPathResource("config.xml");
//    	
//    	//creation of bean factory
//    	
//    	BeanFactory b = new XmlBeanFactory(r);
//    	
//    	Demo d = b.getBean("d1",Demo.class);
//    	d.show();

		ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		

		
	}
}
