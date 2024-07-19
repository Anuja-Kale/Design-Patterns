package edu.neu.csye7374;

public class EnergyStock extends Stock {
    public EnergyStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(double bid) {
        this.lastBid = bid;
        this.price += bid; 
    }

    @Override
    public int getMetric() {
        return (int) (this.price - 100); 
    }
}

