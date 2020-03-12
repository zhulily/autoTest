package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataproviderTest(String name, int age){
        System.out.println ( "name=" + name +", age=" +age );
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object [][]{
                {"账单", 10},
        {"wangwu",20},
        {"李四", 30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println ( "test1 方法 name="+ name +";age=" +age );

    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println ( "test2 方法 name="+ name +";age=" +age );
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName ().equals ( "test1" )){
            result= new Object[][]{
                    {"zhangsna",20},
                    {"lisi",25}

            };
        }else if(method.getName ().equals ( "test2" )){
            result = new Object[][]{
                    {"ZHAOLIU", 60},
                    {"WANGWU", 50}
            };
        }
        return result;
    }
}
