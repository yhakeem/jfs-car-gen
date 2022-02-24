package com.example.car_gen;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Car{
    //instance fields
    private String color;
    private int year;
    private int speed=15;
    private int maxSpeed;
    private boolean isElectric;
//   parent constuctor

    public Car(String color,int year,int maxSpeed){
this.color=color;
this.year=year;
this.maxSpeed=maxSpeed;
    }
//    methods
    public int accelerateSpeed(){

        if(this.speed-5<maxSpeed){
        }else{
            System.out.println("You have reached maxiumum speed");
        }
        System.out.print("Your Speed is:");
        return this.speed + 5;
    }

    public int decelerateSpeed(){

        if(this.speed <= 0 ){
            System.out.print("You have reached minimum speed:");
            return this.speed;
        }else{
            System.out.print("You slowed down, your Speed is:");
        }
        return this.speed - 5;
    }

    public boolean convertToElectric(){

        if(this.isElectric==true){
            System.out.println("Your car is already electric");
        }else{
            System.out.println("Aye your car is now electric!");
        }
        return true;
    }



    //    getters
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }

    public int getSpeed(){
        return speed;
    }
    public int getmaxSpeed(){
        return maxSpeed;
    }
    public boolean getElectric(){
        return isElectric;
    }

    //    setters
    public void setColor(String newColor){
        color=newColor;
    }
    public void setYear(int newYear){
        year=newYear;
    }

    public void setSpeed(int newSpeed){
        speed=newSpeed;
    }
    public void setMaxSpeed(int newMaxSpeed){
        maxSpeed=newMaxSpeed;
    }
    public void setElectric(boolean newElectric){
        isElectric=newElectric;
    }


}

