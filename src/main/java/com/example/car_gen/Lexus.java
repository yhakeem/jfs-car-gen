package com.example.car_gen;

public class Lexus extends Car {
    //    instance
    private boolean hasLeatherSeats;
//    constuctor

    //    this is your added constuctor
    Lexus(String color,int year,int maxSpeed,boolean hasLeatherSeats){
        //        this is the contructor from the parent class
        super(color,year,maxSpeed);
        this.hasLeatherSeats=hasLeatherSeats;
    }

    //getters
    public boolean getLeatherSeats(){
        return hasLeatherSeats;
    }
    // setters
    public void setLeatherSeats(boolean newLeatherSeats){
        hasLeatherSeats=newLeatherSeats;
    }


}

