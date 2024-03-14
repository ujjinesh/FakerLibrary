package com.OrnageHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Dashboard {

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement dashboard;
	
	public void validation() {
		Assert.assertEquals("Dashboard", dashboard.getText());
	}
	
}
