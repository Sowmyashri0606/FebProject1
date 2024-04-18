package com.test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class Extent_Report {
		
		public static ExtentSparkReporter sparkReport = null;
		public static ExtentReports extentReport = null;
		public static ExtentTest extentTest = null;
		public static String location = System.getProperty(("user.dir")+"/report/test_report.html");
		
		public static ExtentReports getInstance() {
			if(extentReport== null) {
				return createInstance();
			}
			return extentReport;
		}
		
		public static ExtentReports createInstance() {
			sparkReport = new ExtentSparkReporter(location);
			sparkReport.config().setDocumentTitle("Test_Report");
			sparkReport.config().setTheme(Theme.DARK);
			sparkReport.config().setReportName("Feb Project Extent Report");
			
			extentReport = new ExtentReports();
			extentReport.attachReporter(sparkReport);
			extentReport.setSystemInfo("Institute", "Aiite");
			extentReport.setSystemInfo("Project", "Feb");
			extentReport.setSystemInfo("Trainer", "Karthik");
			return extentReport;
			
		}
		
		public static void createReportTest(String name) {
			extentTest = extentReport.createTest(name);
		}
		
		public static void flushreport() {
			extentReport.flush();
		}
		

	}


