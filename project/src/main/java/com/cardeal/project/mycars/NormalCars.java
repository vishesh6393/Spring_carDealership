package com.cardeal.project.mycars;

import com.cardeal.project.Car.Car;

public class NormalCars implements Car {
    String owner;
    @Override
    public String getInfo() {
        return "family car";
    }
    @Override
    public void setOwnerName(String name) {
        this.owner = name;

    }
    @Override
    public String getOwnerName() {
        return owner;
    }
}
