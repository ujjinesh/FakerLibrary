package com.orangehrm.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selenium_Utils_Functions {

	public static void click(WebDriver driver, WebElement element) {
		try {
			element.click();
			System.out.println("Clicked on element");
		} catch (Exception e) {
			System.out.println("Failed to click on element");
			e.printStackTrace();
		}
	}

	public static boolean type(WebElement element, String text) {
		try {
			// element.clear();
			element.sendKeys(text);
			System.out.println("Typed '" + text + "' into the element");
			return true;
		} catch (Exception e) {
			System.out.println("Failed to type text into the element");
			e.printStackTrace();
			return false;
		}
	}
}
