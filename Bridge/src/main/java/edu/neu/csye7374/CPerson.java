package edu.neu.csye7374;

public class CPerson extends Person {
    public CPerson(ArticulatePersonAPI articulate, AmbulatePersonAPI ambulate) {
        super(articulate, ambulate);
    }

    @Override
    public void manage() {
        System.out.println("CPerson managing.");
    }
}
