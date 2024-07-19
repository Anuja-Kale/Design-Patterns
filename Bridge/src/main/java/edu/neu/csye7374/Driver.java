package edu.neu.csye7374;

public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        // Implementations for the behaviors (articulate and ambulate)
        ArticulatePersonAPI articulate = () -> System.out.println("Articulating a person.");
        AmbulatePersonAPI ambulate = () -> System.out.println("Ambulating a person.");

        // Creating instances of APerson, BPerson, and CPerson
        Person aPerson = new APerson(articulate, ambulate);
        Person bPerson = new BPerson(articulate, ambulate);
        Person cPerson = new CPerson(articulate, ambulate);

        // Managing different person types
        aPerson.manage();
        bPerson.manage();
        cPerson.manage();

        // Demonstrating the different behaviors
        aPerson.performArticulate();
        bPerson.performAmbulate();
        cPerson.performArticulate();

        // Creating and managing an Employee
        Employee employee = new Employee(articulate, ambulate);
        employee.manage();
        employee.work();
        employee.performAmbulate();

        // Using the AddressBuilder to create an Address object
        Address address = new AddressBuilder().setStreet("123 Main St")
                                              .setCity("Cityville")
                                              .setZipCode(12345)
                                              .build();
        System.out.println(address);

        System.out.println("\n\n============Main Execution End===================");
    }
}
