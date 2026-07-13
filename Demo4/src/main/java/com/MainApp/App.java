package com.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Entity.Employee;
import com.Example.Config;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
		Employee e = cxt.getBean(Employee.class);
		
		e.showDetails();
		
		
		
		
		
		 
		 
		

	}
}
