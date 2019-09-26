package com.codecool.simpleCustomerRestService.domain;

public class Address {

    private static Long idSequence = 0L;

    public static Long getSequence() {
        return idSequence++;
    }

    private Long id;
    private String country;
    private String city;
    private String street;
    private String zip;

    public Address(long id, String country, String city, String street, String zip) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
