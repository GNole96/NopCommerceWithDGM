package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportClass {

	public static ExtentReports addReports() {
		
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("ExtentReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Created ", "Team DGM");
		report.setSystemInfo("TestingType", "Regression");
		
		return report;
	}
}
