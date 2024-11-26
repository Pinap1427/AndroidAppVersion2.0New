package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CreateEventNew extends AbstractComponent {

	public CreateEventNew(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "(//com.horcrux.svg.PathView[contains(@class, 'PathView') and @index='5'])[2]")
	private WebElement EventBtn;

	public void ClickonEventsButton() {
		action.clickElement(EventBtn);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcon;

	public void ClickonPlusIcon() {
		action.clickElement(plusIcon);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"RNE__Image__children__container\"]")
	private WebElement addimgclk;

	public void ClickonAddImage() {
		action.clickElement(addimgclk);
	}

//	@FindBy(xpath = "//android.widget.TextView[@text=\"testimg.jpeg\"]")
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1200x628-DeepLearning-videojpg.jpg, 40.81 kB, Aug 20\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")  //3rd image will be selected
	private WebElement imgSelc;

	public void SelectImage() throws InterruptedException {
		Thread.sleep(2000);
		action.clickElement(imgSelc);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter event title\"]")
	private WebElement enterTitle;

	public void EnterEventTitle(String EventTitle) {
		action.sendKeysElement(enterTitle, EventTitle);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement returnGettextofTitle;

	public String ExpectedGettexTitle() {
		return returnGettextofTitle.getText();
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Industry\"]")
	private WebElement selectIndclk;

	public void ClickonSelectIndustry() {
		action.clickElement(selectIndclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Media / Entertainment / Communication\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement selectIndustry;

	public void SelectIndustryFromDD() {
		action.clickElement(selectIndustry);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement confirmBt;

	public void ClickonConfirmButton() {
		action.clickElement(confirmBt);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Category\"]")
	private WebElement selectCateclk;

	public void ClickonSelectCategory() {
		action.clickElement(selectCateclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Operations\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement selectCategory;

	public void SelectCategoryFromDD() throws InterruptedException {
		// use Swipe down with co ordinates method
		action.clickElement(SelectCategoryfromdd);
//		Thread.sleep(1000);
//		action.clickElement(confBtn);
//		action.clickElement(selectCategory);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.TextView")
	private WebElement SelectCategoryfromdd;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement confBtn;
	public void SelectCategoryfromDropdown() throws InterruptedException
	{
		action.clickElement(SelectCategoryfromdd);
		Thread.sleep(1000);
		action.clickElement(confBtn);
	}

	// use ClickonConfirmButton after this in main class
	String EventDetails = "The rivalry resumes! Brace yourself for the most anticipated cricket match of the year as India takes on Pakistan in the T20 World Cup.\r\n"
			+ "\r\n" + "Join us for a live screening event that promises to be nothing short of exhilarating!\r\n"
			+ "\r\n" + "Don't miss out on the electrifying atmosphere, the camaraderie, and the unforgettable.\r\n"
			+ "\r\n" + "Be there to witness history in the making.";

	String LinkedInEventDetails="Are you ready to crack the code and unlock the secrets of AI technology to create more freedom, time, and income to make a difference and travel the world?\r\n"
			+ "\r\n"
			+ "Do you realize that ChatGPT is the future, yet you don’t know where to start?\r\n"
			+ "\r\n"
			+ "Join me for this transformative event designed for coaches, consultants, and entrepreneurs who want to take advantage of cutting-edge AI technology to improve life - without stress and overwhelm.\r\n"
			+ "\r\n"
			+ "Here's what you can expect:\r\n"
			+ "\r\n"
			+ "🔐 Master ChatGPT: Discover how ChatGPT can revolutionize your LinkedIn strategy. Learn how to write effective message sequences, LinkedIn event invitations and streamline your content creation in a fraction of the time.\r\n"
			+ "\r\n"
			+ "💡 LinkedIn Events Mastery: Unleash the power of LinkedIn Events to expand your network exponentially, make meaningful connections, build credibility, and attract your ideal clients.\r\n"
			+ "\r\n"
			+ "⚙️ Effective Systems: Gain valuable insights into creating systems that leverage results, reduce overwhelm, free up your time, and allow you to scale.\r\n"
			+ "\r\n"
			+ "🚀 Supercharge Productivity & Well-being: Learn practical strategies to eliminate stress, supercharge productivity, and create an awesome work-life balance as you navigate the demands of a thriving business.\r\n"
			+ "\r\n"
			+ "📅 Save the Date: Tuesday, July 16 at 11.30 am EST\r\n"
			+ "🌍 Location: The comfort of your own office or home\r\n"
			+ "💼 Hosted by: Shamayah Sarrucco, LinkedIn Strategist\r\n"
			+ "💻 Event Format: Offline - Raghuleela Mall Vashi";
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Event Details\"]")
	private WebElement enterEventDet;

	public void EnterEventDetails(String EventDetails) {
		action.sendKeysElement(enterEventDet, EventDetails);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Create My Event\"]")
	private WebElement createmyeventBtn;

	public void ClickonCreateMyEvent() {
		action.clickElement(createmyeventBtn);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Host Type\"]")
	private WebElement hostTypeClk;

	public void ClickonHostType() {
		action.clickElement(hostTypeClk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INDIVIDUAL\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement hostTypeSel;

	public void SelectHostType() {
		action.clickElement(hostTypeSel);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Offline\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement SelectOfflineRad;

	public void ClickonOfflineRadioButton() {
		action.clickElement(SelectOfflineRad);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Location of the Event\"]")
	private WebElement locationEnter;

	public void EnterLocation(String EventVenue) {
		action.sendKeysElement(locationEnter, EventVenue);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement clickCurrency;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INR (₹)\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectINR;

	public void SelectCurrency() throws InterruptedException {
		action.clickElement(clickCurrency);
		Thread.sleep(1000);
		action.clickElement(selectINR);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter amount\"]")
	private WebElement amountEnter;

	public void EnterAmount() {
		action.sendKeysElement(amountEnter, "999");
	}

	// select Date
	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Date\"]")
	private WebElement startDate;

	public void ClickonSelectFirstDate() {
		action.clickElement(startDate);
	}

	@FindBy(xpath = "//android.view.View[@text=\"30\"]")
	private WebElement selectDatefromcal;

	@FindBy(id = "android:id/button1")
	private WebElement okBtnCal;

	public void SelectDate() throws InterruptedException {
		action.clickElement(selectDatefromcal);
		Thread.sleep(1000);
		action.clickElement(okBtnCal);
	}

	@FindBy(xpath = "(//android.widget.EditText[@text=\"Select Time\"])[1]")
	private WebElement TimestartClk;

	public void ClickonStartTime() {
		action.clickElement(TimestartClk);
	}

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]")
	private WebElement selectHour;

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"0\"]")
	private WebElement selectMinutes;

	@FindBy(id = "android:id/pm_label")
	private WebElement selectAMorPM;

	public void SelectStartTime() throws InterruptedException {
		action.clickElement(selectHour);
		Thread.sleep(1000);
		action.clickElement(selectMinutes);
		Thread.sleep(1000);
		action.clickElement(selectAMorPM);
		Thread.sleep(1000);
		action.clickElement(okBtnCal);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.EditText")
	private WebElement endDAteClk;

	public void ClickonEndDate() {
		action.clickElement(endDAteClk);
	}

	public void SelectEndDate() throws InterruptedException {
		action.clickElement(selectDatefromcal);
		Thread.sleep(1000);
		action.clickElement(okBtnCal);
	}

	@FindBy(xpath = "(//android.widget.EditText[@text=\"Select Time\"])[1]")
	private WebElement TimeEndClk;

	public void ClickonEndTime() {
		action.clickElement(TimeEndClk);
	}

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"11\"]")
	private WebElement selectEndHour;

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"55\"]")
	private WebElement selectEndMinutes;

	@FindBy(id = "android:id/pm_label")
	private WebElement selectEndAMorPM;

	public void SelectEndTime() throws InterruptedException {
		action.clickElement(selectEndHour);
		Thread.sleep(1000);
		action.clickElement(selectEndMinutes);
		Thread.sleep(1000);
		action.clickElement(selectEndAMorPM);
		Thread.sleep(1000);
		action.clickElement(okBtnCal);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
	private WebElement emailEnter;

	public void EnterEmail() {
		action.sendKeysElement(emailEnter, "joyjovitha48@gmail.com");
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
	private WebElement nextBtn;

	public void ClickonNextButton() {
		action.clickElement(nextBtn);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Kailas Surve, Navi Mumbai, 4, Linkcxo PVT\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement SelectcheckboxCon;

	public void SelectCheckBoxOfConnection() {
		action.clickElement(SelectcheckboxCon);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Select All\"]/android.widget.TextView")
	private WebElement selectAll;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Publish Event\"]/android.widget.TextView")
	private WebElement publishEvent;

	public void ClickonPublishEvent() throws InterruptedException {
		action.clickElement(selectAll);
		Thread.sleep(1000);
		action.clickElement(publishEvent);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]")
	private WebElement MyEvent;
	//touch click
//	895,134
	public void ClickonMyEvent() throws InterruptedException
	{
		TouchAction action=new TouchAction(driver);
		action.tap(PointOption.point(895, 134)).perform();
		Thread.sleep(2000);
	}
//	542,2135,1114
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View/android.view.ViewGroup")
	private WebElement VerifyEvent;
	
	public boolean VerifyEventCreatedorNOT()
	{
		return action.isDisplay(VerifyEvent);
	}

}
