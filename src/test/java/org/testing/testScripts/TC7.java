package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testng.annotations.Test;

public class TC7 extends Base {
	// login to the you tube and click watch later then logout
	@Test
	public void testcase7() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver, pr);
		loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");

		HomePage homePage = new HomePage(driver, pr);

		homePage.watchLaterClick();
		homePage.signOut();

	}
}
