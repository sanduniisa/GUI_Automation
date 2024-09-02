package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPage {

	ChromeDriver driver;
	Properties pr;

	public VideoPage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void videoPlay() throws InterruptedException {

		WebElement clickvdoElement = driver.findElement(By.xpath(pr.getProperty("clickvdoElement")));
		clickvdoElement.click();
		Thread.sleep(3000);

	}

	public void clickLikeButton() throws InterruptedException {
		WebElement likeButtonElement = driver.findElement(By.xpath(pr.getProperty("likeButtonElement")));
		likeButtonElement.click();
		Thread.sleep(4000);
	}

	public void channelSubscription() throws InterruptedException {
		WebElement channelsubscriptionElement = driver
				.findElement(By.xpath(pr.getProperty("channelsubscriptionElement")));
		channelsubscriptionElement.click();
		Thread.sleep(3000);

	}

	public void addComment() throws InterruptedException {
		// Scroll down to the comment section
					Thread.sleep(3000);
					Actions actions = new Actions(driver);
					WebElement addComment = driver.findElement(By.xpath(pr.getProperty("addComment")));
					actions.moveToElement(addComment).perform();
					Thread.sleep(3000);
				
//					// Focus on the comment box and click //iframe
//			        WebElement commentBox = driver.findElement(By.xpath("//tp-yt-paper-input-container[@id='input-container']"));
//			        commentBox.click();
//			        Thread.sleep(3000);
			        
			     // Ensure the correct XPath
					Thread.sleep(3000);
			        WebElement commentBox =  driver.findElement(By.cssSelector(pr.getProperty("commentBox")));
			        commentBox.click();
			        Thread.sleep(3000);

			        WebElement commentInput = driver.findElement(By.xpath(pr.getProperty("commentInput")));
			        commentInput.sendKeys("Perfect");
			        Thread.sleep(3000);
					
					WebElement clickCommentElement =  driver.findElement(By.xpath(pr.getProperty("clickCommentElement")));
					clickCommentElement.click();
					Thread.sleep(3000);
		
	}

}
