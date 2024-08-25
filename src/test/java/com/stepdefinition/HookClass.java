package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import io.cucumber.java.Before;

public class HookClass extends BaseClass{
	@Before
	public static void url() {	
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.evaair.com/en-global/index.html");

	}
}
