package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CreateJobNEw extends AbstractComponent {

	public CreateJobNEw(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcon;

	public void ClickonPlusIcon() {
		action.clickElement(plusIcon);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title \"]")
	private WebElement jobTitle;

	public void EnterJobTitle() {
		action.sendKeysElement(jobTitle, "Senior PMO");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement returnGettextofjobTitle;

	public String ExpectedGettextJOBTitle() {
		return returnGettextofjobTitle.getText();
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Add your Company Name\"]")
	private WebElement companyEnter;

	public void EnterCompanyName() {
		action.sendKeysElement(companyEnter, "Deloitte");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Industry\"]")
	private WebElement selectIndclk;

	public void ClickonSelectIndustry() {
		action.clickElement(selectIndclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" IT & ITES\"]/android.widget.CheckBox")
	private WebElement selectIndustry;

	public void SelectIndustryFromDD() {
		action.clickElement(selectIndustry);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement confirmBt;

	public void ClickonConfirmButton() {
		action.clickElement(confirmBt);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Job Type\"]")
	private WebElement selectJobType;

	public void ClickonSelectJobType() {
		action.clickElement(selectJobType);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Full Time\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectJobtypeFromDD;

	public void SelectJobTypeFromDropdown() {
		action.clickElement(selectJobtypeFromDD);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Workplace Type\"]")
	private WebElement selectWorkplace;

	public void ClickonWorkplace() {
		action.clickElement(selectWorkplace);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" On-Site\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectWorkplaceFromDD;

	public void SelectWorkplaceFromDropdown() {
		action.clickElement(selectWorkplaceFromDD);
	}

	String SkillRequires = "Agile Methodologies, Reporting , Certified SAP Consultant , Monitoring Performance , Project Management , Project Planning , Risk Management , Scrum , Six Sigma , Stakeholder Management";
	@FindBy(xpath = "//android.widget.EditText[@text=\"Skills *\"]")
	private WebElement enterSkill;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Java\"]/android.widget.TextView")
	private WebElement selectJava;

	public void EnterJobSkills() throws InterruptedException {
		action.sendKeysElement(enterSkill, "Java");
		Thread.sleep(3000);
		action.clickElement(selectJava);

	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Choose the Job Location\"]")
	private WebElement locationEnt;

	public void EnterLocation() {
		action.sendKeysElement(locationEnt, "Mumbai");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement continueBt;

	public void ClickonContinueButton() {
		action.clickElement(continueBt);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Min Exp\"]")
	private WebElement MinExp;

	public void ClickonMinExp() {
		action.clickElement(MinExp);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" 10 Years\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectMinyear;

	public void SelectMinExp() {
		action.clickElement(selectMinyear);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Max Exp\"]")
	private WebElement MaxExp;

	public void ClickonMaxExp() {
		action.clickElement(MaxExp);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"11 Years\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectMaxyear;

	public void SelectMaxExp() {
		action.clickElement(selectMaxyear);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Currency\"]")
	private WebElement clickCurrency;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INR (₹)\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectINR;

	public void SelectCurrency() throws InterruptedException {
		action.clickElement(clickCurrency);
		Thread.sleep(1000);
		action.clickElement(selectINR);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Salary\"]")
	private WebElement clickSalary;

	public void ClickonSalary() {
		action.clickElement(clickSalary);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" 40 Lacs\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectSal;

	public void SelectMinSalary() {
		action.clickElement(selectSal);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Max Salary\"]")
	private WebElement clickMAxSalary;

	public void ClickonMAxSalary() {
		action.clickElement(clickMAxSalary);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"50 Lacs\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectMaxSal;

	public void SelectMaxSalary() {
		action.clickElement(selectMaxSal);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Company\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement companyRadBtn;

	public void ClickonCompanyRadioButton() {
		action.clickElement(companyRadBtn);
	}

	String JD = "About the job\r\n"
			+ "Your potential, unleashed.\r\n"
			+ "\r\n"
			+ "India’s impact on the global economy has increased at an exponential rate and Deloitte presents an opportunity to unleash and realise your potential amongst cutting edge leaders, and organisations shaping the future of the region, and indeed, the world beyond.\r\n"
			+ "At Deloitte, your whole self to work, every day. Combine that with our drive to propel with purpose and you have the perfect playground to collaborate, innovate, grow, and make an impact that matters.\r\n"
			+ "";
	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement JdEnt;

	public void EnterJD() {
		action.sendKeysElement(JdEnt, JD);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]/android.widget.TextView")
	private WebElement continueBtnJob;

	public void ClickonContinueButtoninJOb() {
		action.clickElement(continueBtnJob);
	}
	//895,134
	@FindBy(xpath = "(//com.horcrux.svg.PathView)[3]")
	private WebElement myJOb;
	
	public void TouchClickonMyJob() throws InterruptedException
	{
		action.clickElement(myJOb);
//		TouchAction action=new TouchAction(driver);
//		action.tap(PointOption.point(895, 134)).perform();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[2])[2]")
	private WebElement savedTab;
	public void ClickonSavedTab()
	{
		action.clickElement(savedTab);
	}
	@FindBy(xpath = "(//android.widget.TextView)[2]")
	private WebElement returnActualGettextofjobTitle;
	
	public String ActualGettextJOBTitle() {
		return returnActualGettextofjobTitle.getText();
	}

	
}
