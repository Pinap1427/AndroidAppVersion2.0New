package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class CreateSurveyNew extends AbstractComponent {

	public CreateSurveyNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
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

	public void EnterTitle(String SurveyTitle) {
		action.sendKeysElement(titleEnt, SurveyTitle);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Survey Description\"]")
	private WebElement DescEnt;

	public void EnterDescriptionforSurvey(String SurveyDesc) {
		action.sendKeysElement(DescEnt, SurveyDesc);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateg;

	public void ClickonSelectCategorySurvey() {
		action.clickElement(selectCateg);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.TextView")
	private WebElement SelectCategoryfromdd;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement confBtn;

	public void SelectCategoryfromDropdownSurvey() throws InterruptedException {
		action.clickElement(SelectCategoryfromdd);
		Thread.sleep(1000);
		action.clickElement(confBtn);
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

	public void EnterQuestion(String SurveyQuest1) {
		action.sendKeysElement(enterQues, SurveyQuest1);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enteroption1;

	public void EnterOption1(String SurveyOption1Q1) {
		action.sendKeysElement(enteroption1, SurveyOption1Q1);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enteroption2;

	public void EnterOption2(String SurveyOption2Q1) {
		action.sendKeysElement(enteroption2, SurveyOption2Q1);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 3\"]")
	private WebElement enteroption3;

	public void EnterOption3(String SurveyOption3Q1) {
		action.sendKeysElement(enteroption3, SurveyOption3Q1);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 4\"]")
	private WebElement enteroption4;

	public void EnterOption4(String SurveyOption4Q1) {
		action.sendKeysElement(enteroption4, SurveyOption4Q1);
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

	public void EnterSecondQuestion(String SurveyQuest2) {
		action.sendKeysElement(enterSecondQues, SurveyQuest2);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enterSecondQuestionoption1;

	public void EnterSecondOption1(String SurveyOption1Q2) {
		action.sendKeysElement(enterSecondQuestionoption1, SurveyOption1Q2);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enterSecondQuestionoption2;

	public void EnterSecondOption2(String SurveyOption2Q2) {
		action.sendKeysElement(enterSecondQuestionoption2, SurveyOption2Q2);
	}

//again call swipe by coordinates method using these 504,2017,487,614
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

	public void EnterThirdQuestion(String SurveyQuest3) {
		action.sendKeysElement(enterThirdQues, SurveyQuest3);
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

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement verifySurvey;

	public boolean VerifySuveyCreatedorNOT() {
		return action.isDisplay(verifySurvey);
	}

}
