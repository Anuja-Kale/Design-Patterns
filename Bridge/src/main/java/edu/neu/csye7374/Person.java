package edu.neu.csye7374;

public abstract class Person implements PersonAPI {
    protected ArticulatePersonAPI articulateBehavior;
    protected AmbulatePersonAPI ambulateBehavior;

    public Person(ArticulatePersonAPI articulate, AmbulatePersonAPI ambulate) {
        this.articulateBehavior = articulate;
        this.ambulateBehavior = ambulate;
    }

    public void performArticulate() {
        articulateBehavior.articulate();
    }

    public void performAmbulate() {
        ambulateBehavior.ambulate();
    }

    @Override
    public void manage() {
        System.out.println("Managing a person.");
    }
}
