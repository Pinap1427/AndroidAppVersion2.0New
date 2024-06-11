package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class SaveJobNew extends AbstractComponent {

	public SaveJobNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();

	@FindBy(xpath = "//android.view.View[@content-desc=\"Jobs\"]/android.widget.TextView")
	private WebElement JobsBtn;

	public void ClickonJobsButton() {
		action.clickElement(JobsBtn);
	}

	@FindBy(xpath = "(//android.widget.TextView)[15]")
	private WebElement JobClk;

	public void ClickonJob() {
		action.clickElement(JobClk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Save\"]/android.widget.TextView")
	private WebElement SaveJobBtn;

	public void ClickonSaveJobButton() {
		action.clickElement(SaveJobBtn);
	}
	// chatGpt Xpath
	// (//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup)[last()]/android.widget.TextView[1]
//Mine xpath
	//

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1][last()]")
	private WebElement lastAddedJob;
	public String GettextofLastAddedJob()
	{
		return lastAddedJob.getText();
	}
}
