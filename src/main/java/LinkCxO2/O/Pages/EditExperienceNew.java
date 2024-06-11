package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class EditExperienceNew extends AbstractComponent {

	public EditExperienceNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement editExp;
	public void ClickonEditExperience()
	{
		action.clickElement(editExp);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement firstExpEdit;
	public void ClickonFirstExperienceEdit()
	{
		action.clickElement(firstExpEdit);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement Design;
	public void EnterEditedDesign() throws InterruptedException
	{
		action.clearElement(Design);
		Thread.sleep(2000);
		action.sendKeysElement(Design, "VP");
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement selectJobTypeEdited;
	public void ClickonEditedJobType()
	{
		action.clickElement(selectJobTypeEdited);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Others   \"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectJobTypeEdit;
	public void SelectEditedJobType()
	{
		action.clickElement(selectJobTypeEdit);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	private WebElement companyNameEdited;
	public void EnterCompanyNameEdit() throws InterruptedException
	{
		action.clearElement(companyNameEdited);
		Thread.sleep(2000);
		action.sendKeysElement(companyNameEdited, "Apmosys");
	}
		
	@FindBy(xpath = "//android.widget.EditText[@text=\"India\"]")
	private WebElement locationEdited;
	public void EnterLocationEdit() throws InterruptedException
	{
		action.clearElement(locationEdited);
		Thread.sleep(2000);
		action.sendKeysElement(locationEdited, "Ghansoli");
	}
		
	@FindBy(xpath = "//android.widget.CheckBox[@resource-id=\"RNE__CheckBox__Wrapper\"]")
	private WebElement checkbox;

	public void ClickonCheckBox() {
		action.clickElement(checkbox);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement dateSelect;

	public void ClickonSelectDate() {
		action.clickElement(dateSelect);
	}

//	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Previous month\"]")
//	private WebElement prvMonth;
	@FindBy(xpath = "//android.view.View[@text=\"1\"]")
	private WebElement Select1stDate;
	@FindBy(xpath = "//android.widget.Button[@text=\"OK\"]")
	private WebElement okBtn;

	public void SelectDate() throws InterruptedException {
//		action.clickElement(prvMonth);
		Thread.sleep(1000);
		action.clickElement(Select1stDate);
		Thread.sleep(1000);
		action.clickElement(okBtn);
		Thread.sleep(1000);

	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement addSummaryEdited;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]")
	private WebElement forclearSummary;

	public void EnterSummary() throws InterruptedException {
		action.clearElement(forclearSummary);
		Thread.sleep(2000);
		action.sendKeysElement(addSummaryEdited, "Automation Testing");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveBtn;

	public void ClickonSaveButton() {
		action.clickElement(saveBtn);
	}
//740,2072,735,1332

	@FindBy(xpath = "(//android.widget.TextView)[8]")
	private WebElement verifyexp;

	public boolean VerifyEditedExperienceAddedorNOT() {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(verifyexp));
		return action.isDisplay(verifyexp);
	}
}
