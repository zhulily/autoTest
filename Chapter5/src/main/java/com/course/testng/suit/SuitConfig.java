package com.course.testng.suit;

import org.testng.annotations.*;

public class SuitConfig {
    @BeforeSuite
    public void beforSuit(){
        System.out.println ( "before suit运行啦！" );
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println ( "After suite 运行啦" );
    }
    @BeforeTest
    public void beforetest(){
        System.out.println ( "BeforeTest 运行啦" );
    }
    @AfterTest
    public void Aftertest(){
        System.out.println ( "AfterTest 运行啦" );
    }
}
