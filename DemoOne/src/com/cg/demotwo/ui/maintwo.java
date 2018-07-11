package com.cg.demotwo.ui;

import com.cg.demotwo.service.Product;

public class maintwo {

	public static void main(String[] args) {

Employee emp= new Employee();
emp.empId=100;
	System.out.println(emp.empId);
	System.out.println(Employee.pf);
Employee.pf=10;
System.out.println(emp.empId);
System.out.println(Employee.pf);
	}}
