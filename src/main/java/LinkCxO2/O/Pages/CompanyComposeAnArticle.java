package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class CompanyComposeAnArticle extends AbstractComponent{
	
	public CompanyComposeAnArticle(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "(//com.horcrux.svg.PathView[contains(@class, 'PathView') and @index='6'])[1]")
	private WebElement CompanyBtn;

	public void ClickonCompanyButton() {
		action.clickElement(CompanyBtn);
	}

//	absCom.swipDownByCoordinates(517, 2122, 454);
//	testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"New testing Company @@@@, SFGDFGDGFDGDG, SFDFGDGD\"]/android.widget.TextView[1]")
	private WebElement CompanyClick;

	public void ClickonCompanyFromList() {
		action.clickElement(CompanyClick);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcon;

	public void ClickonPlusIcon() {
		action.clickElement(plusIcon);
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
	
	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allowBtn;
	public void ClickonAllowButton()
	{
		action.clickElement(allowBtn);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"download.jpeg\"]")
	private WebElement selectImg;

	public void SelectImage() {
		action.clickElement(selectImg);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title\"]")
	private WebElement title;

	public void EnterArticleTitle() {
		action.sendKeysElement(title, "Testing Article");
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement gettextOfArticleTitle;
	public String GettextOfExpArticle()
	{
		return gettextOfArticleTitle.getText();
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
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement backBtn;
	public void ClickonBackIcon() throws InterruptedException
	{
		action.clickElement(backBtn);
		Thread.sleep(4000);
		action.clickElement(CompanyClick);
	}
	
	
	@FindBy(xpath = "(//android.widget.TextView)[14]")
	private WebElement gettextOfActuArticleTitle;
	public String gettextOfActualArticleTitle()
	{
		return gettextOfActuArticleTitle.getText();
	}

}
