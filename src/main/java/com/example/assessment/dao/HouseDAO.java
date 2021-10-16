package com.example.assessment.dao;

import com.example.assessment.House;

import java.util.ArrayList;
import java.util.List;

public class HouseDAO {
    private List<House> houses = new ArrayList();

    public HouseDAO() {
        House h2 = new House("Ray", "Clara", "5");
        House h3 = new House("Jack", "Tullowickey", "4");
        House h4 = new House("Ben", "Moate", "7");

        houses.add(h2);
        houses.add(h3);
        houses.add(h4);
    }

    public void addNewHouse(House h) {
        houses.add(h);
    }

    public List<House> houses() {
        return houses;
    }
}
