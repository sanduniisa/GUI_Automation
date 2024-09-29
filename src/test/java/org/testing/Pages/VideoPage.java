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
		// Scroll to the comment section if necessary
        WebElement commentSection = driver.findElement(By.id("comments"));
        driver.executeScript("arguments[0].scrollIntoView(true);", commentSection);
    
        // Add a comment
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement commentBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contenteditable-textarea")));
        
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        WebElement commentBox = driver.findElement(By.xpath("//div[@aria-label='Add a comment...']"));
        commentBox.click();
        commentBox.sendKeys("This is a test comment!");
        driver.switchTo().defaultContent();

        // Submit the comment (You might need to handle the submit button depending on the page)
        driver.findElement(By.id("submit-button")).click(); // Update selector for the submit button



	}

}
