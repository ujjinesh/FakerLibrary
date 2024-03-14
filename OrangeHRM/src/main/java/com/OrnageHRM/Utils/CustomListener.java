package com.OrnageHRM.Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class CustomListener extends BaseClass implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Suite started: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Suite finished: " + context.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test failed: " + result.getName());
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination_File = new File(".\\OrangeHRM\\Failed_Screenshots" + System.currentTimeMillis() + ".png");
		try {
			Files.copy(src, Destination_File);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());
	}
}

