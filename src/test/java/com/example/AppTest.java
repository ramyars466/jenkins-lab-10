package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class AppTest{
    @Test
    public void tesAdd(){
        App app=new App();
        int result=app.add(2,3);
        System.out.println("Running the test 2 amd 3 is :"+result);
        Assert.assertEquals(5,result);
    }
}