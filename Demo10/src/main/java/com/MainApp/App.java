package com.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employee;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		
		//AbstractApplicationContext cxt= new ClassPathXmlApplicationContext("config.xml");
		Employee e = cxt.getBean("e",Employee.class);
		e.setId(102);
		System.out.println(e.toString());
		
		//Scope using prototype---object created per created object (for e1,e2,e3) in spring container
		Employee e1 = cxt.getBean("e",Employee.class);
		System.out.println(e1.toString());
		
		
		Employee e2 = cxt.getBean("e",Employee.class);
		e2.setId(401);
		System.out.println(e2.toString());
		
		
		
		//cxt.registerShutdownHook();
		
		
		
		 
		 
		

	}

	@Override
	public String toString() {
		return "App []";
	}
}
