package com.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employee;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		Employee e = cxt.getBean("e",Employee.class);
		
		System.out.println(e.getId()+""+e.getName()+""+e.getSalary()+""+e.getAdd());
		System.out.println(e.getAdd().getPin()+""+e.getAdd().getCity());
		
		
		
		
		 
		 
		

	}

	@Override
	public String toString() {
		return "App []";
	}
}
