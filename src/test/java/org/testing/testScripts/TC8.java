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

public class TC8 extends Base {
	// login to the you tube and click Podcasts then logout
	@Test
	public void testcase8() throws InterruptedException, IOException {
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");

			HomePage homePage = new HomePage(driver, pr);

			homePage.podcastsClick();
			homePage.signOut();
			LogCapture.takeLog("TC8", "Test Case 8 ------------------------------------passed Successfully");
			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/testcase8.png");
		} catch (Exception e) {
			LogCapture.takeLog("TC8", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC8", "Test Case 5 failed due to : " + e.getMessage());

			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/tc8_test.png");
		}
	}
}
