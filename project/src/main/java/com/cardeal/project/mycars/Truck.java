package com.cardeal.project.mycars;

import com.cardeal.project.Car.Car;

public class Truck implements Car {
    String owner;
    @Override
    public String getInfo() {
        return "Truck";
    }

    @Override
    public void setOwnerName(String name) {
        this.owner=name;

    }

    @Override
    public String getOwnerName() {
        return owner;
    }
}
