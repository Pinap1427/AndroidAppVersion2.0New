package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class CompanyCreatePollNew extends AbstractComponent {

	public CompanyCreatePollNew(AndroidDriver driver) throws Exception {
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
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"New testing Company @@@@, SFGDFGDGFDGDG, SFDFGDGD\"]/android.widget.TextView[1]")
	private WebElement CompanyClick;

	public void ClickonCompanyFromList() {
		action.clickElement(CompanyClick);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.view.ViewGroup")
	private WebElement pluticon;

	public void ClickonPlusIcon() {
		action.clickElement(pluticon);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Create a Poll, Create a Poll & gather Insights and Decisions Together.\"]/android.widget.TextView[1]")
	private WebElement pollCreateBtn;

	public void ClickonCreatePoll() {
		action.clickElement(pollCreateBtn);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Add Option\"]/android.widget.TextView")
	private WebElement optionAdd;

	public void ClickonOptionAddButton() throws InterruptedException {
		action.clickElement(optionAdd);
		Thread.sleep(2000);
		action.clickElement(optionAdd);
		// 2 times
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateg;

	public void ClickonSelectCategory() {
		action.clickElement(selectCateg);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement SelectCategoryfromdd;

	public void SelectCategoryfromDropdown() {
		action.clickElement(SelectCategoryfromdd);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Add Question\"]")
	private WebElement enterQues;

	public void EnterQuestion() {
		action.sendKeysElement(enterQues, "Who won the ipl 2024?");
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	private WebElement gettextExpectedQuestion;
	
	public String GetFirstTextofPoll() {
		return gettextExpectedQuestion.getText();
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

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Select Item\"]")
	private WebElement pollenddrop;

	public void ClickonPollEndDropDown() {
		action.clickElement(pollenddrop);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"In 1 Day\"]")
	private WebElement selectDay;

	public void SelectPollEndDate() {
		action.clickElement(selectDay);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Your Poll\"]")
	private WebElement publishPoll;

	public void ClickonPublishPollButton() {
		action.clickElement(publishPoll);
	}

	@FindBy(xpath = "(//android.view.ViewGroup)[21]")
	private WebElement verifyPolll;

	public boolean VerifyPollCreatedorNot() {
		return action.isDisplay(verifyPolll);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement backBtn;

	public void ClickonBackIcon() throws InterruptedException {
		action.clickElement(backBtn);
		Thread.sleep(4000);
		action.clickElement(CompanyClick);
	}

	@FindBy(xpath = "(//android.widget.TextView)[14]")
	private WebElement gettextActualQuestion;

	public String GetLastTextofPoll() {
		return gettextActualQuestion.getText();
	}

}
