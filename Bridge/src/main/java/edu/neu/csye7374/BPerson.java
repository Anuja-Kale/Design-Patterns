package edu.neu.csye7374;

public class BPerson extends Person {
    public BPerson(ArticulatePersonAPI articulate, AmbulatePersonAPI ambulate) {
        super(articulate, ambulate);
    }

    @Override
    public void manage() {
        System.out.println("BPerson managing.");
    }
}
