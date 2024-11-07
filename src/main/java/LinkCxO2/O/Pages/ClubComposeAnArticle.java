package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class ClubComposeAnArticle extends AbstractComponent {

	public ClubComposeAnArticle(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//android.view.View[@content-desc=\"More\"]/android.widget.TextView")
	private WebElement moreBtn;

	public void ClickonMoreButton() {
		action.clickElement(moreBtn);
	}

	@FindBy(xpath = "(//com.horcrux.svg.PathView[contains(@class, 'PathView') and @index='20'])[1]")
	private WebElement ClubBtn;

	public void ClickonClubButton() {
		action.clickElement(ClubBtn);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	private WebElement myClubBtn;

	public void ClickonMyClubButton() {
		action.clickElement(myClubBtn);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"My Testing Club\"]")
	private WebElement firstClub;

	public void ClickonFirstClub() {
		action.clickElement(firstClub);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement ClickonPost;

	public void ClickonPostButton() {
		action.clickElement(ClickonPost);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]")
	private WebElement clickonPlus;

	public void ClickonPlusIcon() {
		action.clickElement(clickonPlus);
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

	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])[1]")
	private WebElement selectImg;

	public void SelectImage() throws InterruptedException {
		Thread.sleep(3000);
		action.clickElement(selectImg);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title\"]")
	private WebElement title;

	public void EnterArticleTitle() {
		action.sendKeysElement(title, "Club Testing Article");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement gettextOfArticleTitle;

	public String GettextOfExpArticle() {
		return gettextOfArticleTitle.getText();
	}

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"content\"]")
	private WebElement descr;

	public void EnterDescription() {
		action.sendKeysElement(descr, "For Testing Purpose");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Your Article\"]")
	private WebElement publish;

	public void ClickonPublishArticle() {
		action.clickElement(publish);
	}

	@FindBy(xpath = "(//android.widget.TextView)[12]")
	private WebElement gettextOfActuArticleTitle;

	public String gettextOfActualArticleTitle() {
		return gettextOfActuArticleTitle.getText();
	}

}
