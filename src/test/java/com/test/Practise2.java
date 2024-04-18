package com.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Practise2 implements IRetryAnalyzer{
	
	int min =1;
	int max =5;

	@Override
	public boolean retry(ITestResult result) {
		if (min<max) {
			min++;
			return true;
		}
		return false;
	}
}
