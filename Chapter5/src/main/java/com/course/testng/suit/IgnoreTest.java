package com.course.testng.suit;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ingonre1(){
        System.out.println ( "ignore1 执行1" );
    }
    @Test(enabled = false)
    public void igonre2(){
        System.out.println ( "ignore2 执行2" );
    }
    @Test(enabled = true)
    public void test3(){
        System.out.println ( "ignore2 执行3" );
    }
}
