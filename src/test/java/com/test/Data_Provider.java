package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class Data_Provider extends BaseClass{
@Test(dataProvider = "testdata1")
public void test1(String data1,String data2){
	System.out.println(data1);
	System.out.println(data2);
	
}
@Test(dataProvider ="testdata2")
public void test2(String data1,String data2) {
	System.out.println(data1);
	System.out.println(data2);
}


@DataProvider (name="testdata1")
public Object[][] dp(){
	return new Object[][] {{excelRead(0,0),excelRead(0,1)}};
}
@DataProvider (name="testdata2")
public Object[][] dpro(){
	return new Object[][] {{excelRead(0,2),excelRead(0,3)}};
}	

}
