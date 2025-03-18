package com.main;

import com.beans.FullTimeEmployee;
import com.beans.PartTimeEmployee;
import com.beans.PaysRollSystem;

public class Main {
	public static void main(String[] args) {
		PaysRollSystem payRollSystem = new PaysRollSystem();
		FullTimeEmployee fullTimeEmp = new FullTimeEmployee("vikas",1,23213);
		PartTimeEmployee partTimeEmp = new PartTimeEmployee("Rajsh", 2, 40, 200);
		
		
		payRollSystem.addEmployee(fullTimeEmp);
		payRollSystem.addEmployee(partTimeEmp);
		
		System.out.println("Employee Details :");
		payRollSystem.displayEmployee();
		
		System.out.println("Remove Employee : ");
		payRollSystem.removeEmployee(2);
		
		System.out.println("Employee Details : ");
		payRollSystem.displayEmployee();
		
		
	}

}
