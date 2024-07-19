package edu.neu.csye7374;

public class APerson extends Person {
    public APerson(ArticulatePersonAPI articulate, AmbulatePersonAPI ambulate) {
        super(articulate, ambulate);
    }

    @Override
    public void manage() {
        System.out.println("APerson managing.");
    }
}
