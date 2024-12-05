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
//	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1200x628-DeepLearning-videojpg.jpg, 40.81 kB, Aug 20\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")  //3rd image will be selected
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1676909412539.png, 36.01 kB, Oct 21\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")
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

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
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

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Create Event\"]")
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
	
	/////////////View Event Details////////////
	@FindBy(xpath = "(//android.widget.TextView)[3]")
	private WebElement ClkOnEvent;
	public void ClickonEvent()
	{
		action.clickElement(ClkOnEvent);
	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]")
	private WebElement VerifyViewDet;
	public boolean VerifyViewDetails()
	{
		return action.isDisplay(VerifyViewDet);
	}
	////////edit Event////////
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]")
	private WebElement EditBtn;
	public void ClickonEditButton()
	{
		action.clickElement(EditBtn);
	}
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"RNE__Image__children__container\"]")
	private WebElement addimgclkEdit;

	public void ClickonAddImageEdit() {
		action.clickElement(addimgclkEdit);
	}

//	@FindBy(xpath = "//android.widget.TextView[@text=\"testimg.jpeg\"]")
//	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1200x628-DeepLearning-videojpg.jpg, 40.81 kB, Aug 20\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")  //3rd image will be selected
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1703910751905.png, 1.13 MB, Oct 24\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]")
	private WebElement imgSelcEdit;

	public void SelectImageEdit() throws InterruptedException {
		Thread.sleep(2000);
		action.clickElement(imgSelcEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement enterTitleEdit;

	public void EnterEventTitleEdit() {
		action.sendKeysElement(enterTitleEdit, "Ai Stocks event 2024");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement returnGettextofTitleEdit;

	public String ExpectedGettexTitleEdit() {
		return returnGettextofTitle.getText();
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement selectIndclkEdit;

	public void ClickonSelectIndustryEdit() {
		action.clickElement(selectIndclkEdit);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Not for profit / NGO\"]/android.widget.TextView")
	private WebElement selectIndustryEdit;

	public void SelectIndustryFromDDEdit() {
		action.clickElement(selectIndustryEdit);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement confirmBtEdit;

	public void ClickonConfirmButtonEdit() {
		action.clickElement(confirmBtEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement selectCateclkEdit;

	public void ClickonSelectCategoryEdit() {
		action.clickElement(selectCateclkEdit);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Operations\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement selectCategoryEdit;

	public void SelectCategoryFromDDEdit() throws InterruptedException {
		// use Swipe down with co ordinates method
		action.clickElement(SelectCategoryfromddEdit);
//		Thread.sleep(1000);
//		action.clickElement(confBtn);
//		action.clickElement(selectCategory);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Operations\"]/android.widget.TextView")
	private WebElement SelectCategoryfromddEdit;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement confBtnEdit;
	public void SelectCategoryfromDropdownEdit() throws InterruptedException
	{
		action.clickElement(SelectCategoryfromddEdit);
		Thread.sleep(1000);
		action.clickElement(confBtnEdit);
	}
	
	String EditEventDetails="Top 5 Most Promising AI Stocks for 2024\r\n"
			+ "\r\n"
			+ "💥Are you ready to navigate the dynamic world of Artificial Intelligence stocks? Join us for an insightful audio event where we delve into the future of AI investments.\r\n"
			+ "\r\n"
			+ "Who should tune in:\r\n"
			+ "\r\n"
			+ "💠(1) Investors and Traders\r\n"
			+ "If you're keen on maximizing your portfolio's potential by investing in the AI sector, this event is tailored to you. Gain exclusive insights into the stocks that could shape the AI investment landscape for years to come.\r\n"
			+ "\r\n"
			+ "💠(2) Tech Enthusiasts and Innovators\r\n"
			+ "Curious about the intersection of technology and finance? Join us to explore the companies at the forefront of AI innovation and discover how their success impacts the industry as a whole.\r\n"
			+ "\r\n"
			+ "💠(3) Business Leaders and Decision Makers\r\n"
			+ "If you're steering your company toward AI integration, understanding the key players in the stock market is essential. This event equips you with knowledge to inform your strategic decisions in the AI space.\r\n"
			+ "\r\n"
			+ "🔥Don't miss out on this opportunity to grasp the potential of Top 5 Most Promising AI Stocks for 2024 and make informed investment choices.";
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	private WebElement enterEventDetEdit;

	public void EnterEventDetailsEdit() {
		action.sendKeysElement(enterEventDet, EditEventDetails);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
	private WebElement createmyeventBtnEdit;

	public void ClickonCreateMyEventEdit() {
		action.clickElement(createmyeventBtnEdit);
	}

//	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Host Type\"]")
//	private WebElement hostTypeClkEdit;
//
//	public void ClickonHostTypeEdit() {
//		action.clickElement(hostTypeClkEdit);
//	}
//
//	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INDIVIDUAL\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
//	private WebElement hostTypeSelEdit;
//
//	public void SelectHostTypeEdit() {
//		action.clickElement(hostTypeSelEdit);
//	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Online\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement SelectOfflineRadEdit;

	public void ClickonOfflineRadioButtonEdit() {
		action.clickElement(SelectOfflineRadEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement locationEnterEdit;

	public void EnterLocationEdit(String EventVenue) {
		action.sendKeysElement(locationEnter, "https://www.zoom.us");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
	private WebElement clickCurrencyEdit;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INR (₹)\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectINREdit;

	public void SelectFree() throws InterruptedException {
		action.clickElement(clickCurrencyEdit);
		Thread.sleep(1000);
//		action.clickElement(selectINREdit);
	}

//	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter amount\"]")
//	private WebElement amountEnterEdit;
//
//	public void EnterAmountEdit() {
//		action.sendKeysElement(amountEnter, "999");
//	}

	// select Date
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement startDateEdit;

	public void ClickonSelectFirstDateEdit() {
		action.clickElement(startDate);
	}

	@FindBy(xpath = "//android.view.View[@text=\"29\"]")
	private WebElement selectDatefromcalEdit;

	@FindBy(id = "android:id/button1")
	private WebElement okBtnCalEdit;

	public void SelectDateEdit() throws InterruptedException {
		action.clickElement(selectDatefromcalEdit);
		Thread.sleep(1000);
		action.clickElement(okBtnCalEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")
	private WebElement TimestartClkEdit;

	public void ClickonStartTimeEdit() {
		action.clickElement(TimestartClkEdit);
	}

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]")
	private WebElement selectHourEdit;

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]")
	private WebElement selectMinutesEdit;

	@FindBy(id = "android:id/pm_label")
	private WebElement selectAMorPMEdit;

	public void SelectStartTimeEdit() throws InterruptedException {
		action.clickElement(selectHourEdit);
		Thread.sleep(1000);
		action.clickElement(selectMinutesEdit);
		Thread.sleep(1000);
		action.clickElement(selectAMorPMEdit);
		Thread.sleep(1000);
		action.clickElement(okBtnCalEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText")
	private WebElement endDAteClkEdit;

	public void ClickonEndDateEdit() {
		action.clickElement(endDAteClkEdit);
	}

	public void SelectEndDateEdit() throws InterruptedException {
		action.clickElement(selectDatefromcalEdit);
		Thread.sleep(1000);
		action.clickElement(okBtnCalEdit);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.EditText")
	private WebElement TimeEndClkEdit;

	public void ClickonEndTimeEdit() {
		action.clickElement(TimeEndClkEdit);
	}

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]")
	private WebElement selectEndHourEdit;

	@FindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]")
	private WebElement selectEndMinutesEdit;

	@FindBy(id = "android:id/pm_label")
	private WebElement selectEndAMorPMEdit;

	public void SelectEndTimeEdit() throws InterruptedException {
		action.clickElement(selectEndHourEdit);
		Thread.sleep(1000);
		action.clickElement(selectEndMinutesEdit);
		Thread.sleep(1000);
		action.clickElement(selectEndAMorPMEdit);
		Thread.sleep(1000);
		action.clickElement(okBtnCalEdit);
	}

//	@FindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
//	private WebElement emailEnterEdit;
//
//	public void EnterEmailEdit() {
//		action.sendKeysElement(emailEnter, "joyjovitha48@gmail.com");
//	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Update Event\"]")
	private WebElement nextBtnEdit;

	public void ClickonNextButtonEdit() {
		action.clickElement(nextBtnEdit);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]")
	private WebElement VerifyEditedEvent;
	public boolean VerifyEditDetails()
	{
		return action.isDisplay(VerifyEditedEvent);
	}

	///Invite Members///////
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Participants\"]/android.widget.TextView")
	private WebElement participClk;
	public void ClickonParticipantClick()
	{
		action.clickElement(participClk);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement PlusIcon;
	public void ClickonPlusIconPart()
	{
		action.clickElement(PlusIcon);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Select All\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement SelectAllCheck;
	public void ClickonSelectAll()
	{
		action.clickElement(SelectAllCheck);
	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Share\"]/android.widget.TextView")
	private WebElement ShareBtn;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement backBtn;
	public void ClickonShareButton() throws InterruptedException
	{
		action.clickElement(ShareBtn);
		Thread.sleep(1000);
		action.clickElement(backBtn);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup")
	private WebElement InvitedClk;
	public void ClickonInvited()
	{
		action.clickElement(InvitedClk);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement VerifyInvtedUser;
	public boolean VerifyInvitedUserinTab()
	{
		return action.isDisplay(VerifyInvtedUser);
	}
	////add Media///////s
	
	
	
	


}
