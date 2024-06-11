package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class AwardsandCertificationsNew extends AbstractComponent {

	public AwardsandCertificationsNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement addAwards;

	public void ClickonAddinAwards() {
		action.clickElement(addAwards);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Ph.D\"]")
	private WebElement EnterTile;
	public String ActualTitleAwards = "Best Automation Tester Award";

	public void EnterAwardTitle() {
		action.sendKeysElement(EnterTile, ActualTitleAwards);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement getTitleAwards;
	
	public String getFirstAwardTitleText() {
		return getTitleAwards.getText();

	}
	
	@FindBy(xpath = "(//android.widget.EditText)[2]")
	private WebElement certifiedBy;

	public void EnterCertifiedByName() {
		action.sendKeysElement(certifiedBy, "Gyanesh Kumar");

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

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	private WebElement DescrAwards;
	public String DescriptionAwards = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic.";

	public void EnterDescrtiptionAwards() throws InterruptedException {
		Thread.sleep(1000);
		action.sendKeysElement(DescrAwards, DescriptionAwards);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement saveBtnAwards;

	public void ClickonSaveButton() {
		action.clickElement(saveBtnAwards);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[5]")
	private WebElement verifyAwards;

	public String getLastAwardText() {
		return verifyAwards.getText();

	}

}
