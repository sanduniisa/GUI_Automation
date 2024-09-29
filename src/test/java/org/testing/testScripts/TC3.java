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

public class TC3 extends Base {
	// login to the you tube and click subscriptions then logout
	@Test
	public void testcase3() throws InterruptedException {
		ExtentReports extentReports = ReportHandling.reports();
		ExtentTest extentTest = extentReports.startTest("testcase3");
		
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");
			HomePage homePage = new HomePage(driver, pr);
			homePage.subscriptionClick();
			homePage.signOut();
			String actualTitle = driver.getTitle();
			WebAssertions.pageTitleVerification(actualTitle, "YouTube", "TC3");
			LogCapture.takeLog("TC3", "Test Case 3 --------------------------------passed Successfully");
			extentTest.log(LogStatus.PASS, "testcase3 Passed");
			extentReports.endTest(extentTest);
			extentReports.flush();
			
		} catch (Exception e) {
			LogCapture.takeLog("TC3", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC3", "Test Case 3 failed due to : " + e.getMessage());
			extentTest.log(LogStatus.FAIL, "testcase3 Failed");
			extentReports.endTest(extentTest);
			extentReports.flush();
		}
	    }

}
