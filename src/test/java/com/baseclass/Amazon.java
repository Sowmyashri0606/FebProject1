package com.baseclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.get("https://www.amazon.in/");
WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
element.sendKeys("iphone");
WebElement ele = driver.findElement(By.xpath("//input[@id ='nav-search-submit-button']"));
ele.click();

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scroll(0,500)");


WebElement mob = driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
mob.click();
//String parentWindow = driver.getWindowHandle();
//driver.switchTo().window(parentWindow);
js.executeScript("window.scroll(0,-500)");


WebElement cart = driver.findElement(By.xpath("//a [@id='nav-cart']"));
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
cart.click();
WebElement addCart = driver.findElement(By.xpath("//input[@value='Go']"));
addCart.click();


//driver.close();

}
}