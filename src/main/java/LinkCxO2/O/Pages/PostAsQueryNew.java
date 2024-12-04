package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class PostAsQueryNew extends AbstractComponent {

	public PostAsQueryNew(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Post as a Query, Create a Query and Collaborate on Ideas and with Community.\"]/android.widget.TextView[1]")
	private WebElement PostAsQueryBtn;

	public void ClickonPostAsQuery() {
		action.clickElement(PostAsQueryBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateg;

	public void ClickonSelectCategory() {
		action.clickElement(selectCateg);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.TextView")
	private WebElement SelectCategoryfromdd;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement confBtn;

	public void SelectCategoryfromDropdown() throws InterruptedException {
		action.clickElement(SelectCategoryfromdd);
		Thread.sleep(1000);
		action.clickElement(confBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter your question\"]")
	private WebElement enterQues;

	public void EnterQuestion(String QueryQuest) {
		action.sendKeysElement(enterQues, QueryQuest);
	}

	//
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Description\"]")
	private WebElement enterDescr;

	public void EnterDescription(String QueryDesc) {
		action.sendKeysElement(enterDescr, QueryDesc);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Post Your Query\"]")
	private WebElement PostQueryBtn;

	public void ClickonPostYourQueryButton() {
		action.clickElement(PostQueryBtn);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Add Your Answers\"]/android.widget.TextView")
	private WebElement verifyQuery;

	public boolean VerifyQueryPostorNot() {
		return action.isDisplay(verifyQuery);
	}

	//////////////// Answer Query//////////////
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Add Your Answers\"]/android.widget.TextView")
	private WebElement addyourAns;

	public void AddyourAnsClk() {
		action.clickElement(addyourAns);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement addAns;

	public void EnterAnswer() throws InterruptedException {
		action.sendKeysElement(addAns, "Excellent!!");
		Thread.sleep(1000);
		action.clickElement(addyourAns);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"1 Answers\"]/android.widget.TextView)[1]")
	private WebElement verifyAnswer;

	public boolean VerifyAnswerAdded() {
		return action.isDisplay(verifyAnswer);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"1 Answers\"]/android.widget.TextView")
	private WebElement ClickonComment;

	public void ClickonComment() {
		action.clickElement(ClickonComment);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
	private WebElement verifyComment;

	public boolean VerifyComment() {
		return action.isDisplay(verifyComment);
	}

	///////////// Post Like/////////
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"0 Applauses\"]/android.widget.TextView)[2]")
	private WebElement LikePostClk;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"1 Applauses\"]/android.widget.TextView)[1]")
	private WebElement LikePostVerify;

	////// post Dislike////
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"1 Applauses\"]/android.widget.TextView)[1]")
	private WebElement DisLikePostClk;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"0 Applauses\"]/android.widget.TextView)[2]")
	private WebElement DisLikePostVerify;

	public void ClickonLikePost() {
		action.clickElement(LikePostClk);
	}

	public boolean VerifyLikedPost() {
		return action.isDisplay(LikePostVerify);
	}

	public void ClickonDisLikePost() {
		action.clickElement(DisLikePostClk);
	}

	public boolean VerifyDislikeLikedPost() {
		return action.isDisplay(DisLikePostVerify);
	}

	//////////// comment Reply//////////
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"0 Replies\"]/android.widget.TextView)[2]")
	private WebElement ReplyClk;

	public void ClickonReplyButton() {
		action.clickElement(ReplyClk);
	}

///////////Use Comment Elements/////////
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement verifyRepliedComment;

	public boolean VerifyReplyComment() {
		return action.isDisplay(verifyRepliedComment);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement ThreeDotClick;

	public void ClickonThreeDot() {
		action.clickElement(ThreeDotClick);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement ThreeDotClick1;

	public void ClickonThreeDot1() {
		action.clickElement(ThreeDotClick1);
	}

	@FindBy(xpath = "(//android.widget.TextView)[4]")
	private WebElement verifyComment1;

	public boolean VerifyComment1() {
		return action.isDisplay(verifyComment1);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
	private WebElement verifyEditedComment;

	public boolean VerifyEditedComment() {
		return action.isDisplay(verifyEditedComment);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Answers\"]")
	private WebElement verifyCmntDel;

	public boolean VeiryCommentisDeleted() {
		return action.isDisplay(verifyCmntDel);
	}
}
