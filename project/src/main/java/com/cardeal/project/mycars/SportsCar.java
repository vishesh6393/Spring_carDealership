package com.cardeal.project.mycars;

import com.cardeal.project.Car.Car;
import com.cardeal.project.modification.Tyre;

public class SportsCar implements Car {
    String owner;
    Tyre tyre;

    public SportsCar(Tyre tyre){
        this.tyre=tyre;
    }
    @Override
    public String getInfo() {
        return "Sports Car "+tyre.getTyreinfo();
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
