package LinkCxO2.O.Pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ComposeArticleNew extends AbstractComponent {

	public ComposeArticleNew(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Compose an Article, Write an Article and Inspire Your Network with your findings!\"]/android.widget.TextView[1]")
	private WebElement ComposeartBtn;

	public void ClickonComposeArticle() {
		action.clickElement(ComposeartBtn);
	}

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Alternate LxText\"]")
	private WebElement imgClick;

	public void ClickonImage() {
		action.clickElement(imgClick);
	}

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1676909412539.png, 36.01 kB, Oct 21\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")
	private WebElement selectImg;

	public void SelectImage() {
		action.clickElement(selectImg);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title\"]")
	private WebElement title;

	public void EnterArticleTitle(String ArticleTitle) {
		action.sendKeysElement(title, ArticleTitle);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Start Entering Here\"]")
	private WebElement descr;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.EditText")
	private WebElement finalDescr;
	public void EnterDescription(String ArticleDesc) throws InterruptedException, AWTException {
		action.sendKeysElement(descr, "For Testing Purpose a");
		Thread.sleep(1000);
		action.clickElement(finalDescr);
		Thread.sleep(1000);
		TouchAction action=new TouchAction(driver);
		action.tap(PointOption.point(992, 2017)).perform();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.EditText")
	private WebElement EditArticle;
	

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Your Article\"]")
	private WebElement publish;

	public void ClickonPublishArticle() {
		action.clickElement(publish);
	}
	@FindBy(xpath = "(//android.widget.TextView)[7]")
	private WebElement verifyArticle;
	public boolean VerifyArticlePostedorNot()
	{
		return action.isDisplay(verifyArticle);
	}
	
	//////////Article View /////////
	public void ClickonArticle()
	{
		action.clickElement(verifyArticle);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView")
	private WebElement verifyViewArticle;
	public boolean VerifyViewArticlePostedorNot()
	{
		return action.isDisplay(verifyViewArticle);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement backBtn;
	public void ClickonBackButtn()
	{
		action.clickElement(backBtn);
	}
	
}
