package com.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ImplementMethods implements ITestListener {
	

	@Override
	public void onStart(ITestContext context) {
		Extent_Report.getInstance();
	}
	@Override
	public void onTestStart(ITestResult result) {
		Extent_Report.createReportTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Extent_Report.extentTest.log(Status.PASS, "Test Case Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Extent_Report.extentTest.log(Status.FAIL, "Test Case Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Extent_Report.extentTest.log(Status.SKIP, "Test Case Skipped");
	}
	@Override
	public void onFinish(ITestContext context) {
		Extent_Report.flushreport();
	}
}
