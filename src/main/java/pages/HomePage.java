package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Path to add new alarm
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='1']")
	public WebElement addNewAlarmButton;

	// first button
	@AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
	public WebElement firstButton;

	// second button
	@AndroidFindBy(xpath = "//android.widget.Button[@text='5']")
	public WebElement secondButton;

	// time State
	@AndroidFindBy(xpath = "//android.widget.Button[@text='AM']")
	public WebElement timeState;

	// accept button
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	public WebElement ok;
}
