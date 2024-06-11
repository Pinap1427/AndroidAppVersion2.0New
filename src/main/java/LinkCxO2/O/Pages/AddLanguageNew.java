package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class AddLanguageNew extends AbstractComponent {

	public AddLanguageNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement languageEdit;

	public void ClickonLAnguageEditButton() {
		action.clickElement(languageEdit);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Language\"]")
	private WebElement SelectLang;

	public void ClickonSelectLanguageDropdown() {
		action.clickElement(SelectLang);
	}

	@FindBy(xpath = "(//android.widget.CheckBox[@resource-id=\"RNE__CheckBox__Wrapper\"])[1]")
	private WebElement firstLanguageSelect;

	public void SelectFirstLanguage() {
		action.clickElement(firstLanguageSelect);
	}

	@FindBy(xpath = "(//com.horcrux.svg.PathView)[3]")
	private WebElement ReadCheckBox;
	@FindBy(xpath = "(//com.horcrux.svg.PathView)[4]")
	private WebElement WriteCheckBox;
	@FindBy(xpath = "(//com.horcrux.svg.PathView)[5]")
	private WebElement SpeakCheckBox;

	public void SelectAllCheckBox() throws InterruptedException {
		action.clickElement(ReadCheckBox);
		Thread.sleep(1000);
		action.clickElement(WriteCheckBox);
		Thread.sleep(1000);
		action.clickElement(SpeakCheckBox);
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Save \"]/android.widget.TextView")
	private WebElement LangSaveBtn;

	public void ClickOnLanguageSaveButton() {
		action.clickElement(LangSaveBtn);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[7]//android.widget.TextView)[1]")
	private WebElement gettextFirstLang;

	public String getFirstLanguaeText() {
		return gettextFirstLang.getText();

	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement submitBtnLang;
	public void ClickonSubmitLanguageButton()
	{
		action.clickElement(submitBtnLang);
	}
	
	@FindBy(xpath = "(//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[last()]/android.widget.TextView[1])[3]")
	private WebElement verifyLanguageAddedorNOt;
	
	public String getLastLanguageAddedText() {
		return verifyLanguageAddedorNOt.getText();

	}
	
}
