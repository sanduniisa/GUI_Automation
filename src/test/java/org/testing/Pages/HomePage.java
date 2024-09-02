package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	ChromeDriver driver;
	Properties pr;

	public HomePage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void trendingClick() throws InterruptedException {

		WebElement trendingElement = driver.findElement(By.xpath(pr.getProperty("trendingElement")));
		trendingElement.click();
		Thread.sleep(3000);
	}

	public void signOut() throws InterruptedException {
		WebElement avatarWebElement = driver.findElement(By.xpath(pr.getProperty("avatarWebElement")));
		avatarWebElement.click();
		Thread.sleep(3000);
		WebElement signout = driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		Thread.sleep(2000);
	}

	public void historyClick() throws InterruptedException {
		WebElement historyElement = driver.findElement(By.xpath(pr.getProperty("historyElement")));
		historyElement.click();
		Thread.sleep(2000);

	}

	public void subscriptionClick() throws InterruptedException {
		WebElement subscriptionsElement = driver.findElement(By.xpath(pr.getProperty("subscriptionsElement")));
		subscriptionsElement.click();
		Thread.sleep(3000);

	}

	public void searchVideo(String search) throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchElement = driver.findElement(By.xpath(pr.getProperty("searchElement")));
		searchElement.sendKeys(search);
		Thread.sleep(2000);

		WebElement searchvdoElement = driver.findElement(By.xpath(pr.getProperty("searchvdoElement")));
		searchvdoElement.click();
		Thread.sleep(3000);

	}

	public void watchLaterClick() throws InterruptedException {
		WebElement watchLaterElement = driver.findElement(By.xpath(pr.getProperty("watchLaterElement")));
		watchLaterElement.click();
		Thread.sleep(3000);

	}

	public void podcastsClick() throws InterruptedException {
		WebElement podcastsElement = driver.findElement(By.xpath(pr.getProperty("podcastsElement")));
		podcastsElement.click();
		Thread.sleep(3000);

	}

}
