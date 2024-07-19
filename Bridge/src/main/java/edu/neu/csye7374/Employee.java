package edu.neu.csye7374;

public class Employee extends Person implements EmployeeAPI {
    public Employee(ArticulatePersonAPI articulate, AmbulatePersonAPI ambulate) {
        super(articulate, ambulate);
    }

    @Override
    public void work() {
        System.out.println("Working as an employee.");
    }

    @Override
    public void manage() {
        System.out.println("Managing an employee.");
    }
}
