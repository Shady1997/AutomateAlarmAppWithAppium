package test_cases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.HomePage;
import pages.PageBase;

public class TestBase extends Capabilities {

	// declare class properties
	protected static AndroidDriver<AndroidElement> driver;
	public static HomePage homePage;

	@BeforeTest
	public static void prepare() throws IOException {
		// TODO start application with appium
		driver = baseCapabilities("AppName");
		PageBase.captureScreenshot(driver, "startApp");// take screenshot for app when start

		homePage = new HomePage(driver);
	}

	@AfterClass
	public static void TearDown() {
		driver.quit();
	}

	public static void getScreenshotOnFailure() {
		PageBase.captureScreenshot(driver, "fail" + java.time.LocalTime.now());
	}

}
