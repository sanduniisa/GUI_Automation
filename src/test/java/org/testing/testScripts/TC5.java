package org.testing.testScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ReportHandling;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC5 extends Base {
	// login to the you tube and vdo play ,channel subscription then logout
	@Test
	public void testcase5() throws InterruptedException, IOException {
		
		ExtentReports extentReports = ReportHandling.reports();
		ExtentTest extentTest = extentReports.startTest("testcase5");
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			HomePage homePage = new HomePage(driver, pr);
			VideoPage videoPage = new VideoPage(driver, pr);

			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");
			homePage.searchVideo("twinkle twinkle little star");
			videoPage.videoPlay();
			videoPage.channelSubscription();
			homePage.signOut();
			LogCapture.takeLog("TC5", "Test Case 5 ------------------------------------passed Successfully");
			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/testcase5.png");
			extentTest.log(LogStatus.PASS, "testcase5 Passed");
			extentReports.endTest(extentTest);
			extentReports.flush();
			
		} catch (Exception e) {
			LogCapture.takeLog("TC5", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC5", "Test Case 5 failed due to : " + e.getMessage());

			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/tc5_test.png");
			extentTest.log(LogStatus.FAIL, "testcase5 Failed");
			extentReports.endTest(extentTest);
			extentReports.flush();
		}
	}

}
