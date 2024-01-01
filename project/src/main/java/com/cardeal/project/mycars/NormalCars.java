package com.cardeal.project.mycars;

import com.cardeal.project.Car.Car;
import com.cardeal.project.modification.Tyre;

public class NormalCars implements Car {
    String owner;
    Tyre tyre;
    public NormalCars(Tyre tyre){
        this.tyre=tyre;
    }
    @Override
    public String getInfo() {
        return "family car" +tyre.getTyreinfo();
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
