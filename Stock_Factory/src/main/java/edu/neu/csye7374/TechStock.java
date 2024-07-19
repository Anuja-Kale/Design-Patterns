package edu.neu.csye7374;

public class TechStock extends Stock {
    public TechStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(double bid) {
        this.lastBid = bid;
        this.price *= (1 + bid / 50); 
    }

    @Override
    public int getMetric() {
        return (int) (this.price / 5 - this.lastBid); 
    }
}

