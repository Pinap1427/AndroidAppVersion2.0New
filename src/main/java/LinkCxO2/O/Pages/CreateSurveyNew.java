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

	public void EnterTitle() {
		action.sendKeysElement(titleEnt, "Testing");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Survey Description\"]")
	private WebElement DescEnt;

	public void EnterDescriptionforSurvey() {
		action.sendKeysElement(DescEnt, "IPL");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateg;

	public void ClickonSelectCategorySurvey() {
		action.clickElement(selectCateg);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Business Growth   \"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement SelectCategoryfromdd;

	public void SelectCategoryfromDropdownSurvey() {
		action.clickElement(SelectCategoryfromdd);
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
		action.sendKeysElement(enterQues, "Who won the ipl 2024?");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enteroption1;

	public void EnterOption1() {
		action.sendKeysElement(enteroption1, "KKR");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enteroption2;

	public void EnterOption2() {
		action.sendKeysElement(enteroption2, "SRH");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 3\"]")
	private WebElement enteroption3;

	public void EnterOption3() {
		action.sendKeysElement(enteroption3, "RR");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 4\"]")
	private WebElement enteroption4;

	public void EnterOption4() {
		action.sendKeysElement(enteroption4, "RCB");
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
		action.sendKeysElement(enterSecondQues, "Who won the ipl 2023?");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enterSecondQuestionoption1;

	public void EnterSecondOption1() {
		action.sendKeysElement(enterSecondQuestionoption1, "CSK");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enterSecondQuestionoption2;

	public void EnterSecondOption2() {
		action.sendKeysElement(enterSecondQuestionoption2, "GT");
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

	public void EnterThirdQuestion() {
		action.sendKeysElement(enterThirdQues, "Who Won The Orange Cap in IPL 2024?");
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

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"+ 2 More...\"]/android.widget.TextView")
	private WebElement verifySurvey;

	public boolean VerifySuveyCreatedorNOT() {
		return action.isDisplay(verifySurvey);
	}

}
