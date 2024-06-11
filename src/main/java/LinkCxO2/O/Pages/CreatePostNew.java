package LinkCxO2.O.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CreatePostNew extends AbstractComponent {

	public CreatePostNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement pluticon;

	public void ClickonPlusIcon() {
		action.clickElement(pluticon);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Create a Post, Create a Post and Engage with Your Network and empower your voice.\"]/android.widget.TextView[1]")
	private WebElement createPost;

	public void ClickonCreatePost() {
		action.clickElement(createPost);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement enterText;

	public void EnterTextForPOst() {
		action.sendKeysElement(enterText, "Testing");
	}

	@FindBy(xpath = "(//android.view.ViewGroup)[14]")
	private WebElement photosicn;

	public void ClickonPhotosIcon() {
		action.clickElement(photosicn);
	}
	public void EnterBtn() throws AWTException, InterruptedException
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	@FindBy(id = "android:id/title")
	private WebElement selectImg;

	public void SelectImage() {
		action.clickElement(selectImg);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Add Your Post\"]")
	private WebElement addyourpost;

	public void ClickonAddYourPost() {
		action.clickElement(addyourpost);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Now\"]/android.widget.TextView")
	private WebElement publishnow;

	public void ClickonPublishNow() {
		action.clickElement(publishnow);
	}
//	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Now\"]/android.widget.TextView")
//	private MobileElement publishnow1;
//	public void Scroll() throws InterruptedException
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView(true);", publishnow1);
//        
//	}

	@FindBy(xpath = "(//android.widget.TextView)[5]")
	private WebElement verifyPost;
	public boolean VerifyPostCreatedorNOt()
	{
		return action.isDisplay(verifyPost);
	}
}
