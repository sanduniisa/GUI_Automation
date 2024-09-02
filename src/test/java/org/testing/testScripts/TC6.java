package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPage;
import org.testng.annotations.Test;

public class TC6 extends Base{
	//login to the you tube and vdo play ,comment any vdo then logout
		@Test
		public void testcase6() throws InterruptedException {
			LoginPage loginPage = new LoginPage(driver, pr);
			HomePage homePage = new HomePage(driver, pr);
			VideoPage videoPage = new VideoPage(driver, pr);

			loginPage.singIn("myautomationpractise.testing@gmail.com", "FourSeason1976%");
			homePage.searchVideo("testing course for beginners");
			videoPage.videoPlay();
			videoPage.channelSubscription();
			videoPage.addComment();
			homePage.signOut();
		}
		
}
