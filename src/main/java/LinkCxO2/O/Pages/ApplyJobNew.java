package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class ApplyJobNew extends AbstractComponent {

	public ApplyJobNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//android.view.View[@content-desc=\"Jobs\"]/android.widget.TextView")
	private WebElement JobsBtn;

	public void ClickonJobsButton() {
		action.clickElement(JobsBtn);
	}

	@FindBy(xpath = "(//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1])[2]")
	private WebElement SecondJObClk;
	
	@FindBy(xpath = "(//android.widget.TextView)[2]")
	private WebElement gettextJob;
	
	public String getFirstAppliedJobText()
	{
		return gettextJob.getText();
		
	}


	public void ClickonSecondJob() {
		action.clickElement(SecondJObClk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Apply\"]/android.widget.TextView")
	private WebElement ApplyJb;

	public void ClickonApplyJob() {
		action.clickElement(ApplyJb);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Your Email Id\"]")
	private WebElement Emailid;

	public void EnterEmailid() {
		action.sendKeysElement(Emailid, "kprabhat956@gmail.com");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement clickCurrency;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INR (₹)\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectINR;

	public void SelectCurrency() throws InterruptedException {
		action.clickElement(clickCurrency);
		Thread.sleep(1000);
		action.clickElement(selectINR);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement clickSal;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" 40 Lacs\"]/android.widget.CheckBox")
	private WebElement selectSalary;

	public void SelectSalaryFromDD() throws InterruptedException {
		action.clickElement(clickSal);
		Thread.sleep(1000);
		action.clickElement(selectSalary);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Industry\"]")
	private WebElement SElectIndustryClk;

	public void ClickonSelectIndustry() {
		action.clickElement(SElectIndustryClk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" IT & ITES\"]/android.widget.CheckBox")
	private WebElement SelectIndustryfrmDD;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement ConfmBtn;

	public void SelectIndustryFromDropdown() throws InterruptedException {
		action.clickElement(SelectIndustryfrmDD);
		Thread.sleep(1000);
		action.clickElement(ConfmBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Choose the Preferred Location\"]")
	private WebElement LocationClk;

	public void ClickonLocation() {
		action.clickElement(LocationClk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Mumbai\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectLocation;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Mumbai\"]/android.widget.TextView")
	private WebElement locationEnt;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement ConfirmLocationBtn;

	public void SelectLocationFromDropdown() throws InterruptedException {
		action.clickElement(locationEnt);
		Thread.sleep(1000);
		action.clickElement(ConfirmLocationBtn);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Yes\"])[1]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement openforRelationRadiobtn;

	public void ClickonopenforRelationRadioButton() {
		action.clickElement(openforRelationRadiobtn);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Yes\"])[2]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement servingNoticePeriodRadioBtn;

	public void ClickonservingNoticePeriodRadioButton() {
		action.clickElement(servingNoticePeriodRadioBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select No. of Days\"]")
	private WebElement ClickNoOfDays;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" 15 days\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement SelectNoOFDays;

	public void SElectNoOfDays() throws InterruptedException {
		action.clickElement(ClickNoOfDays);
		Thread.sleep(1000);
		action.clickElement(SelectNoOFDays);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Attach Resume\"]")
	private WebElement clickAttachResume;
	@FindBy(xpath = "//android.widget.TextView[@text=\"dummy-pdf_2.pdf\"]")
	private WebElement SelectResume;

	public void AttachResume() throws InterruptedException {
		action.clickElement(clickAttachResume);
		Thread.sleep(3000);
		action.clickElement(SelectResume);
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement SubmitBtn;

	public void ClickonSubmitButton() {
		action.clickElement(SubmitBtn);
	}

	@FindBy(xpath = "(//android.widget.TextView)[2]")
	private WebElement VerifyAppliedJob;
	public String getLastappliedJObText()
	{
		return VerifyAppliedJob.getText();
	}
	
	
	
}
