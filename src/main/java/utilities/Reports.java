package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports addReports() {
		ExtentSparkReporter htmlreports=new ExtentSparkReporter("extenReport.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(htmlreports);
		reports.setSystemInfo("Env", "UAT");
		reports.setSystemInfo("Testing Type","Regression");
		return reports;
		
	}

}
