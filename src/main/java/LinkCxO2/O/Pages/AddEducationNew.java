package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.android.AndroidDriver;

public class AddEducationNew extends AbstractComponent{
	
	public AddEducationNew(AndroidDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	AndroidDriver driver;

	ActionKeywords action = new ActionKeywords();
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusbtnedu;
	public void ClickonPlusButtonInExp()
	{
		action.clickElement(plusbtnedu);
	}
	@FindBy(xpath = "//android.widget.TextView[@text=\"School *\"]/following-sibling::android.widget.EditText[1]")
	private WebElement schoolName;
	public String schoolname = "Drona Collage Of Management and Technical education";
	public void EnterSchool()
	{
		action.sendKeysElement(schoolName, schoolname);
	}
	@FindBy(xpath = "//android.widget.TextView[@text=\"Degree *\"]/following-sibling::android.widget.EditText[1]")
	private WebElement degreeadd;
	public void EnterDegree()
	{
		action.sendKeysElement(degreeadd, "M.tech");
	}
	
	//Start date and End Date
	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Date\"]")
	private WebElement SelectDateclk;
	public void ClickonSelectDAte() {
		action.clickElement(SelectDateclk);
	}
	@FindBy(id = "android:id/date_picker_header_year")
	private WebElement selectYear;
	public void ClickonSelectYear()
	{
		action.clickElement(selectYear);
	}
	@FindBy(xpath = "//android.widget.TextView[@text=\"2018\"]")
	private WebElement selectStartYear;
	public void SelectStartYearfromList()
	{
		action.clickElement(selectStartYear);
	}
	@FindBy(id = "android:id/button1")
	private WebElement okButton;
	public void ClickonOkButton()
	{
		action.clickElement(okButton);
	}
	////Select End Date
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Time\"]")
	private WebElement selectEndDate;
	public void ClickonSelectEndDAte()
	{
		action.clickElement(selectEndDate);
	}
	@FindBy(xpath = "//android.widget.TextView[@text=\"2021\"]")
	private WebElement selectEndYear;
	public void SelectEndYearfromList()
	{
		////////Before this call ClickonSelectYear()/////////
		action.clickElement(selectEndYear);
		///////After This call ClickonOkButton()////
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Field Of Study *\"]/following-sibling::android.widget.EditText[1]")
	private WebElement 	studyField;
	public void EnterFieldOfStudy()
	{
		action.sendKeysElement(studyField, "Artificial Intelligence");
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Grade/CGPA *\"]/following-sibling::android.widget.EditText[1]")
//	@FindBy(xpath = "//android.widget.TextView[@text=\"Field Of Study *\"]/following-sibling::android.widget.EditText[1]")
	private WebElement 	gradeorCGPA;
	public void EnterGradeorCGPA()
	{
		action.sendKeysElement(gradeorCGPA, "A++");
	}
	@FindBy(xpath = "//android.widget.EditText[@text=\"Unlock Your Professional Voice and Begin Networking with Top Executives Today!\"]")
	private WebElement Descedu;
	public String DescriptionEductation="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic.";
	public void EnterDescriptionEduction()
	{
		action.sendKeysElement(Descedu, DescriptionEductation);
	}
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
	private WebElement SaveBtnEdu;
	public void ClickonSaveButtonEdu()
	{
		action.clickElement(SaveBtnEdu);
	}
	@FindBy(xpath = "//android.widget.TextView[@text=\"Education\"]")
	private WebElement verifyEdu;
	public boolean VerifyEducationaddedOrNOT()
	{
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(verifyEdu));
		return action.isDisplay(verifyEdu);
	}

}
