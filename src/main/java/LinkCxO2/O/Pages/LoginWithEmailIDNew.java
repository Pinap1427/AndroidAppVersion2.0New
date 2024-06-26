package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class LoginWithEmailIDNew extends AbstractComponent {

	public LoginWithEmailIDNew(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue with Email or Mobile No.\"]/android.widget.TextView")
	private WebElement continuewithemail;

	public void ClickonContinueWithEmailorMobile() {
		action.clickElement(continuewithemail);
	}
	@FindBy(xpath = "//android.widget.EditText[@text=\"Your Email or Mobile No\"]")
	private WebElement EnterEmail;
	public void EnterEmailId()
	{
		action.sendKeysElement(EnterEmail, "kprabhat956@gmail.com");
	}
//	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue to Send OTP\"]/android.widget.TextView")
//	private WebElement 	sentOTp;
//	public void ClickonSendOTp()
//	{
//		action.clickElement(sentOTp);
//	}
//	555,2189
	public void TouchClickonSendOtp() throws InterruptedException
	{
		TouchAction action=new TouchAction(driver);
		action.tap(PointOption.point(555, 2181)).perform();
		Thread.sleep(2000);
	}
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp_input_0\"]")
	private WebElement otp1;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp_input_1\"]")
	private WebElement otp2;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp_input_2\"]")
	private WebElement otp3;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp_input_3\"]")
	private WebElement otp4;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp_input_4\"]")
	private WebElement otp5;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"otp_input_5\"]")
	private WebElement otp6;

	public void enterOtp1() {
		action.sendKeysElement(otp1, "4");
	}

	public void enterOtp2() {
		action.sendKeysElement(otp2, "4");
	}
	public void enterOtp3()
	{
		action.sendKeysElement(otp3, "4");
	}
	public void enterOtp4()
	{
		action.sendKeysElement(otp4, "4");
	}
	public void enterOtp5()
	{
		action.sendKeysElement(otp5, "4");
	}
	public void enterOtp6()
	{
		action.sendKeysElement(otp6, "4");
	}
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm to Verify\"]")
			private WebElement confirmToVerifyBtn;
	public void ClickonConfirmtoVerifyButton()
	{
		action.clickElement(confirmToVerifyBtn);
	}
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Logo\"]")
private WebElement verifyLoginsucc;
	public boolean verifyLoginSuccesfully()
	{
		return action.isDisplay(verifyLoginsucc);
	}
}
