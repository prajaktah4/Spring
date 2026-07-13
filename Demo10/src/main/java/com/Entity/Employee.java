package com.Entity;


public class Employee {
	
	int id=101;
	String name="prajakta";
	double salary=1000.0;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	
	

}
