package LinkCxO2.O.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CompanyCreatePost extends AbstractComponent {

	public CompanyCreatePost(AndroidDriver driver) throws Exception {
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
	@FindBy(xpath = "//android.widget.TextView[@text=\"Apmosys\"]")
	private WebElement CompanyClick;

	public void ClickonCompanyFromList() {
		action.clickElement(CompanyClick);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcon;

	public void ClickonPlusIcon() {
		action.clickElement(plusIcon);
	}
		
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Create a Post, Create a Post and Engage with Your Network and empower your voice.\"]/android.widget.TextView[1]")
	private WebElement createPost;

	public void ClickonCreatePost() {
		action.clickElement(createPost);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement enterText;

	public void EnterTextForPOst() {
		action.sendKeysElement(enterText, "Meet the world’s most powerful, ultra-mobile, next-gen AI PC. Swipe to know more! ");
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
	private WebElement GettextofPostTitle;
	public String GetExpectedTitlePost()
	{
		return GettextofPostTitle.getText();
		
	}

	@FindBy(xpath = "(//android.view.ViewGroup)[14]")
	private WebElement photosicn;

	public void ClickonPhotosIcon() {
		action.clickElement(photosicn);
	}
	
//	com.android.packageinstaller:id/permission_allow_button
	
	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allowBtn;
	public void ClickonAllowButton()
	{
		action.clickElement(allowBtn);
	}
	
	public void EnterBtn() throws AWTException, InterruptedException
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "(//android.widget.ImageView)[15]")
	private WebElement selectImg;

	public void SelectImage() throws InterruptedException {
		Thread.sleep(2000);
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
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement backBtn;
	public void ClickonBackIcon() throws InterruptedException
	{
		action.clickElement(backBtn);
		Thread.sleep(2000);
		action.clickElement(CompanyClick);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement GettextofPostTitleLast;
	public String GetActualTitlePost()
	{
		return GettextofPostTitleLast.getText();
		
	}
}
