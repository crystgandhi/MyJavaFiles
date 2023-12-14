package utilsDemoQa;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoQA {
	
	public static ExtentReports getExtentReports() {
		
		String extenReportFilePath="./Reports/resultsfile.html";
		ExtentSparkReporter esr=new ExtentSparkReporter(extenReportFilePath);
		esr.config().setReportName("DemoQA Reports");
		esr.config().setDocumentTitle("DemoQA Test Reports");
		
		ExtentReports er=new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("Selenium Version", "4.11.0");
		er.setSystemInfo("Operating Platform", "Windows 10");
		er.setSystemInfo("Reporter", "tester 1");
		return er;
	}

}
