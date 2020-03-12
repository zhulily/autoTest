package com.course.testng.suit;

import org.testng.annotations.Test;

public class ExpectedException {


    /*
    * 什么时候系统会报异常
    * **/
    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeExceptionFail(){
        System.out.println ( "这是一个代码异常测试失败------" );
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucc(){
        System.out.println ( "这是一段代码异常测试成功" );
        throw new RuntimeException (  );
    }
}
