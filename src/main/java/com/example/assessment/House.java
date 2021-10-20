package com.example.assessment;

public class House {

    private String name;
    private String address;
    private String numRooms;

    public House(String name, String address, String numRooms) {
        this.name = name;
        this.address = address;
        this.numRooms = numRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(String numRooms) {
        this.numRooms = numRooms;
    }
}