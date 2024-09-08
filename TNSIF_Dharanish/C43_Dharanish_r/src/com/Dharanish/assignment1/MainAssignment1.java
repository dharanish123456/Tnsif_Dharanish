package com.Dharanish.assignment1;

import com.Dharanish.assignment1.Employees.Developer;
import com.Dharanish.assignment1.Employees.Manager;
import com.Dharanish.assignment1.Utilities.EmployeeUtilities;

public class MainAssignment1 {

	public static void main(String[] args) {
		Manager manager = new Manager();
        manager.setName("Tom");
        manager.setEmployeeId(100);
        manager.setSalary(50000);
        manager.setDepartment("developer");

        
        Developer developer = new Developer();
        developer.setName("Virat");
        developer.setEmployeeId(18);
        developer.setSalary(100000000);
        developer.setSkills("Java"); 

        
        EmployeeUtilities.displayManagerInfo(manager);
        System.out.println();
        EmployeeUtilities.displayDeveloperInfo(developer);
        System.out.println();
	}

}