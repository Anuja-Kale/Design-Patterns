package edu.neu.csye7374;

public class BiotechStock extends Stock {
    public BiotechStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(double bid) {
        this.lastBid = bid;
        this.price *= (1 + bid / 200); 
    }

    @Override
    public int getMetric() {
        return (int) (this.price / 10 - this.lastBid); 
    }
}

