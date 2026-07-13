package com.MainApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Entity.Demo;

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
		Demo d = cxt.getBean("d1", Demo.class);

		d.show();
	}
}
