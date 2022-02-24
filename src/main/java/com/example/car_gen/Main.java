package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic=new Honda("red",2009,75,true);
        Lexus rx350=new Lexus("pink", 2019,100,true);
     Toyota supra=new Toyota("blue",2021,85,false);
        System.out.println(civic.getColor());
      System.out.println(rx350.getColor());
       System.out.println(supra.getColor());
        System.out.println(supra.getGasMileage());
        System.out.println(rx350.accelerateSpeed());
        System.out.println(rx350.decelerateSpeed());
        System.out.println(supra.convertToElectric());
    }
}