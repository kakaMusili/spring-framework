package com.kamutech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements VehicleI {

    @Autowired
    private  Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive()
    {
        System.out.println("Am driving .... and  " + tyre);
       // welcome();
    }

    private void  welcome(){
        System.out.println("Private method");
    }
}
