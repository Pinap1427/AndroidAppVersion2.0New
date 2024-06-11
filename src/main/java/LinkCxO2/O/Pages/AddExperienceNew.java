package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class AddExperienceNew extends AbstractComponent {

	public AddExperienceNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Logo\"]/following-sibling::android.view.ViewGroup[4]")
	private WebElement profileClick;

	public void ClickonProfile() {
		action.clickElement(profileClick);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusbtn;

	public void ClickonPlusIconExp() {
		action.clickElement(plusbtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Ex. Retail Sales Manager \"]")
	private WebElement Design;

	public void EnterDesignation() {
		action.sendKeysElement(Design, "Product Manager");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Job Type\"]")
	private WebElement clickSelectJob;

	public void ClickonSelectJobType() {
		action.clickElement(clickSelectJob);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Full Time   \"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectJobType;

	public void SelectJobTypeFromDropdown() {
		action.clickElement(selectJobType);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Company Name *\"]/following-sibling::android.widget.EditText[1]")
	private WebElement companyName;

	public void EnterCompanyName() {
		action.sendKeysElement(companyName, "LinkCxO");
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Location *\"]/following-sibling::android.widget.EditText[1]")
	private WebElement EnterLoc;

	public void EnterLocation() {
		action.sendKeysElement(EnterLoc, "India");
	}

	@FindBy(xpath = "//android.widget.CheckBox[@resource-id=\"RNE__CheckBox__Wrapper\"]")
	private WebElement checkbox;

	public void ClickonCheckBox() {
		action.clickElement(checkbox);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Date\"]")
	private WebElement dateSelect;

	public void ClickonSelectDate() {
		action.clickElement(dateSelect);
	}

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Previous month\"]")
	private WebElement prvMonth;
	@FindBy(xpath = "//android.view.View[@text=\"1\"]")
	private WebElement Select1stDate;
	@FindBy(xpath = "//android.widget.Button[@text=\"OK\"]")
	private WebElement okBtn;

	public void SelectDate() throws InterruptedException {
		action.clickElement(prvMonth);
		Thread.sleep(1000);
		action.clickElement(Select1stDate);
		Thread.sleep(1000);
		action.clickElement(okBtn);
		Thread.sleep(1000);

	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement addSummary;

	public void EnterSummary() {
		action.sendKeysElement(addSummary, "Testing");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveBtn;

	public void ClickonSaveButton() {
		action.clickElement(saveBtn);
	}
//740,2072,735,1332

	@FindBy(xpath = "(//android.widget.TextView)[8]")
	private WebElement verifyexp;

	public boolean VerifyExperienceAddedorNOT() {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(verifyexp));
		return action.isDisplay(verifyexp);
	}

}
