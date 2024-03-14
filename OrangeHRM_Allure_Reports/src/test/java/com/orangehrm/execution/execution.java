package com.orangehrm.execution;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.Logout;
import com.orangehrm.util.AllureListener;
import com.orangehrm.util.BaseClass;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({ AllureListener.class })
public class execution extends BaseClass {
	BaseClass bs;

	@BeforeClass
	public void setUp() throws Throwable {
		bs = new BaseClass();
		bs.initialize_driver();
	}

	@Test
	@Description("Verify OrangeHRM login with valid credentials........")
	@Severity(SeverityLevel.BLOCKER)
	@Owner("Bandi Ujjinesh")
	@Epic("EP001")
	@Feature("Feature1:Login")
	@Story("Story:Login with valid details")
	@Link(name = "OrangeHRM", url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
	public void ValidLogin() {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login("Admin", "admin123");
		loginpage.dashboardvalidation();
		
		Logout logout = PageFactory.initElements(driver, Logout.class);
		logout.logout();
	}

	@Test(priority = 1)
	@Description("Verify OrangeHRM login page title........")
	@Severity(SeverityLevel.BLOCKER)
	@Owner("Bandi Ujjinesh")
	@Epic("EP001")
	@Feature("Feature1:Login")
	@Story("Story:Login with Invalid details")
	@Link(name = "OrangeHRM", url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
	public void InvalidLogin() {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login("Admin", "admin12");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM1");
	}

	@Test(priority = 2)
	@Severity(SeverityLevel.MINOR)
	@Owner("Bandi Ujjinesh")
	@Feature("Feature1:Login")
	@Story("Story:Login with valid details")
	@Epic("EP001")
	@Link(name = "OrangeHRM", url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
	public void loginTest() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login("Admin", "admin123");
		throw new SkipException("Skipping this Test");
	}

	@AfterClass
	public void close() {
		bs.teardown();
	}
}
