package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    // 最基本的注解， 用来把方法标记测试的一部分
    @Test
    public void testCase1(){
        System.out.println ( "这是测试用例1" );
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试方法2");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("BeforeMethod这是在方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在方法之后运行的");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println ( "BeforeClass 这是在类运行之前运行" );
    }
    @AfterClass
    public void afterClass(){
        System.out.println ( "AfterClass 这是在类运行之后运行" );
    }
    @BeforeSuite
    public void beforSuit(){
        System.out.println ( "BeforeSuite 测试套件之前" );
    }
    @AfterSuite
    public void AfterSuit(){
        System.out.println ( "AfterSuite 测试套件之前"  );
    }
    @BeforeTest
    public void beforTest(){
        System.out.println ( "BeforeTest" );
    }
    @AfterTest
    public void AfterTest(){
        System.out.println ( "AfterTest" );
    }
}
