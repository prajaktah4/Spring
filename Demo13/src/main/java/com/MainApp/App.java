package com.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employee;

public class App {
	public static void main(String[] args) {
		
		
		//autowired by using constructor initialized---by constructor
		ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		Employee e = cxt.getBean("e",Employee.class);
		
		System.out.println(e.toString());
		

	}

	@Override
	public String toString() {
		return "App []";
	}
}
