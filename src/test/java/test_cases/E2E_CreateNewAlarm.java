package test_cases;

import org.testng.annotations.Test;

import pages.PageBase;

public class E2E_CreateNewAlarm extends TestBase {

	@Test(priority = 1, groups = "smoke", description = "add new alarm")
	public void addNewAlarm() throws InterruptedException {
		homePage.addNewAlarmButton.click();
		Thread.sleep(2000);
		homePage.firstButton.click();
		homePage.firstButton.click();
		homePage.firstButton.click();
		homePage.secondButton.click();
		homePage.timeState.click();
		PageBase.captureScreenshot(driver, "addNewAlarm1");
		homePage.ok.click();
		Thread.sleep(2000);
		PageBase.captureScreenshot(driver, "addNewAlarm2");
	}
}
