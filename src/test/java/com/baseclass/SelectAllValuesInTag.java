package com.baseclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllValuesInTag {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();	
	driver.get("https://letcode.in/dropdowns");
	driver.manage().window().maximize();
	//driver.findElements(By.tagName("li"));
	WebElement w = driver.findElement(By.id("superheros"));
	
	Select s = new Select(w);

	List<WebElement> lw = s.getOptions();
	for(WebElement x : lw) {
	System.out.println(x.getText());
	}
	
}
}