package com.openmrs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	public static boolean draganddrop(WebDriver dr, WebElement source, WebElement target) {
		try {
			Actions act = new Actions(dr);
			act.dragAndDrop(source, target).perform();
			return true;
		} catch (Exception e) {
			System.out.println("Failed to draganddrop the element");
			e.printStackTrace();
			return false;
		}

	}

	public static boolean switchToFrameByWebElement(WebDriver driver, WebElement frameElement) {
		try {
			driver.switchTo().frame(frameElement);
			System.out.println("Switched to frame by WebElement");
			return true;
		} catch (Exception e) {
			System.out.println("Failed to switch to frame by WebElement");
			e.printStackTrace();
			return false;
		}
	}
}
