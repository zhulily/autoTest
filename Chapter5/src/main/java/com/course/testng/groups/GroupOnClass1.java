package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {


    public void stu1(){
        System.out.println ( "GroupOnClass1中的Stu1运行" );
    }

    public void stu2(){
        System.out.println ( "GroupOnClass1中的Stu2运行" );
    }
}
