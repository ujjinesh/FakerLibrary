package com.OrnageHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.OrnageHRM.Utils.BaseClass;
import com.OrnageHRM.Utils.selenium_Utils_Functions;

public class LoginPage extends BaseClass{

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
	public void login(String un, String pw) {
		selenium_Utils_Functions.type(Username, un);
		selenium_Utils_Functions.type(password, pw);
		selenium_Utils_Functions.click(driver, loginbutton);
	}
}
