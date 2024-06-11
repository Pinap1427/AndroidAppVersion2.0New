package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class AddPublicationsNew extends AbstractComponent {

	public AddPublicationsNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusiconAddPublication;

	public void ClickonPlusIconInPublications() {
		action.clickElement(plusiconAddPublication);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter Publication Name \"]")
	private WebElement EnterTitle;
	String TitlePublic = "Evolution 3.0";

	public void EnterTitlePublication() {
		action.sendKeysElement(EnterTitle, TitlePublic);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement getTitlePublic;

	public String getFirstPublicationTitleText() {
		return getTitlePublic.getText();

	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	private WebElement enterPublishedBy;
	String PublishedBy = "Media technology";

	public void EnterPublishedbyPublication() {
		action.sendKeysElement(enterPublishedBy, PublishedBy);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	private WebElement enterCoAuther;
	String CoAuther = "FM Radio";

	public void EnterCoAutherPublication() {
		action.sendKeysElement(enterCoAuther, CoAuther);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement dateSelect;

	public void ClickonSelectDate() {
		action.clickElement(dateSelect);
	}

//	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Previous month\"]")
//	private WebElement prvMonth;
	@FindBy(xpath = "//android.view.View[@text=\"1\"]")
	private WebElement Select1stDate;
	@FindBy(xpath = "//android.widget.Button[@text=\"OK\"]")
	private WebElement okBtn;

	public void SelectDate() throws InterruptedException {
//		action.clickElement(prvMonth);
		Thread.sleep(1000);
		action.clickElement(Select1stDate);
		Thread.sleep(1000);
		action.clickElement(okBtn);
		Thread.sleep(1000);

	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]")
	private WebElement DescrPublication;
	public String DescriptionPublications = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic.";

	public void EnterDescrtiptionPublications() throws InterruptedException {
		Thread.sleep(1000);
		action.sendKeysElement(DescrPublication, DescriptionPublications);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveBtnAwards;

	public void ClickonSaveButton() {
		action.clickElement(saveBtnAwards);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Publications\"]/following-sibling::android.widget.TextView[1]")
	private WebElement verifyPublications;

	public String getLastPublicationsText() {
		return verifyPublications.getText();

	}

}
