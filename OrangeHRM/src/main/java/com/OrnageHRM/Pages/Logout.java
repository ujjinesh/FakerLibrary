package com.OrnageHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.OrnageHRM.Utils.BaseClass;
import com.OrnageHRM.Utils.selenium_Utils_Functions;

public class Logout extends BaseClass{

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")
	WebElement breadcrumb_module;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	WebElement Logout;
	
	public void logout() {
		selenium_Utils_Functions.click(driver, breadcrumb_module);
		selenium_Utils_Functions.click(driver, Logout);
	}
	
	
}
