package com.example.car_gen;

public class Toyota extends Car {
    //    instance field
    private boolean greatGasMileage;
//    constructor

    //    this is your added constuctor
    public Toyota(String color,int year,int maxSpeed,boolean greatGasMileage){
//        this is the contructor from the parent class
        super(color,year,maxSpeed);
        this.greatGasMileage=greatGasMileage;

    }

    //getters
    public boolean getGasMileage(){
        return greatGasMileage;
    }
    // setters
    public void setGasMileage(boolean newGas){
        greatGasMileage=newGas;
    }
}

