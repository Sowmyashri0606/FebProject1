package com.baseclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/capitals-of-the-world.html");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	  
		List<WebElement>table =driver.findElements(By.xpath("//table[1]//td[1]"));
		System.out.println(table.size());
		for (WebElement tab : table) {
			//System.out.println(tab.getText());
			if(tab.equals("India")) {
				System.out.println(driver.findElement(By.xpath("//table[1]//td[2]")).getText());
				
			}
		}
		driver.close();
}
}



