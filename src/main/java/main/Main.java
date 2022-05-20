package main;

import pom.HomePage;
import utility.Utility;

import java.io.IOException;

import capabilities.Capabilities;

public class Main extends Capabilities {

	public void prepare() throws IOException {
		// TODO start application with appium
		driver = baseCapabilities("AppName");

		// TODO Declare pom objects
		homePage = new HomePage(driver);
		// take screenshot
		Utility.captureScreenshot(driver, "homepage");
	}

	public void addNewAlarm() throws InterruptedException {
		homePage.addNewAlarmButton.click();
		Thread.sleep(2000);
		homePage.firstButton.click();
		homePage.firstButton.click();
		homePage.firstButton.click();
		homePage.secondButton.click();
		homePage.timeState.click();
		Utility.captureScreenshot(driver, "addNewAlarm1");
		homePage.ok.click();
		Thread.sleep(2000);
		Utility.captureScreenshot(driver, "addNewAlarm2");
	}

	public static void TearDown() {
		driver.quit();
	}
}
