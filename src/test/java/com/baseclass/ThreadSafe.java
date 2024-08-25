package com.baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreadSafe {
	public static void main(String[] args) {
		System.out.println("Start main");
		SampleThread s1 = new SampleThread("Thread_1");
		SampleThread s2 = new SampleThread("Thread_2");
		SampleThread s3 = new SampleThread("Thread_3");
		SampleThread s4 = new SampleThread("Thread_4");
		SampleThread s5 = new SampleThread("Thread_5");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		
		System.out.println("End main");
		
	}
}

class SampleThread extends Thread {
	String threadMessage;
	public SampleThread(String message) {
		this.threadMessage = message;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(threadMessage);
			try {
				Thread.sleep(1000);				
			} catch (Exception exception) {
				System.out.print("Exception");
				exception.printStackTrace();
			}
		}
	}
}