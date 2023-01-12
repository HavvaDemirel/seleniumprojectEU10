package com.cydeo.tests.day5_TestNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @AfterClass
    public void setupMethod(){

        System.out.println("----->After class is running!!");
    }
    @BeforeClass
    public void tearDownClass(){

        System.out.println("----->Before class is running!");
    }
    @BeforeMethod
    public void setUpMethod(){

        System.out.println("---> BeforeMethod is running!");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> After method is running!");

    }
    @Test
    public void test1() {
        System.out.println("Test 1 is running...");
        //Asset equals: we compare 2 same things
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2() {
        //Assert true: accept boolean value returns true or false
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));
        System.out.println("Test 2 is running...");
    }



}
