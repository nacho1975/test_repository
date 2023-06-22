package com;

public class Manager extends Employee{

	private int numberOfEmp;
	
	void setManager(int id,String name, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	
	void disManager() {
		System.out.println("Manager details");
	}

}
