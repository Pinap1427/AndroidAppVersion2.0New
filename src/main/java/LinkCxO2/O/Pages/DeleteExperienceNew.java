package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class DeleteExperienceNew extends AbstractComponent{
	
	public DeleteExperienceNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement EditExp;
	public void ClickonEdiExperience()
	{
		action.clickElement(EditExp);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement DeleteIcon;
	public void ClickonDeleteIcon()
	{
		action.clickElement(DeleteIcon);
	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Delete\"]/android.widget.TextView")
	private WebElement DeleteButton;
	public void ClickonDeleteButton()
	{
		action.clickElement(DeleteButton);
	}
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Experience deleted successfully\"]/android.widget.TextView")
	private WebElement VerifyExpDelete;
	public boolean VerifyExpDeletedOrNot()
	{
		return action.isDisplay(VerifyExpDelete);
	}
	public void BackMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.navigate().back();
	}
	

}