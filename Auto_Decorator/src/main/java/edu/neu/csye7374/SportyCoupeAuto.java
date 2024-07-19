package edu.neu.csye7374;

public class SportyCoupeAuto implements AutoAPI {
    @Override
    public double getPrice() {
        return 20000; // Base price of the Sporty Coupe
    }

    @Override
    public String getDescription() {
        return "Sporty Coupe";
    }
}
