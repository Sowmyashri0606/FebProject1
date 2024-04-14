package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPage_Locator extends BaseClass {
		
		public static WebElement getUser() {
			return driver.findElement(By.id("username"));			
		}
		
		public static WebElement getPass() {
			return driver.findElement(By.id("password"));	
		}

		public static WebElement getLogin() {
			return driver.findElement(By.id("login"));	
		}
	}

