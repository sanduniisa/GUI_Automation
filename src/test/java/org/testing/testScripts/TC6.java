package org.testing.testScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ReportHandling;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC6 extends Base {
	// login to the you tube and vdo play ,comment any vdo then logout
	@Test
	public void testcase6() throws InterruptedException, IOException {
		ExtentReports extentReports = ReportHandling.reports();
		ExtentTest extentTest = extentReports.startTest("testcase6");

		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			HomePage homePage = new HomePage(driver, pr);
			VideoPage videoPage = new VideoPage(driver, pr);

			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");
			homePage.searchVideo("testing course for beginners");
			videoPage.videoPlay();
			videoPage.addComment();
			homePage.signOut();
			LogCapture.takeLog("TC6", "Test Case 6 ------------------------------------passed Successfully");
			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/testcase6.png");
			extentTest.log(LogStatus.PASS, "testcase6 Passed");
			extentReports.endTest(extentTest);
			extentReports.flush();
			

		} catch (Exception e) {
			LogCapture.takeLog("TC6", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC6", "Test Case 6 failed due to : " + e.getMessage());

			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/tc6_comment.png");
			extentTest.log(LogStatus.FAIL, "testcase6 Failed");
			extentReports.endTest(extentTest);
			extentReports.flush();
		}

	}

}
