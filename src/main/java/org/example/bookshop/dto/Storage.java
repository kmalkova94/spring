package org.example.bookshop.dto;

import org.example.bookshop.enums.StoragePlace;

public class Storage {
    private Long id;
    private StoragePlace placeid;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StoragePlace getPlaceid() {
        return placeid;
    }

    public void setPlaceid(StoragePlace placeid) {
        this.placeid = placeid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
