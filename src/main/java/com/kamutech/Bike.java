package com.kamutech;

import org.springframework.stereotype.Component;

@Component
public class Bike implements VehicleI {

    private void ride(){
        System.out.println(" am Riding a bike");
    }

    @Override
    public void drive() {
        ride();
    }
}
