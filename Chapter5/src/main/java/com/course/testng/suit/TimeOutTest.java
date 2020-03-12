package com.course.testng.suit;

import org.testng.annotations.Test;

public class TimeOutTest {


    @Test(timeOut = 3000)//单位为毫秒值
    public void testSucces() throws InterruptedException {
       Thread.sleep ( 2000 );
    }
    @Test(timeOut = 2000)
    public void TestFailed() throws InterruptedException {
        Thread.sleep ( 3000 );
    }
}
