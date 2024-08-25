package com.practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitPrac {
	public static void main(String[] args) {
		
	
WebDriver driver = new ChromeDriver();
WebElement element = driver.findElement(By.xpath(" "));

//implicit wait - deprecated
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//new one
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//explicit wait
//xpath
WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(" "))));
//element
w.until(ExpectedConditions.elementToBeClickable(element)); //(driver.findElement(By.xpath(" ")))));

//fluent wait
Wait wait = new FluentWait(driver)
.withTimeout(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(1))
.ignoring(Exception.class);

}
}