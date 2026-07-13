package com.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employee;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		
		//use parent="e"
		
//		Employee e = cxt.getBean("emp",Employee.class);
//		
//		System.out.println(e.toString());
		
		
		//abstract is used for not creating objector bean
		
		Employee e = cxt.getBean("emp1",Employee.class);
		System.out.println(e.toString());
		
		
		
		
		 
		 
		

	}

	@Override
	public String toString() {
		return "App []";
	}
}
