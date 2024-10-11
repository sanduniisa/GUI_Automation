package org.testing.Pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VideoPage {

	ChromeDriver driver;
	Properties pr;

	public VideoPage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void videoPlay() throws InterruptedException {
		Thread.sleep(4000);
		WebElement clickvdoElement = driver.findElement(By.xpath(pr.getProperty("clickvdoElement")));
		clickvdoElement.click();
		Thread.sleep(3000);

	}

	public void clickLikeButton() throws InterruptedException {
		Thread.sleep(4000);
		WebElement likeButtonElement = driver.findElement(By.xpath(pr.getProperty("likeButtonElement")));
		likeButtonElement.click();
		Thread.sleep(4000);
	}

	public void channelSubscription() throws InterruptedException {
		Thread.sleep(4000);
		WebElement channelsubscriptionElement = driver
				.findElement(By.xpath(pr.getProperty("channelsubscriptionElement")));
		channelsubscriptionElement.click();
		Thread.sleep(3000);

	}

	public void addComment() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(pr.getProperty("commentsinput"))).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(pr.getProperty("comments"))).sendKeys("Great Content");

		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("commentbtn"))).click();

	}

}
