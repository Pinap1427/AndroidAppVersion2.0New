package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class ComapnyPostAsQueryNew extends AbstractComponent {
	
	public ComapnyPostAsQueryNew(AndroidDriver driver) throws Exception {
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
	public void ClickonSelectCategory()
	{
		action.clickElement(selectCateg);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement SelectCategoryfromdd;
	public void SelectCategoryfromDropdown()
	{
		action.clickElement(SelectCategoryfromdd);
	}
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter your question\"]")
	private WebElement enterQues;
	public void EnterQuestion()
	{
		action.sendKeysElement(enterQues, "For Testing Query in Company Page");
	}
	
	

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement gettextExpectQuestionQuery;

	public String GetFirstTextofQuery() {
		return gettextExpectQuestionQuery.getText();
	}
	
	//
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Description\"]")
	private WebElement enterDescr;
	public void EnterDescription()
	{
		action.sendKeysElement(enterDescr, "Testing");
	}
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Post Your Query\"]")
	private WebElement PostQueryBtn;
	public void ClickonPostYourQueryButton()
	{
		action.clickElement(PostQueryBtn);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement backBtn;

	public void ClickonBackIcon() throws InterruptedException {
		action.clickElement(backBtn);
		Thread.sleep(4000);
		action.clickElement(CompanyClick);
	}
	
	@FindBy(xpath = "(//android.widget.TextView)[14]")
	private WebElement gettextActualQuestionQuery;

	public String GetLastTextofQuery() {
		return gettextActualQuestionQuery.getText();
	}
	
	
	
	

}
