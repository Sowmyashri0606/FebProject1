package com.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent1Report {
public static ExtentSparkReporter sparkReport = null;
public static ExtentReports extentReport =null;
public static ExtentTest extentTest =null;
public static String location = System.getProperty(("user.dir")+"/reports/test_report.html");
}

