package com.Entity;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	String city="pune";
	String street="daund-pune";
	
	public String getAddress()
	{
		return street +""+city;
		
	}
	
	
	
	
	
	

}
