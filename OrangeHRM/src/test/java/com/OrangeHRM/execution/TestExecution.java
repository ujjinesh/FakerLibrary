package com.OrangeHRM.execution;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OrnageHRM.Pages.Dashboard;
import com.OrnageHRM.Pages.LoginPage;
import com.OrnageHRM.Pages.Logout;
import com.OrnageHRM.Utils.BaseClass;
import com.OrnageHRM.Utils.selenium_Utils_Functions;
import com.relevantcodes.extentreports.LogStatus;

public class TestExecution extends BaseClass {

	@Test
	public void loginWithValidDetails() throws IOException {
		test = report.startTest("loginWithValid Details");
		try {
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			lp.login("Admin", "admin123");

			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			dashboard.validation();

			Logout logout = PageFactory.initElements(driver, Logout.class);
			logout.logout();

			test.log(LogStatus.PASS, "user navigate OrangeHRM Dashboard");
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(
							selenium_Utils_Functions.CaptureScreen(driver, ".\\reportscreens\\validdetails.png"))
							+ "user Fail to navigate OrangeHRM Dashboard");
		}

	}

	@Test(priority = 1)
	public void loginWithInValidDetails() throws IOException {
		test = report.startTest("loginWithInValid Details");
		try {
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			lp.login("Admin", "admin1");
			test.log(LogStatus.PASS, "user navigate OrangeHRM Login Page");
			Assert.assertEquals(driver.getTitle(), "Home123");
			
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(
							selenium_Utils_Functions.CaptureScreen(driver, ".\\reportscreens\\Invaliddetails.png"))
							+ "user Fail to navigate OrangeHRM Login Page");
		}

	}

	@Test(priority = 2)

	public void LoginTest() throws IOException {
		test = report.startTest("LoginTest");
		throw new SkipException("Skipping this Test");

	}
}
