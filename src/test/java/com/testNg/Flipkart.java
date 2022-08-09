package com.testNg;

import org.testng.annotations.Test;

import com.utility.LibraryFunctions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Flipkart extends LibraryFunctions{
    @Test(priority= -1)
    public void VisitAmazon() {
        driver.navigate().to(ObjProperties.getProperty("flipkart"));
        driver.manage().window().maximize();

    } 
    @Test(priority= 0)
    public void ValidatePageTitle() {
        String pageTilte = driver.getTitle();
        System.out.println("Page Title is: "+pageTilte);
        Assert.assertEquals(pageTilte, ObjProperties.getProperty("Title"));
    } 
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("inside beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("inside afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("inside beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("inside afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("inside beforeTest");
        LibraryFunctions.LaunchBrowser();
    }

    @AfterTest
    public void afterTest() {
        System.out.println("inside afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("inside beforeSuite");
        try {
            LibraryFunctions.ReadPropertiesFile();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("inside afterSuite");
    }
}