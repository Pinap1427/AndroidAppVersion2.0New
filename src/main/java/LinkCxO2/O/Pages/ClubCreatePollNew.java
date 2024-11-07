package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class ClubCreatePollNew extends AbstractComponent {

	public ClubCreatePollNew(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "(//com.horcrux.svg.PathView[contains(@class, 'PathView') and @index='20'])[1]")
	private WebElement ClubBtn;

	public void ClickonClubButton() {
		action.clickElement(ClubBtn);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	private WebElement myClubBtn;

	public void ClickonMyClubButton() {
		action.clickElement(myClubBtn);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"My Testing Club\"]")
	private WebElement firstClub;

	public void ClickonFirstClub() {
		action.clickElement(firstClub);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement ClickonPost;

	public void ClickonPostButton() {
		action.clickElement(ClickonPost);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]")
	private WebElement clickonPlus;

	public void ClickonPlusIcon() {
		action.clickElement(clickonPlus);
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

	@FindBy(xpath = "//android.widget.TextView[@text=\" Business Growth\"]")
	private WebElement SelectCategoryfromdd;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Confirm\"]")
	private WebElement confmButton;

	public void SelectCategoryfromDropdown() throws InterruptedException {
		action.clickElement(SelectCategoryfromdd);
		Thread.sleep(3000);
		action.clickElement(confmButton);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Add Question\"]")
	private WebElement enterQues;

	public void EnterQuestion() {
		action.sendKeysElement(enterQues, "What is your Favorite outdoor activity?");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	private WebElement gettextExpectedQuestion;

	public String GetFirstTextofPoll() {
		return gettextExpectedQuestion.getText();
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 1\"]")
	private WebElement enteroption1;

	public void EnterOption1() {
		action.sendKeysElement(enteroption1, "Hiking");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 2\"]")
	private WebElement enteroption2;

	public void EnterOption2() {
		action.sendKeysElement(enteroption2, "Biking");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 3\"]")
	private WebElement enteroption3;

	public void EnterOption3() {
		action.sendKeysElement(enteroption3, "Swimming");
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Option 4\"]")
	private WebElement enteroption4;

	public void EnterOption4() {
		action.sendKeysElement(enteroption4, "Camping");
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Select Item\"]")
	private WebElement pollenddrop;

	public void ClickonPollEndDropDown() {
		action.clickElement(pollenddrop);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"In 1 Day\"]")
	private WebElement selectDay;

	public void SelectPollEndDate() {
		action.clickElement(selectDay);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Your Poll\"]")
	private WebElement publishPoll;

	public void ClickonPublishPollButton() {
		action.clickElement(publishPoll);
	}

	@FindBy(xpath = "(//android.widget.TextView)[12]")
	private WebElement verifyPolll;

	public boolean VerifyPollCreatedorNot() {
		return action.isDisplay(verifyPolll);
	}

	@FindBy(xpath = "(//android.widget.TextView)[14]")
	private WebElement gettextActualQuestion;

	public String GetLastTextofPoll() {
		return gettextActualQuestion.getText();
	}

}
