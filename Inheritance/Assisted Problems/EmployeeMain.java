package com.inheritance;

public class EmployeeMain {
	    public static void main(String[] args) {
	        Employee e1 = new Manager("RINI", 101, 90000, 5);
	        Employee e2 = new Developer("ANUSHKA", 102, 60000, "Java");
	        Employee e3 = new Intern("KRISH", 103, 20000, "6 months");

	        e1.displayDetails();
	        e2.displayDetails();
	        e3.displayDetails();
	    }
}
