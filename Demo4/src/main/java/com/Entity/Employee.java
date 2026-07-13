package com.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id=101;
	String name="prajakta";
	double salary=1000.0;
	
	@Autowired
	Address address;

	public void showDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
	}
	
	
	

}
