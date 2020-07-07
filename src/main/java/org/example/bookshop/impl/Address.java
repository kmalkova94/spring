package org.example.bookshop.impl;

public class Address {
    private String country;
    private String city;
    private String street;
    private Long index;
    private Long house;
    private Long flat;

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

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getHouse() {
        return house;
    }

    public void setHouse(Long house) {
        this.house = house;
    }

    public Long getFlat() {
        return flat;
    }

    public void setFlat(Long flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return  "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", index=" + index +
                ", house=" + house +
                ", flat=" + flat;
    }
}
