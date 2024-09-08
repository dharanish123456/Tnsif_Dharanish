package com.Dharanish.assignment1;

import com.Dharanish.assignment1.Employees.Developer;
import com.Dharanish.assignment1.Employees.Manager;
import com.Dharanish.assignment1.Utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);
    }
}
