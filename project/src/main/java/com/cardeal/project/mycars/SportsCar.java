package com.cardeal.project.mycars;

import com.cardeal.project.Car.Car;

public class SportsCar implements Car {
    String owner;

    @Override
    public String getInfo() {
        return "Sports Car ";
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
