package com.Dharanish.assignment1.Employees;

public class Employee {
	private String name;
    private int employeeId;
    private double salary;
   

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int eId) {
       employeeId = eId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }
}