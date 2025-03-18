package com.beans;

public class PartTimeEmployee extends Employee {
   
	private int hourWork;
    private double hourRates;
    public PartTimeEmployee(String name, int id , int hourWork , double hourRates) {
		super(name, id);
		this.hourWork = hourWork;
		this.hourRates = hourRates;
		
	}
	@Override
	double calculateSalary() {
		
		return hourRates * hourWork ;
	}
    
}
