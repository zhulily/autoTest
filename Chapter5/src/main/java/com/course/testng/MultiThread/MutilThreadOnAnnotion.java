package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MutilThreadOnAnnotion {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println ( 1 );
        System.out.printf ( "Thread Id :%s%n" ,Thread.currentThread ().getId () );
    }
}
