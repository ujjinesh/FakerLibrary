package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.orangehrm.util.BaseClass;
import com.orangehrm.util.selenium_Utils_Functions;


public class LoginPage extends BaseClass{
	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")
	WebElement dashboard;
	
	public void login(String un, String pw) {
		selenium_Utils_Functions.type(Username, un);
		selenium_Utils_Functions.type(password, pw);
		selenium_Utils_Functions.click(driver, loginbutton);
	}
	
	public void dashboardvalidation() {
		boolean dispStatus=dashboard.isDisplayed();
		Assert.assertEquals(dispStatus, true);
	}
	
	

}
