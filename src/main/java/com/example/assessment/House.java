package com.example.assessment;

public class House {

    private String owner;
    private String address;
    private String numRooms;

    public House(String owner, String address, String numRooms) {
        this.owner = owner;
        this.address = address;
        this.numRooms = numRooms;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
