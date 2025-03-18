package com.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PaysRollSystem {
	Scanner sc = new Scanner(System.in);
//	create ArrayList 
	private ArrayList<Employee> empList;

	public PaysRollSystem() {
		empList = new ArrayList<Employee>();
	}

//	add employee
	public void addEmployee(Employee employee) {
		empList.add(employee);
	}

//	remove employee 
	public void removeEmployee(int id) {
		Employee employeeRemove = null;

//		check employee id and who's remove employee id are same or not
		for (Employee emp : empList) {
			if (emp.getId() == id) {
//				if found who are remove employee then put in ' employeRremove ' variable
				employeeRemove = emp;
				break;
			}

		}
		if (employeeRemove != null) {
			empList.remove(employeeRemove);
		} else {
			System.out.println("Employee Is Not Available");
		}
	}

	public void displayEmployee() {
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
