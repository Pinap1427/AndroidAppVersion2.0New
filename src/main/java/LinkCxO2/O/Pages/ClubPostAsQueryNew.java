package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class ClubPostAsQueryNew extends AbstractComponent{
	
	public ClubPostAsQueryNew(AndroidDriver driver) throws Exception {
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
	public void ClickonPlusIcon()
	{
		action.clickElement(clickonPlus);
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
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Business Growth\"]/android.widget.TextView")
	private WebElement SelectCategoryfromdd;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement ConfmButton;
	public void SelectCategoryfromDropdown() throws InterruptedException
	{
		action.clickElement(SelectCategoryfromdd);
		Thread.sleep(2000);
		action.clickElement(ConfmButton);
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
	
	
	@FindBy(xpath = "(//android.widget.TextView)[12]")
	private WebElement gettextActualQuestionQuery;

	public String GetLastTextofQuery() {
		return gettextActualQuestionQuery.getText();
	}
	

}
