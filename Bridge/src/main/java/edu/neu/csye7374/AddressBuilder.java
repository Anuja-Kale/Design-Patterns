package edu.neu.csye7374;

public class AddressBuilder {
    private String street;
    private String city;
    private int zipCode;

    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setZipCode(int zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Address build() {
        return new Address(street, city, zipCode);
    }
}

class Address {
    private String street;
    private String city;
    private int zipCode;

    public Address(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: " + street + ", " + city + ", " + zipCode;
    }
}
