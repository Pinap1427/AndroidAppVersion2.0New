package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

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

	@FindBy(id = "android:id/title")
	private WebElement selectImg;

	public void SelectImage() {
		action.clickElement(selectImg);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title\"]")
	private WebElement title;

	public void EnterArticleTitle() {
		action.sendKeysElement(title, "Testing");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement descr;

	public void EnterDescription() {
		action.sendKeysElement(descr, "For Testing Purpose");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Your Article\"]")
	private WebElement publish;

	public void ClickonPublishArticle() {
		action.clickElement(publish);
	}
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Alternate LxText\"])[2]")
	private WebElement verifyArticle;
	public boolean VerifyArticlePostedorNot()
	{
		return action.isDisplay(verifyArticle);
	}
}
