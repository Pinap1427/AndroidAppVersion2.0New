package LinkCxO2.O.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CreatePostNew extends AbstractComponent {

	public CreatePostNew(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Create a Post, Create a Post and Engage with Your Network and empower your voice.\"]/android.widget.TextView[1]")
	private WebElement createPost;

	public void ClickonCreatePost() {
		action.clickElement(createPost);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement enterText;

	public void EnterTextForPOst(String CreatePostDesc) {
		action.sendKeysElement(enterText, CreatePostDesc);
	}

	@FindBy(xpath = "(//android.view.ViewGroup)[14]")
	private WebElement photosicn;

	public void ClickonPhotosIcon() {
		action.clickElement(photosicn);
	}

	@FindBy(xpath = "//android.widget.Button[@text=\"Allow\"]")
	private WebElement allowBtn;

	public void EnterBtn() throws AWTException, InterruptedException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

//	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1717653192935.jpg, 120 kB, Jul 5\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
	@FindBy(xpath = "(//android.widget.ImageView)[3]")
	private WebElement selectImg;

	public void SelectImage() throws InterruptedException {
		action.clickElement(allowBtn);
		Thread.sleep(3000);
		action.clickElement(selectImg);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Add Your Post\"]")
	private WebElement addyourpost;

	public void ClickonAddYourPost() {
		action.clickElement(addyourpost);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Now\"]/android.widget.TextView")
	private WebElement publishnow;

	public void ClickonPublishNow() {
		action.clickElement(publishnow);
	}
//	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Now\"]/android.widget.TextView")
//	private MobileElement publishnow1;
//	public void Scroll() throws InterruptedException
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView(true);", publishnow1);
//        
//	}

	@FindBy(xpath = "(//android.widget.TextView)[5]")
	private WebElement verifyPost;

	public boolean VerifyPostCreatedorNOt() {
		return action.isDisplay(verifyPost);
	}

	///////////// Post Like/////////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"0 Applauses\"]/android.widget.TextView")
	private WebElement LikePostClk;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"1 Applauses\"]/android.widget.TextView")
	private WebElement LikePostVerify;

	////// post Dislike////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"1 Applauses\"]/android.widget.TextView")
	private WebElement DisLikePostClk;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"0 Applauses\"]/android.widget.TextView")
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

	//////// Post Comment///////////////

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"0 Comments\"]/android.widget.TextView")
	private WebElement ClickonComment;

	public void ClickonComment() {
		action.clickElement(ClickonComment);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement addComment;

	public void EnterComment() {
		action.sendKeysElement(addComment, "Nice");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]")
	private WebElement SendCommentBtn;

	public void ClickonSendButton() {
		action.clickElement(SendCommentBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement verifyComment;

	public boolean VerifyComment() {
		return action.isDisplay(verifyComment);
	}

	//////////// ReUse Post Like and Dislike Method For Comment Like///////////

	//////////// comment Reply//////////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"0 Replies\"]/android.widget.TextView")
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

	///////// Comment Edit///
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	private WebElement BackXButton;

	public void ClickonXButton() {
		action.clickElement(BackXButton);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement ThreeDotClick;

	public void ClickonThreeDot() {
		action.clickElement(ThreeDotClick);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Edit\"]/android.widget.TextView")
	private WebElement EditCommentBtn;

	public void CliconEdit() {
		action.clickElement(EditCommentBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement EditedComment;

	public void EnterEditedComment() {
		action.sendKeysElement(EditedComment, "Nice!!!!");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]")
	private WebElement sendEditedCommentBtn;

	public void ClickonSendCommentBtnEdited() {
		action.clickElement(sendEditedCommentBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement verifyEditedComment;

	public boolean VerifyEditedComment() {
		return action.isDisplay(verifyEditedComment);
	}

/////////////////////////Delete Comment////////////////////////////
	///// Call 3 Dot Method/////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Delete\"]/android.widget.TextView")
	private WebElement DeleteBtn;

	public void ClickonDeleteButton() {
		action.clickElement(DeleteBtn);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Comments\"]")
	private WebElement VerifyCommentDeleted;

	public boolean VeiryCommentisDeleted() {
		return action.isDisplay(VerifyCommentDeleted);
	}

	/////////// Post Share on Feed/////////////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"0 Shares\"]/android.widget.TextView")
	private WebElement ShareBtn;

	public void ClickonShareButton() {
		action.clickElement(ShareBtn);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"On Feed\"]/android.widget.TextView")
	private WebElement onFeedBtn;
	
	public void ClickononFeed()
	{
		action.clickElement(onFeedBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement enterrepostDesc;

	public void EnterRepostDescription() {
		action.sendKeysElement(enterrepostDesc, "Repost");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Post\"]/android.widget.TextView")
	private WebElement PostBtn;

	public void ClickonPostButton() {
		action.clickElement(PostBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement verifyRepost;

	public boolean VerifyPostRepost() {
		return action.isDisplay(verifyRepost);
	}

/////post Delte//////////
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement ThreeDotClickRepost;

	public void ClickonThreeDotRepost() {
		action.clickElement(ThreeDotClickRepost);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Delete\"]/android.widget.TextView")
	private WebElement deleteBtnRepost;

	public void ClickonDeleteButtonRepost() {
		action.clickElement(deleteBtnRepost);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Share your Experience...\"]/android.widget.TextView")
	private WebElement verifypostdelete;

	public boolean verifyPostisDeleted() {
		return action.isDisplay(verifypostdelete);
	}

}
