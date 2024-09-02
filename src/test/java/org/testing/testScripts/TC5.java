package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testng.annotations.Test;

public class TC5 extends Base {
	// login to the you tube and vdo play ,channel subscription then logout
	@Test
	public void testcase5() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver, pr);
		HomePage homePage = new HomePage(driver, pr);
		VideoPage videoPage = new VideoPage(driver, pr);

		loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");
		homePage.searchVideo("twinkle twinkle little star");
		videoPage.videoPlay();
		videoPage.channelSubscription();
		homePage.signOut();
	}

}
