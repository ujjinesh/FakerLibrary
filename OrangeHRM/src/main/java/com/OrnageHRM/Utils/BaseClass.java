package com.OrnageHRM.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;

	@BeforeClass
	public void setup() throws Throwable{
		if (Property.getValueForKey("Browser").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			report = new ExtentReports(".\\OrangeHRM\\report.html", true);
			test = report.startTest("Lanuh the chrome");
			driver.get(Property.getValueForKey("url"));
		} else if (Property.getValueForKey("Browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			report = new ExtentReports(".\\OrangeHRM\\report.html", true);
			test = report.startTest("Lanuh the Firefox");
			driver.get(Property.getValueForKey("url"));
		} else {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			report = new ExtentReports(".\\OrangeHRM\\report.html", true);
			test = report.startTest("Lanuh the Edge");
			driver.get(Property.getValueForKey("url"));
		}
		
		
	}
	

	
	@AfterClass
	public static void teardown() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}
