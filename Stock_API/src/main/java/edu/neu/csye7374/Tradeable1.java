package edu.neu.csye7374;

public interface Tradeable1 extends Tradable {
    default int getMetric() {
        return 1; 
    }
}
