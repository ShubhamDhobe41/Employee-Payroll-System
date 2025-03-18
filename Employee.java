package com.beans;

abstract class Employee {
    private String name; 
    private int id ;
//constructor
	public Employee(String name,int id) {
		 this.name = name;
		 this.id = id;
	}
//	getters
	 public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
//	abstract method
	 abstract double calculateSalary();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + " Salary=" + calculateSalary() +"]";
	}
	 
	 
     
	 
	 
	 

}
