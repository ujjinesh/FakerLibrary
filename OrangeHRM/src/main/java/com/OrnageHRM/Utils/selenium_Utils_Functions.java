package com.OrnageHRM.Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

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
	
	public static String CaptureScreen(WebDriver driver,String path) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination_File = new File(path + System.currentTimeMillis() + ".png");
		String absolutepath_screen = Destination_File.getAbsolutePath();
		Files.copy(src, Destination_File);
		return absolutepath_screen;

	}
}
