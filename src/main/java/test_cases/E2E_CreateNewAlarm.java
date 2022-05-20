package test_cases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.Main;

public class E2E_CreateNewAlarm {

	Main main = new Main();

	@BeforeTest
	public void prepareUsedObjects() throws IOException {
		main.prepare();
	}

	@Test(priority = 1, groups = "smoke", description = "add new alarm")
	public void addNewAlarm() throws InterruptedException {
		main.addNewAlarm();
	}

	@AfterClass
	public void tearDown() {
		main.TearDown();
	}
}
