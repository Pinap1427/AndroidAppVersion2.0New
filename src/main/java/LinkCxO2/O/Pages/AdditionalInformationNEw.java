package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class AdditionalInformationNEw extends AbstractComponent {

	public AdditionalInformationNEw(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement addInfo;

	public void ClickonEditAdditionalInfo() {
		action.clickElement(addInfo);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement emailEnter;

	public void EnterEmailid() {
		action.sendKeysElement(emailEnter, "prabhat@linkcxo.com");
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement clickCurrency;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"INR    \"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectINR;

	public void SelectCurrency() throws InterruptedException {
		action.clickElement(clickCurrency);
		Thread.sleep(1000);
		action.clickElement(selectINR);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Preferred Industry *\"]/following-sibling::android.view.ViewGroup[1]")
	private WebElement clickIndustryDrop;

	public void ClickonIndustryDropdown() {
		action.clickElement(clickIndustryDrop);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Startup / VCs/ PEs   \"]/android.widget.TextView")
	private WebElement SelectInd;

	public void SelectIndustryFromDD() {
		action.clickElement(SelectInd);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement ClickonConfirm;

	public void ClickonConfirmButton() {
		action.clickElement(ClickonConfirm);
	}

	@FindBy(xpath = "//android.widget.TextView[@text=\"Preferred Location *\"]/following-sibling::android.view.ViewGroup[1]")
	private WebElement clickLocationDrop;

	public void ClickonLocationDropdown() {
		action.clickElement(clickLocationDrop);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Banganapalle   \"]/android.widget.TextView")
	private WebElement selectLoc;

	public void selectLocationfromDD() {
		action.clickElement(selectLoc);
		// use ClickonConfirmButton method after this
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]/android.widget.TextView")
	private WebElement saveBtnAdditional;

	public void ClickonSaveButton() {
		action.clickElement(saveBtnAdditional);
	}
	//use swipe down method 
	@FindBy(xpath = "//android.widget.TextView[@text=\"Preferred Location : \"]")
	private WebElement verifyADdtion;
	public boolean VerifyAdditionalInformationisAddedorNOT()
	{
		return action.isDisplay(verifyADdtion);
	}
	

}
