package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class CompanyCreateaSurveyNew extends AbstractComponent {

	public CompanyCreateaSurveyNew(AndroidDriver driver) throws Exception {
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

//		absCom.swipDownByCoordinates(517, 2122, 454);
//		testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
	@FindBy(xpath = "//android.widget.TextView[@text=\"Apmosys\"]")
	private WebElement CompanyClick;

	public void ClickonCompanyFromList() {
		action.clickElement(CompanyClick);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.view.ViewGroup")
	private WebElement pluticon;

	public void ClickonPlusIcon() {
		action.clickElement(pluticon);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Create a Survey, Create a Survey & gather Insights and Decisions Together.\"]/android.widget.TextView[1]")
	private WebElement SurveyBtn;

	public void ClickonSurveybutton() {
		action.clickElement(SurveyBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title\"]")
	private WebElement titleEnt;

	public void EnterTitle() {
		action.sendKeysElement(titleEnt, "Employee Engagement and Satisfaction Survey ");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement gettextExpectTitle;

	public String GetFirstTextofSurvey() {
		return gettextExpectTitle.getText();
	}
	///

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Survey Description\"]")
	private WebElement DescEnt;

	public void EnterDescriptionforSurvey() {
		action.sendKeysElement(DescEnt, "We value your feedback and want to ensure we are creating the best possible work environment. Please take a few minutes to complete this survey. Your responses are anonymous and will help us improve.");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateg;

	public void ClickonSelectCategorySurvey() {
		action.clickElement(selectCateg);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.TextView")
	private WebElement SelectCategoryfromdd;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement confimBtnPOll;
	public void SelectCategoryfromDropdownSurvey() throws InterruptedException {
		action.clickElement(SelectCategoryfromdd);
		Thread.sleep(1000);
		action.clickElement(confimBtnPOll);
	}

	// use swipe down by co ordinates using these 504,2017,487,614

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Select Item\"])[1]/android.widget.TextView")
	private WebElement firstQuestionType;

	public void ClickonFirstQuestionType() {
		action.clickElement(firstQuestionType);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Multiple Choice\"]/android.widget.TextView")
	private WebElement selectMultiple;

	public void ClickonMultipleChoiceOpt() {
		action.clickElement(selectMultiple);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Add Option\"]")
	private WebElement optionAdd;

	public void ClickonOptionAdd2Time() throws InterruptedException {
		action.clickElement(optionAdd);
		Thread.sleep(2000);
		action.clickElement(optionAdd);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Question\"]")
	private WebElement enterQues;

	public void EnterQuestion() {
		action.sendKeysElement(enterQues, "Overall, how satisfied are you with your current job?");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enteroption1;

	public void EnterOption1() {
		action.sendKeysElement(enteroption1, "Very satisfied");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enteroption2;

	public void EnterOption2() {
		action.sendKeysElement(enteroption2, "Satisfied");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 3\"]")
	private WebElement enteroption3;

	public void EnterOption3() {
		action.sendKeysElement(enteroption3, "Neutral");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 4\"]")
	private WebElement enteroption4;

	public void EnterOption4() {
		action.sendKeysElement(enteroption4, "Neutral");
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Select Item\"])[1]/android.widget.TextView")
	private WebElement secondQuestionType;

	public void ClickonSecondQuestionType() {
		action.clickElement(secondQuestionType);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Select\"]")
	private WebElement selectoption;

	public void ClickonSelectOpt() {
		action.clickElement(selectoption);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Question\"]")
	private WebElement enterSecondQues;

	public void EnterSecondQuestion() {
		action.sendKeysElement(enterSecondQues, "Are you working in week ends?");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enterSecondQuestionoption1;

	public void EnterSecondOption1() {
		action.sendKeysElement(enterSecondQuestionoption1, "Yes");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enterSecondQuestionoption2;

	public void EnterSecondOption2() {
		action.sendKeysElement(enterSecondQuestionoption2, "No");
	}

	// again call swipe by coordinates method using these 504,2017,487,614
	@FindBy(xpath = "//android.widget.Button[@content-desc=\" , Add Another Question\"]/android.widget.TextView[2]")
	private WebElement addquestion;

	public void ClickonAddAnotherQuestion() {
		action.clickElement(addquestion);
	}
	// again call swipe by coordinates method using these 504,2017,487,614

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Select Item\"])[1]/android.widget.TextView")
	private WebElement thirdQuestionType;

	public void ClickonThirdQuestionType() {
		action.clickElement(thirdQuestionType);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Text\"]/android.widget.TextView")
	private WebElement selectTextOpt;

	public void ClickonTextOption() {
		action.clickElement(selectTextOpt);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Question\"]")
	private WebElement enterThirdQues;

	public void EnterThirdQuestion() {
		action.sendKeysElement(enterThirdQues, "What areas do you think need improvement within the organization?");
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Select Item\"])[1]/android.widget.TextView")
	private WebElement surveyEnd;

	public void ClickonSurveyEndDropDown() {
		action.clickElement(surveyEnd);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"In 1 Day\"]/android.widget.TextView")
	private WebElement SelectEndDate;

	public void ClickonDatetoEndSurvey() {
		action.clickElement(SelectEndDate);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Create Your Survey\"]/android.widget.TextView")
	private WebElement createYourSur;

	public void ClickonCreateYourSurveyfinal() {
		action.clickElement(createYourSur);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement backBtn;

	public void ClickonBackIcon() throws InterruptedException {
		action.clickElement(backBtn);
		Thread.sleep(4000);
		action.clickElement(CompanyClick);
	}

	@FindBy(xpath = "(//android.widget.TextView)[14]")
	private WebElement gettextActualTitle;

	public String GetLastTextofSurvey() {
		return gettextActualTitle.getText();
	}

}
