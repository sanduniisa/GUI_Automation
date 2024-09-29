package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.LogCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr ;
	public JavascriptExecutor js;
	   
	@BeforeSuite
    public void setupSuite() {
        LogCapture.clearLog();  // Clear log at the start of the suite
        LogCapture.initializeLogger();  // Initialize logger
    }
    @BeforeMethod
    public void init() throws IOException {
    	
    	File f= new File("../GUIAutomation/object.properties");
    	FileReader fr = new FileReader(f);
    	pr = new Properties();
    	pr.load(fr);
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
		Options op= driver.manage();
		Window w=op.window();
		w.maximize();
		//LogCapture.clearLog();
		// Initialize the JavascriptExecutor
		js = (JavascriptExecutor) driver;
	
    }
    
    @AfterMethod
	public void closure() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
