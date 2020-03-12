package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {

    public void stu1(){
        System.out.println ( "GroupOnClass2中的Stu1运行" );
    }


    public void stu2(){
        System.out.println ( "GroupOnClass2中的Stu2运行" );
    }

    public void stu3(){
        System.out.println ( "GroupOnClass2中的Stu3运行" );
    }
}
