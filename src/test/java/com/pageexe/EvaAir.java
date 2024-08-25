package com.pageexe;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EvaAir {
	@BeforeClass
	public static void preconditions() {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.evaair.com/en-global/index.html");
	}
	@Test
	public void execution() {
		System.out.println("Book a ticket");
	}
}
