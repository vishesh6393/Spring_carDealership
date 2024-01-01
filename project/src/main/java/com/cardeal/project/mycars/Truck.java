package com.cardeal.project.mycars;

import com.cardeal.project.Car.Car;
import com.cardeal.project.modification.Tyre;

import java.util.TreeMap;

public class Truck implements Car {
    String owner;
    Tyre tyre;
    public  Truck(Tyre tyre){
        this.tyre= tyre;
    }
    @Override
    public String getInfo() {
        return "Truck"+tyre.getTyreinfo();
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
