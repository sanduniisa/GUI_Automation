package org.testing.assertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.LogCapture;
import org.testng.Assert;

public class WebAssertions {
	ChromeDriver driver;

	public static void elementVisibility(WebElement element, String className) {

		if (element.isDisplayed()) {
			System.out.println("Element is visible");
			LogCapture.takeLog(className, element + "Element is visible");

		} else {
			System.out.println("Element is not visible");
			LogCapture.takeLog(className, element + "Element is not visible");
		}

	}

	public static void elementTextVerification(String actualText, String expectedText, String className) {
		if (!actualText.isEmpty()) {
			System.out.println("Element text is present: " + actualText);
			Assert.assertEquals(actualText, expectedText, "Text verification failed for element: ");
			LogCapture.takeLog(className, "Text verification passed. Actual text: " + actualText);
		} else {
			System.out.println("Element text is not present");
			Assert.fail("Element text is missing or empty");
			LogCapture.takeLog(className, "Text verification failed. Element text is missing or empty.");
		}

	}

	public static void pageTitleVerification(String actualTitle, String expectedTitle, String className) {

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page title is as expected: " + actualTitle);

			LogCapture.takeLog(className, "Page title verification passed. Actual title: " + actualTitle);
		} else {
			System.out
					.println("Page title is not as expected. Actual: " + actualTitle + ", Expected: " + expectedTitle);

			LogCapture.takeLog(className,
					"Page title verification failed. Actual title: " + actualTitle + ", Expected: " + expectedTitle);

			Assert.fail("Page title verification failed. Actual: " + actualTitle + ", Expected: " + expectedTitle);
		}

	}

	public static void pageURLVerification(String actualURL, String expectedURL, String className) {

		if (actualURL.equals(expectedURL)) {

			System.out.println("Page URL is as expected: " + actualURL);

			LogCapture.takeLog(className, "Page URL verification passed. Actual URL: " + actualURL);

		} else {

			System.out.println("Page URL is not as expected. Actual: " + actualURL + ", Expected: " + expectedURL);

			LogCapture.takeLog(className,
					"Page URL verification failed. Actual URL: " + actualURL + ", Expected: " + expectedURL);

			Assert.fail("Page URL verification failed. Actual: " + actualURL + ", Expected: " + expectedURL);
		}

	}

}
