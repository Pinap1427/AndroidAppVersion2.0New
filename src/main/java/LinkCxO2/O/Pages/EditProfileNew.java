package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class EditProfileNew extends AbstractComponent {

	public EditProfileNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//android.widget.TextView[@text=\"Connections\"]/following-sibling::android.view.ViewGroup[1]")
	private WebElement threedotclk;

	public void ClickonThreeDot() {
		action.clickElement(threedotclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Edit Profile\"]/android.widget.TextView")
	private WebElement editProfile;

	public void ClickonEditProfile() {
		action.clickElement(editProfile);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	private WebElement UpdateLocation;

	public void UpdateLocationinProfile() {
		action.sendKeysElement(UpdateLocation, "Banglore");
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Designation *\"]/following-sibling::android.view.ViewGroup[1]")
	private WebElement Designdd;
	public void ClickonDesignationDropdown()
	{
		action.clickElement(Designdd);
	}
	

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]")
	private WebElement updateCompany;

	public void UpdateCompanyInProfile() {
		action.sendKeysElement(updateCompany, "LinkCxO Global Private Limited");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	private WebElement webSite;

	public void EnterWebsite() {
		action.sendKeysElement(webSite,
				"https://www.linkedin.com/in/prabhat-kumar-b12699129?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app\r\n"
						+ "https://www.linkedin.com/in/prabhat-kumar-b12699129?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app\r\n"
						+ "");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[5]")

	private WebElement aboutEnt;

	public void UpdateAbout() {
		action.sendKeysElement(aboutEnt, "Leadership: The ability to motivate and inspire team members updated.");
	}

}
