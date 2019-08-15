package com.automation.practice.selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.practice.others.ExcelDataProvider;

public class TestNGTest {
	
	@DataProvider(name="data")
	public Object[][] getLoginData(){
		Object[][] objAry = {{"test","123"},{"test1","234"}};
		return objAry;
		
	}
	
	@DataProvider(name="data1")
	public Object[][] getLoginData1() throws Exception{
		ExcelDataProvider.openExcel("C:\\Users\\IBM_ADMIN\\Desktop\\Book1.xlsx");
		ExcelDataProvider.getSheet();
		return ExcelDataProvider.getDataAry();
		
	}
	
	@Test(dataProvider="data1")
	public void testData(String name,String pwd) {
		System.out.println(name);
		System.out.println(pwd);
		
	}
	@Parameters({"browser","username"})
	@Test
	public void PrintParameters(String browser,String userName) {
		System.out.println("browser -->" +browser);
		System.out.println("username"+ userName);
	}
	
	@Test(priority=1, invocationCount=5,enabled=false)
	public void sampleTest() {
		System.out.println("Test");
	}
	
	@Test(priority=1, invocationCount=20,enabled=false)
	public void sampleTest1() {
		System.out.println("Test");
	}
	
	@Test(enabled=false)
	public void sampleTest2() {
		System.out.println("Test");
	}
	
	@Test(priority=-1)
	public void printSomething() {
		try {
			int a = 7/0;
		}
		catch(Exception e) {
			System.out.println("Failed to run");
			sampleTest1();
			throw e;
		}
	}

}
