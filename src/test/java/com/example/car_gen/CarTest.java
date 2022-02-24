package com.example.car_gen;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CarTest {
    Honda civic= new Honda("green",2008,89,false);
    @Test
   public void testAccelerateSpeed(){
        Assert.assertEquals(20,civic.accelerateSpeed());
   }

    @Test
    public void testDecelerateSpeed(){
        Assert.assertEquals(10,civic.decelerateSpeed());
    }

    @Test
    public void testConverToElectric(){
        Assert.assertEquals(true,civic.convertToElectric());
    }
}


