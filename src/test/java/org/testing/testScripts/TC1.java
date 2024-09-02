package org.testing.testScripts;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.assertions.WebAssertions;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC1 extends Base {

	// login to the you tube and click trending then logout

	@Test
	public void testcase1() throws InterruptedException, IOException {

		try {

			LoginPage loginPage = new LoginPage(driver, pr);
			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");

			String actualTitle = driver.getTitle();
			WebAssertions.pageTitleVerification(actualTitle, "YouTube", "TC1");

			String actualURL = driver.getCurrentUrl();
			WebAssertions.pageURLVerification(actualURL, "https://www.youtube.com/", "TC1");

			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/tc1_login.png");
			LogCapture.takeLog("TC1", "logged Successfully");
			
			
//			WebElement SignInElement = driver.findElement(By.xpath(pr.getProperty("signInElement"))); 
//			WebAssertions.elementTextVerification(SignInElement.getText(), "Sign in", "TC1");
//			WebAssertions.elementVisibility(SignInElement, "TC1");

			HomePage homePage = new HomePage(driver, pr);

			homePage.trendingClick();
			homePage.signOut();
			LogCapture.takeLog("TC1", "Test Case 1 ------------------------------------passed Successfully");
			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/testcase1.png");

		} catch (Exception e) {

			LogCapture.takeLog("TC1", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC1", "Test Case 1 failed due to : " + e.getMessage());

			ScreenshotCapture.takeScreenshot(driver, "/Users/sanduniisa/Documents/TestsScreenshots/tc1_login.png");

		}

	}

}
