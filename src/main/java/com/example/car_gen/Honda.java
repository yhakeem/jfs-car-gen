package com.example.car_gen;

public class Honda extends Car {
    //    instance
    private boolean  isTurboCharged;
//    constuctor

    //    this is your added constuctor
    public Honda(String color,int year,int maxSpeed,boolean isTurboCharged){
        //        this is the contructor from the parent class
        super(color,year,maxSpeed);
        this.isTurboCharged= isTurboCharged;
    }

    //getters


    public boolean getTurboCharged(){
        return isTurboCharged;
    }
    // setters
    public void setTurboCharged(boolean newTurbo){
        isTurboCharged=newTurbo;
    }

}
