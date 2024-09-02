package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.assertions.WebAssertions;
import org.testing.utilities.LogCapture;
import org.testng.annotations.Test;

public class TC2 extends Base {
	// login to the you tube and click history then logout
	@Test
	public void testcase2() throws InterruptedException {
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");

			HomePage homePage = new HomePage(driver, pr);

			homePage.historyClick();
			homePage.signOut();
			String actualTitle = driver.getTitle();
			WebAssertions.pageTitleVerification(actualTitle, "YouTube", "TC2");
			LogCapture.takeLog("TC2", "Test Case 2 --------------------------passed Successfully");
		} catch (Exception e) {
			LogCapture.takeLog("TC2", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC2", "Test Case 2 failed due to : " + e.getMessage());
		}

	}
}
