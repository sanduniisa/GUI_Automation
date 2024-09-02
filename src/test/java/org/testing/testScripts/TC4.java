package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testing.assertions.WebAssertions;
import org.testing.utilities.LogCapture;
import org.testng.annotations.Test;

public class TC4 extends Base {
	// login to the you tube and vdo play , like then logout
	@Test
	public void testcase4() throws InterruptedException {
		try {
			LoginPage loginPage = new LoginPage(driver, pr);
			HomePage homePage = new HomePage(driver, pr);
			VideoPage videoPage = new VideoPage(driver, pr);

			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");
			homePage.searchVideo("twinkle twinkle little star");
			videoPage.videoPlay();
			String actualTitle = driver.getTitle();
			WebAssertions.pageTitleVerification(actualTitle, "Twinkle Twinkle Little Star | Nursery Rhymes for Kids | Super Simple Songs - YouTube", "TC4");
			homePage.signOut();
			LogCapture.takeLog("TC4", "Test Case 4 -----------------------------------passed Successfully");
		} catch (Exception e) {
			LogCapture.takeLog("TC4", "Reason for failure : " + e.getMessage());
			LogCapture.takeLog("TC4", "Test Case 4 failed due to : " + e.getMessage());
		}

	}

}
