package edu.neu.csye7374;

public interface Tradeable0 extends Tradable {
    default void setBid(double bid) {
        System.out.println("Setting bid via Tradeable0: " + bid);
    }

    default int getMetric() {
        return 0; 
    }
}

