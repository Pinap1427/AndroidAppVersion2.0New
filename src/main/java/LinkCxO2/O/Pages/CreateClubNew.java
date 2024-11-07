package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class CreateClubNew extends AbstractComponent {

	public CreateClubNew(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "(//com.horcrux.svg.PathView[contains(@class, 'PathView') and @index='20'])")
	private WebElement ClubBtn;

	public void ClickonClubButton() {
		action.clickElement(ClubBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcon;

	public void ClickonPlusIcon() {
		action.clickElement(plusIcon);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"RNE__Image__children__container\"]")
	private WebElement addimgclk;

	public void ClickonAddImage() {
		action.clickElement(addimgclk);
	}

	@FindBy(xpath = "(//android.widget.ImageView)[33]") //first image will be selected
	private WebElement imgSelc;

	public void SelectImage() throws InterruptedException {
		Thread.sleep(2000);
		action.clickElement(imgSelc);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Club Title\"]")
	private WebElement enterClubTitle;

	public void EnterClubTitle(String ClubTitle) {
		action.sendKeysElement(enterClubTitle, ClubTitle);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement returnGettextofTitle;

	public String ExpectedGettexTitle() {
		return returnGettextofTitle.getText();
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Club Details\"]")
	private WebElement clubDetails;

	public void EnterClubDetails(String ClubDetails) {
		action.sendKeysElement(clubDetails, ClubDetails);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Currency\"]")
	private WebElement clickCurrency;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INR (₹)\"]/android.widget.TextView")
	private WebElement selectINR;

	public void SelectCurrency() throws InterruptedException {
		action.clickElement(clickCurrency);
		Thread.sleep(1000);
		action.clickElement(selectINR);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	private WebElement amountEnter;

	public void EnterAmount() {
		action.sendKeysElement(amountEnter, "999");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Industry\"]")
	private WebElement selectIndclk;

	public void ClickonSelectIndustry() {
		action.clickElement(selectIndclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Media / Entertainment / Communication\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement selectIndustry;

	public void SelectIndustryFromDD() {
		action.clickElement(selectIndustry);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement confirmBt;

	public void ClickonConfirmButton() {
		action.clickElement(confirmBt);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateclk;

	public void ClickonSelectCategory() {
		action.clickElement(selectCateclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Operations\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement selectCategory;

	public void SelectCategoryFromDD() {
		// use Swipe down with co ordinates method
		action.clickElement(selectCategory);
	}

	// use ClickonConfirmButton after this in main class

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Create My Club\"]")
	private WebElement CreateMyClubBClk;

	public void ClickonCreateMyClub() {
		action.clickElement(CreateMyClubBClk);
	}

	@FindBy(xpath = "(//com.horcrux.svg.PathView[contains(@class, 'PathView') and @index='0'])[3]")
	private WebElement selectConn;

	public void SelectFirstConnection() {
		action.clickElement(selectConn);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Club\"]/android.widget.TextView")
	private WebElement publishClub;

	public void ClickonPublishClub() {
		action.clickElement(publishClub);
	}
	//scroll Down by co ordinates
	
	@FindBy(xpath = "(//android.widget.TextView)[3]")
	private WebElement returnactualGettextofTitle;
	public String ActualGettexTitle() {
		return returnactualGettextofTitle.getText();
	}
	

}
