package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling {
	public static ExtentReports reports() {
		ExtentReports extentReports = new ExtentReports("/Users/sanduniisa/Documents/extentReportsUI/report.html", false);
		return extentReports;
	}
	
}
