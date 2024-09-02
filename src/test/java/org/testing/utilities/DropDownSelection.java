package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	
		
	
//here have to pass the index number of the drop down value. index values are starting from zero
	public static void selectByIndex(int index, WebElement element) {
		
		Select dropDownSelect = new Select(element);
		dropDownSelect.selectByIndex(index);

	}

	
//select the visible text in UI of the drop down	
	public static void selectByVisibleText(String visibleText, WebElement element) {
		Select dropDownSelect = new Select(element);
		dropDownSelect.selectByVisibleText(visibleText);
		
	}

	
//use the html and get the key of the value in option tag	
	public static void selectByValue(String value, WebElement element) {
		Select dropDownSelect = new Select(element);
		dropDownSelect.selectByValue(value);
		
	}

}
