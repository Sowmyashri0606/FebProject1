package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookClass extends BaseClass{
	 @Before
 	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qatest.uat.cloudbankin.com/");		
}
}