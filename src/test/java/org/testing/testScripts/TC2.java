package org.testing.testScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.assertions.WebAssertions;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ReportHandling;
import org.testng.annotations.Test;

public class TC2 extends Base {
	// login to the you tube and click history then logout
	@Test
	public void testcase2() throws InterruptedException {
		
		ExtentReports extentReports = ReportHandling.reports();
		ExtentTest extentTest = extentReports.startTest("testcase2");
		
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");

			HomePage homePage = new HomePage(driver, pr);

			homePage.historyClick();
			homePage.signOut();
			String actualTitle = driver.getTitle();
			WebAssertions.pageTitleVerification(actualTitle, "YouTube", "TC2");
			LogCapture.takeLog("TC2", "Test Case 2 --------------------------passed Successfully");
			extentTest.log(LogStatus.PASS, "testcase2 Passed");
			extentReports.endTest(extentTest);
			extentReports.flush();

		} catch (Exception e) {
			LogCapture.takeLog("TC2", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC2", "Test Case 2 failed due to : " + e.getMessage());
			extentTest.log(LogStatus.FAIL, "testcase2 Failed");
			extentReports.endTest(extentTest);
			extentReports.flush();
		}

	}
}
