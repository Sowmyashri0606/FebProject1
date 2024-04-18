package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dataprovider_excel {
	
			WebDriver driver = null;
			
			@BeforeTest
			public void beforetest()
				{
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://adactinhotelapp.com/");
				}
			
			@Test (dataProvider = "testData" , dataProviderClass = Dataprovider_GetExcelData.class)
			public void logIn(String userName, String passWord)
			{
				try
					{
						driver.findElement(By.cssSelector("input#username")).sendKeys(userName);
						driver.findElement(By.cssSelector("input#password")).sendKeys(passWord);
						Thread.sleep(1000);
						driver.findElement(By.cssSelector("input#login")).click();
						Thread.sleep(2000);
					}
				catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
			
			@AfterTest
			public void afterTest()
			{
				driver.close();
			}
		}


