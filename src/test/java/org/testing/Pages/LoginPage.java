package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.WebAssertions;

public class LoginPage {

	// constructor is using for assigning the values for an object

	ChromeDriver driver;
	Properties pr;

	public LoginPage(ChromeDriver driver, Properties pr) {
		// this driver and pr variables are local variables for the LoginPage class and
		// we cannot use these variable in another method in this class
		// so that declare the variables first an then assigning the values using "this"
		// keyword

		this.driver = driver;
		this.pr = pr;

		// this constructor will give driver object and properties object
		// when we call the object of this class we need to pass the objects of the
		// driver and properties.
		// so the test cases are getting these from the base class since the test cases
		// are inheriting with the base class
	}

	// have to pass the username and password as parameters to this method

	public void singIn(String username, String password) throws InterruptedException {

		// by creating an object of this class we can call this method in the test case
		// but in the signIn method for locating the elements we need driver
		// to fetch the locator value we need the object.properties file
		// test cases getting these things from the base class

		WebElement signInElement = driver.findElement(By.xpath(pr.getProperty("signInElement")));
		Thread.sleep(2000);
		WebAssertions.elementVisibility(signInElement, "common assertion");
		WebAssertions.elementTextVerification(signInElement.getText(), "Sign in", "common assertion");
		signInElement.click();

		WebElement emaiElement = driver.findElement(By.xpath(pr.getProperty("emailElement")));
		emaiElement.sendKeys("myautomationpractise.testing@gmail.com");
		Thread.sleep(2000);

		WebElement nextElement = driver.findElement(By.id(pr.getProperty("nextWebElement")));
		nextElement.click();
		Thread.sleep(2000);

		WebElement passwordElement = driver.findElement(By.xpath(pr.getProperty("passwordElement")));
		passwordElement.sendKeys("FourSeason1976%");
		Thread.sleep(2000);

		WebElement passwordNextElement = driver.findElement(By.id(pr.getProperty("passwordNextElement")));
		passwordNextElement.click();
		Thread.sleep(3000);

	}

}
