package utilsDemoQa;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoQA {
	
	public static ExtentReports getExtentReports() {
		
		String extenReportFilePath="./Reports/resultsfile.html";
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(extenReportFilePath);
		sparkReporter.config().setReportName("DemoQA Reports");
		sparkReporter.config().setDocumentTitle("DemoQA Test Reports");
		
		ExtentReports extentReport=new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("Selenium Version", "4.11.0");
		extentReport.setSystemInfo("Operating Platform", "Windows 10");
		extentReport.setSystemInfo("Reporter", "tester 1");
		return extentReport;
	}

}
