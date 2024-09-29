package org.testing.testScripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC7 extends Base {
	// login to the you tube and click watch later then logout
	@Test
	public void testcase7() throws InterruptedException, IOException {
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");

			HomePage homePage = new HomePage(driver, pr);

			homePage.watchLaterClick();
			homePage.signOut();
			
			LogCapture.takeLog("TC7", "Test Case 7 ------------------------------------passed Successfully");
			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/testcase7.png");
		} catch (Exception e) {
			LogCapture.takeLog("TC7", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC7", "Test Case 7 failed due to : " + e.getMessage());

			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/tc7_testcase.png");
		}

	}
}
