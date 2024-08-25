package com.javaset;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Text {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Employee Name");
		String name=s.nextLine();

		System.out.println("Enter Employee Age");
		byte age=s.nextByte();

		System.out.println("Enter Employee Father Name");
		String fatherName=s.next();


		System.out.println("Employee name is : "+name);
		System.out.println("Employee age is : "+age);
		System.out.println("Employee Father Name is : "+fatherName);
	}
}
