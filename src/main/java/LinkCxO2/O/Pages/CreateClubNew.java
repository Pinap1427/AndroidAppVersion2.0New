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

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1676909412539.png, 36.01 kB, Oct 21\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]") // first
																																																	// image
																																																	// will
																																																	// be
																																																	// selected
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
	// scroll Down by co ordinates

	@FindBy(xpath = "(//android.widget.TextView)[3]")
	private WebElement returnactualGettextofTitle;

	public String ActualGettexTitle() {
		return returnactualGettextofTitle.getText();
	}

	//// View Club Details////// B
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement ClickClub;

	public void ClickonClub() {
		action.clickElement(ClickClub);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]/android.widget.TextView")
	private WebElement VerifyClubDet;

	public boolean VerifyClubDetails() {
		return action.isDisplay(VerifyClubDet);
	}

	///////// Edit Club/////////// C
	public void clickonEdit() {
		action.clickElement(VerifyClubDet);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"RNE__Image__children__container\"]")
	private WebElement addimgclkEdit;

	public void ClickonAddImageEdit() {
		action.clickElement(addimgclkEdit);
	}

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1729406282472.jpg, 131 kB, Oct 21\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]") // first
																																																	// image
																																																	// will
																																																	// be
																																																	// selected
	private WebElement imgSelcEdit;

	public void SelectImageEdit() throws InterruptedException {
		Thread.sleep(2000);
		action.clickElement(imgSelcEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement enterClubTitleEdit;

	public void EnterClubTitleEdit() {
		action.sendKeysElement(enterClubTitleEdit, "Stocks Club");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement returnGettextofTitleEdit;

	public String ExpectedGettexTitleEdit() {
		return returnGettextofTitle.getText();
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	private WebElement clubDetailsEdit;

	String ClubEditDetails = "The India hse Stocks 2024 is a knowledge-based physical conference and the 7th edition of the flagship program hse summit by Synnex group. The 2-day summit strives to bring all key stakeholders—government officials, hse experts, industry associations and hse evangelists, technical leaders—together to discuss occupational safety and health & EHS as a priority for companies while reiterating the significance and business benefits of investing in the health and safety of the workforce. This year the India hse summit & awards 2024 is taking the initiative to spread awareness regarding the importance of occupational safety and health for the workforce in the ongoing covid19 pandemic with digitalization and technological solutions available to serve and save better";

	public void EnterClubDetailsEdit() {
		action.sendKeysElement(clubDetailsEdit, ClubEditDetails);
	}

//////////////////Add Scroll Method here //////////////////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Private\"]/android.widget.TextView")
	private WebElement PrivateRadiobtn;

	public void ClickonPrivate() {
		action.clickElement(PrivateRadiobtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")
	private WebElement FreeClubBtn;

	public void ClickonFreeToggleButton() {
		action.clickElement(FreeClubBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private WebElement selectIndclkEdit;

	public void ClickonSelectIndustryEdit() {
		action.clickElement(selectIndclkEdit);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" IT & ITES\"]/android.widget.TextView")
	private WebElement selectIndustryEdit;

	public void SelectIndustryFromDDEdit() {
		action.clickElement(selectIndustryEdit);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement confirmBtEdit;

	public void ClickonConfirmButtonEdit() {
		action.clickElement(confirmBtEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement selectCateclkEdit;

	public void ClickonSelectCategoryEdit() {
		action.clickElement(selectCateclkEdit);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Technology and IT\"]/android.widget.TextView")
	private WebElement selectCategoryEdit;

	public void SelectCategoryFromDDEdit() throws InterruptedException {
		// use Swipe down with co ordinates method
		action.clickElement(selectCategoryEdit);
		Thread.sleep(1000);
		action.clickElement(confirmBtEdit);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Update Club\"]/android.widget.TextView")
	private WebElement UpdateClubBClk;

	public void ClickonUpdateClub() {
		action.clickElement(UpdateClubBClk);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement returnactualGettextofTitlEdit;

	public String ActualGettexTitleEdit() {
		return returnactualGettextofTitlEdit.getText();
	}

	////// Add member in Club///////D
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"JJ, Members\"]/android.widget.TextView")
	private WebElement MembersClk;

	public void ClickonMembers() {
		action.clickElement(MembersClk);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcnAddMember;

	public void ClickonPlusIconAddMember() {
		action.clickElement(plusIcnAddMember);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Select All\"]/android.widget.TextView")
	private WebElement selectAllBtn;

	public void ClickonSelectAll() {
		action.clickElement(selectAllBtn);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Invite\"]/android.widget.TextView")
	private WebElement InviteBtn;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement BackBtnAddMember;

	public void ClickonInvite() throws InterruptedException {
		action.clickElement(InviteBtn);
		Thread.sleep(1000);
		action.clickElement(BackBtnAddMember);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.View/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement InvitedTab;

	public void ClickonInvitedTab() {
		action.clickElement(InvitedTab);
	}

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Alternate LxText\"]")
	private WebElement verifyInvitedMember;

	public boolean VerifyInvitedmembers() {
		return action.isDisplay(verifyInvitedMember);
	}

	////////// Create Post ////////// on Hold
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement ClickPost;
	public void ClickonPost()
	{
		action.clickElement(ClickPost);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]")
	private WebElement plusIconPost;
	public void ClickonPlusIconPost()
	{
		action.clickElement(plusIconPost);
	}
	


}
