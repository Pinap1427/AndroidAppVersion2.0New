package LinkCxO2.O.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Utils.ActionKeywords;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CreateJobNEw extends AbstractComponent {

	public CreateJobNEw(AndroidDriver driver) throws Exception {
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

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement plusIcon;

	public void ClickonPlusIcon() {
		action.clickElement(plusIcon);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Title \"]")
	private WebElement jobTitleEnter;

	 public void enterJobTitle(String jobTitle) {
		 action.sendKeysElement(jobTitleEnter, jobTitle);
	    }
	
//	public void EnterJobTitle() {
//		action.sendKeysElement(jobTitle, prop.getProperty("JobTitle"));
//	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	private WebElement returnGettextofjobTitle;

	public String ExpectedGettextJOBTitle() {
		return returnGettextofjobTitle.getText();
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Add your Company Name\"]")
	private WebElement companyEnter;

	public void EnterCompanyName(String JobCompany) {
//		action.sendKeysElement(companyEnter, prop.getProperty("Company"));
		action.sendKeysElement(companyEnter, JobCompany);
	}

	
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Industry\"]")
	private WebElement selectIndclk;

	public void ClickonSelectIndustry() {
		action.clickElement(selectIndclk);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" IT & ITES\"]/android.widget.CheckBox")
	private WebElement selectIndustry;

	public void SelectIndustryFromDD() {
		action.clickElement(selectIndustry);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	private WebElement confirmBt;

	public void ClickonConfirmButton() {
		action.clickElement(confirmBt);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Job Type\"]")
	private WebElement selectJobType;

	public void ClickonSelectJobType() {
		action.clickElement(selectJobType);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Full Time\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectJobtypeFromDD;

	public void SelectJobTypeFromDropdown() {
		action.clickElement(selectJobtypeFromDD);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Select Workplace Type\"]")
	private WebElement selectWorkplace;

	public void ClickonWorkplace() {
		action.clickElement(selectWorkplace);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" On-Site\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectWorkplaceFromDD;

	public void SelectWorkplaceFromDropdown() {
		action.clickElement(selectWorkplaceFromDD);
	}

	String SkillRequires = "Agile Methodologies, Reporting , Certified SAP Consultant , Monitoring Performance , Project Management , Project Planning , Risk Management , Scrum , Six Sigma , Stakeholder Management";
	@FindBy(xpath = "//android.widget.EditText[@text=\"Skills *\"]")
	private WebElement enterSkill;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"JavaScript\"]/android.widget.TextView")
	private WebElement selectJava;

	public void EnterJobSkills() throws InterruptedException {

		action.clickElement(enterSkill);
		Thread.sleep(1000);
//		action.sendKeysElement(enterSkill, "Java");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);
		action.clickElement(selectJava);
		Thread.sleep(2000);
//		action.clickElement(selectJava);

	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Choose the Job Location\"]")
//	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement locatitionClick;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Mumbai\"]/android.widget.TextView")
	private WebElement locationEnt;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]/android.widget.TextView")
	private WebElement ConfirmLocationBtn;

	public void EnterLocation() throws InterruptedException {
		//4291811
		action.clickElement(locatitionClick);
//		TouchAction action=new TouchAction(driver);
//		action.tap(PointOption.point(429, 1811)).perform();
		Thread.sleep(2000);
		action.clickElement(locationEnt);
		Thread.sleep(1000);
		action.clickElement(ConfirmLocationBtn);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement continueBt;

	public void ClickonContinueButton() throws InterruptedException {
//		action.clickElement(locationEnt);
		Thread.sleep(3000);
		action.clickElement(continueBt);
	}
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"Select qualification\"]")
	private WebElement Qualificationdrop;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" Post Graduate Diploma in Management - PGDM \"]/android.widget.TextView")
	private WebElement SelectQualification;
	
	public void SelectQualificationfromDropdown() throws InterruptedException
	{
		action.clickElement(Qualificationdrop);
		Thread.sleep(1000);
		action.clickElement(SelectQualification);
	}

	@FindBy(xpath = "(//android.widget.EditText[@text=\"Minimum\"])[1]")
	private WebElement MinExp;

	public void ClickonMinExp() {
		action.clickElement(MinExp);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" 14 Years\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectMinyear;

	public void SelectMinExp() {
		action.clickElement(selectMinyear);
	}

	@FindBy(xpath = "(//android.widget.EditText[@text=\"Maximum\"])[1]")
	private WebElement MaxExp;

	public void ClickonMaxExp() {
		action.clickElement(MaxExp);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"20 Years\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectMaxyear;

	public void SelectMaxExp() {
		action.clickElement(selectMaxyear);
	}

	@FindBy(xpath = "//android.widget.EditText[@text=\"Currency\"]")
	private WebElement clickCurrency;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" INR (₹)\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectINR;

	public void SelectCurrency() throws InterruptedException {
		action.clickElement(clickCurrency);
		Thread.sleep(1000);
		action.clickElement(selectINR);
	}

	@FindBy(xpath = "(//android.widget.EditText[@text=\"Minimum\"])[1]")
	private WebElement clickSalary;

	public void ClickonSalary() {
		action.clickElement(clickSalary);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\" 40 Lacs\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectSal;

	public void SelectMinSalary() {
		action.clickElement(selectSal);
	}

	@FindBy(xpath = "(//android.widget.EditText[@text=\"Maximum\"])[1]")
	private WebElement clickMAxSalary;

	public void ClickonMAxSalary() {
		action.clickElement(clickMAxSalary);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"50 Lacs\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement selectMaxSal;

	public void SelectMaxSalary() {
		action.clickElement(selectMaxSal);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Company\"]/android.widget.CheckBox/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement companyRadBtn;

	public void ClickonCompanyRadioButton() {
		action.clickElement(companyRadBtn);
	}

	String DemoJD="We are seeking a highly motivated Junior SOC 2 Compliance Specialist to embark on a learning journey with us. This entry-level position is ideal for someone passionate and eager to dive deep into the world of SOC 2 compliance. We are looking for a highly motivated and detail-oriented Junior SOC 2 Compliance Specialist to join our team. The ideal candidate will be responsible for ensuring that our company is compliant with SOC 2 standards and will work closely with our IT, security, legal, and other business units to achieve this goal.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Responsibilities\r\n"
			+ "Develop and maintain SOC 2 compliance policies and procedures.\r\n"
			+ "Learn about the SOC 2 standards and how they apply to cloud game streaming services.\r\n"
			+ "Support in establishing and enforcing Data Management Policies and Procedures focusing on the five trust service principles of SOC 2.\r\n"
			+ "Assisting in the implementation and maintenance of SOC 2 controls.\r\n"
			+ "Collaborating with various teams to ensure compliance with SOC 2 standards.\r\n"
			+ "Prepare SOC 2 audit reports. Participate in internal audits and learn how to evaluate the effectiveness of security controls.\r\n"
			+ "Gain experience in managing and monitoring cloud resources, including servers, storage, databases, and networking with a focus on security.\r\n"
			+ "Contribute to the development and implementation of security measures and policies.\r\n"
			+ "Assist in preparing reports and documentation related to SOC 2 compliance efforts.\r\n"
			+ "Prepare reports on the status of SOC 2 compliance and present them to management.\r\n"
			+ "Stay updated on changes to SOC 2 standards .\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Requirements\r\n"
			+ "Bachelor s degree in Computer Science, Information Technology, or related field. Recent graduates are encouraged to apply.\r\n"
			+ "A foundational understanding of system and network infrastructure, cloud computing, and security protocols.\r\n"
			+ "Strong analytical and problem-solving skills.\r\n"
			+ "Excellent communication skills and the ability to work well in a team.\r\n"
			+ "A genuine interest in specializing in SOC 2 compliance and cloud security.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Preferred:\r\n"
			+ "Certifications such as CompTIA Security+ or willingness to pursue relevant certifications during employment.\r\n"
			+ "A curiosity about cloud gaming technology and eagerness to understand the technical nuances.\r\n"
			+ "Relevant certifications or experiences in the field of information security and compliance.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "What can you expect from Integra?\r\n"
			+ "Excellent pay.\r\n"
			+ "Opportunity to work with international clients.\r\n"
			+ "World class training on multiple skills.\r\n"
			+ "Planned career growth.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Why you should join Integra?\r\n"
			+ "Excellent working atmosphere.\r\n"
			+ "Salary and bonus always paid on-time.\r\n"
			+ "You work for a US corporation (and a UK company).\r\n"
			+ "You work for a company that has continuously grown for past 20 years.\r\n"
			+ "Very supportive senior management.\r\n"
			+ "Certifications and Memberships\r\n"
			+ "Role: Software Compliance - License Management\r\n"
			+ "Industry Type: Management Consulting\r\n"
			+ "Department: IT & Information Security\r\n"
			+ "Employment Type: Full Time, Permanent\r\n"
			+ "Role Category: IT Infrastructure Services\r\n"
			+ "Education\r\n"
			+ "UG: Any Graduate\r\n"
			+ "PG: Any Postgraduate";
	
	String TestEngineerJD="7+ years of experience with leading system and software test teams;\r\n"
			+ "Knowledge of continuous integration and continuous delivery, including Jenkins;\r\n"
			+ "Secret Clearance;\r\n"
			+ "Security+ CE, SSCP, CCNA-Security, or GSEC Certification or ability to obtain within 6 months of hire;\r\n"
			+ "Bachelor’s degree;\r\n"
			+ "Sequoia;\r\n"
			+ "Minimum of 4 years’ experience in multiple full lifecycle software deliveries from development to final software acceptance;\r\n"
			+ "Tools and Technologies in use include the following: IBM Sterling OMS;\r\n"
			+ "Experience with test equipment and test fixture design;\r\n"
			+ "Experience with process validation, computer system validation, equipment qualification, and test method validation;\r\n"
			+ "Ability to work independently under minimum supervision;\r\n"
			+ "Lifting up to 20 lbs and standing for extended periods may be required;\r\n"
			+ "You have 8+ years of verifiable related experience;\r\n"
			+ "Bachelor of Science degree in Engineering;\r\n"
			+ "5+ years experience in systems testing or equivalent field.";
	
	String JD = "About the job\r\n" + "Your potential, unleashed.\r\n" + "\r\n"
			+ "India’s impact on the global economy has increased at an exponential rate and Deloitte presents an opportunity to unleash and realise your potential amongst cutting edge leaders, and organisations shaping the future of the region, and indeed, the world beyond.\r\n"
			+ "At Deloitte, your whole self to work, every day. Combine that with our drive to propel with purpose and you have the perfect playground to collaborate, innovate, grow, and make an impact that matters.\r\n"
			+ "";
	String DCMJd="Job description\r\n"
			+ "SHRIRAM RAYONS,\r\n"
			+ "\r\n"
			+ "Department: Accounts\r\n"
			+ "\r\n"
			+ "Position: Asst. /Dy. Manager\r\n"
			+ "Qualification: B.Com, CMA\r\n"
			+ "Preferred Age Group: 25-30 Years\r\n"
			+ "Experience: 03-06 Years\r\n"
			+ "Area of Working: Costing & MIS\r\n"
			+ "Description:\r\n"
			+ "• Monthly plant costing\r\n"
			+ "• CA plan preparation\r\n"
			+ "• Monitoring of stores & repair budget\r\n"
			+ "• Internal order settlement\r\n"
			+ "• Cost sheet working\r\n"
			+ "• Coordination with Department & auditors\r\n"
			+ "• Other balance sheet related work";
	
	String FullStackJD="Responsibilities\r\n"
			+ "Participate in all aspects of agile software development, including design, implementation, and deployment\r\n"
			+ "Architect and provide guidance on building end-to-end systems optimized for speed and scale\r\n"
			+ "Work primarily in Ruby, Java/JRuby, React, and JavaScript\r\n"
			+ "Engage with inspiring designers and front-end engineers, and collaborate with leading back-end engineers to create reliable APIs\r\n"
			+ "Collaborate across time zones via Slack, GitHub comments, documents, and frequent videoconferences\r\n"
			+ "Required skills and qualifications\r\n"
			+ "At least one year of experience in building large-scale software applications\r\n"
			+ "Experience in building web applications\r\n"
			+ "Experience in designing and integrating RESTful APIs\r\n"
			+ "Knowledge of Ruby, Java/JRuby, React, and JavaScript\r\n"
			+ "Excellent debugging and optimization skills\r\n"
			+ "Experience in unit/integration testing\r\n"
			+ "Preferred skills and qualifications\r\n"
			+ "Bachelor’s degree (or equivalent) in computer science, information technology, or engineering\r\n"
			+ "Interest in learning new tools, languages, workflows, and philosophies\r\n"
			+ "Professional certification";
	
	
	String TechnicalLeadManagerJD="We are looking for an innovative technical lead to join our company. As the technical lead, you will oversee the companys technical team and all projects they undertake, identify risks, and develop work schedules. You should be able to work with your team and inspire them to reach their goals. Your core focus will be to stabilize and then migrate from our old system to a new version using the latest technologies.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Roles and Responsibilities:\r\n"
			+ "\r\n"
			+ "Outline and implement a strategy to migrate away from Classic ASP application to a modern framework\r\n"
			+ "Conduct code reviews and define code quality standards\r\n"
			+ "Identify root cause issues and direct team on how to maintain and support existing ASP Classic applications.\r\n"
			+ "Define timelines and hold the team accountable for meeting deadlines\r\n"
			+ "Ensure the stability and performance of legacy systems. Develop initiative to increase automated test coverage\r\n"
			+ "Develop and implement new features using Typescript and modern frameworks.\r\n"
			+ "Work on both front-end and back-end components of the new system.\r\n"
			+ "Develop and maintain APIs and integration layers.\r\n"
			+ "Work with healthcare standards (e.g., HL7, FHIR) for interoperability.\r\n"
			+ "Oversee the development and integration projects.\r\n"
			+ "Coordinate between different teams (legacy, modern, security).\r\n"
			+ "Manage stakeholder expectations and communications.\r\n"
			+ "Translate business needs into technical specifications.\r\n"
			+ "Ensure projects are delivered on time and within budget.\r\n"
			+ "\r\n"
			+ "Qualifications:\r\n"
			+ "\r\n"
			+ "Knowledge of best practices in software development and agile methodologies. Desire to manage and teach.\r\n"
			+ "Strong experience with ASP Classic and related technologies.\r\n"
			+ "Familiarity with Windows infrastructure and IIS.\r\n"
			+ "Deep understanding of application monitoring. Experience with DataDog preferred.\r\n"
			+ "Ability to work with legacy databases and connectivity protocols.\r\n"
			+ "Proficiency in Typescript, Node.js, and modern JavaScript frameworks (React).\r\n"
			+ "Experience with back-end technologies such as Express.js and Microsoft SQL.\r\n"
			+ "Strong understanding of API development and integration.\r\n"
			+ "An understanding of healthcare interoperability standards will be an added advantage.\r\n"
			+ "Familiarity with both legacy system protocols and modern RESTful APIs.\r\n"
			+ "Strong analytical and problem-solving skills.\r\n"
			+ "Experience with automated testing.\r\n"
			+ "Familiarity with testing tools (e.g., Selenium, JUnit).\r\n"
			+ "Strong understanding of software development lifecycle.\r\n"
			+ "Excellent attention to detail and problem-solving skills.\r\n"
			+ "Experience with requirements gathering and documentation.\r\n"
			+ "Proven experience in project management\r\n"
			+ "\r\n"
			+ "Role: Technical Lead\r\n"
			+ "Industry Type: BPO / Call Centre\r\n"
			+ "Department: Engineering - Software & QA\r\n"
			+ "Employment Type: Full Time, Permanent\r\n"
			+ "Role Category: Software Development\r\n"
			+ "Education\r\n"
			+ "UG: B.Tech/B.E. in Any Specialization";
	
	
	String TechMahindraDeliveryManagerJD="We are looking for Delivery Manager with experience in managing ITOM, AIOps and APM Technologies for multiple accounts\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Exp - 14- 20 Yrs\r\n"
			+ "\r\n"
			+ "Location - Mumbai\r\n"
			+ "\r\n"
			+ "Candidate must have complete understanding of ITSM, ITOM, AIOps and APM Technologies\r\n"
			+ "Candidate must have thorough exposure in BMC, OpsRamp, Dynatrace and other major OEMs\r\n"
			+ "Candidate must be responsible for Services Revenue of minimum 5 Mn ACV with a yearly growth plan of 25% YoY\r\n"
			+ "Candidate should have understanding of Solutioning, RLS Creation, PnL, etc.,\r\n"
			+ "Candidate should have complete understanding of Project Management, Program Management, Delivery Management and Operations Management\r\n"
			+ "Candidate should have knowledge of various Domain Specific Use Cases for ITSM, ITOM and APM Solution\r\n"
			+ "Candidate should have good exposure in WLA Technology\r\n"
			+ "Candidate should drive case studies with Technical Architects and should produce min of 2 Case Studies per Quarter\r\n"
			+ "Candidate should have complete grip on Transformation and Transition Methodologies\r\n"
			+ "Candidate should be responsible for smooth Handover to Operations Team\r\n"
			+ "Candidate should be well versed with Vendor Management teams and drive positive Outcomes\r\n"
			+ "Candidate should have knowledge on EBIDTA and Margin Calculations\r\n"
			+ "Candidate should be able to motivate Technical Teams for Technical and Business Use cases and drive them to produce usable offerings\r\n"
			+ "Role: IT Infrastructure Services - Other\r\n"
			+ "Industry Type: IT Services & Consulting\r\n"
			+ "Department: IT & Information Security\r\n"
			+ "Employment Type: Full Time, Permanent\r\n"
			+ "Role Category: IT Infrastructure Services\r\n"
			+ "Education\r\n"
			+ "UG: Any Graduate\r\n"
			+ "PG: Any Postgraduate";
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter job details\"]")
	private WebElement JdEnt;

	public void EnterJD(String JobDesc) {
//		action.sendKeysElement(JdEnt, JD);
//		action.sendKeysElement(JdEnt, DCMJd);
		//action.sendKeysElement(JdEnt, TestEngineerJD);
		
//		action.sendKeysElement(JdEnt, DemoJD);
		 action.sendKeysElement(JdEnt, JobDesc);
	}
	

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]/android.widget.TextView")
	private WebElement continueBtnJob;

	public void ClickonContinueButtoninJOb() {
		action.clickElement(continueBtnJob);
	}

	// 895,134
	@FindBy(xpath = "(//com.horcrux.svg.PathView)[3]")
	private WebElement myJOb;

	public void TouchClickonMyJob() throws InterruptedException {
		action.clickElement(myJOb);
//		TouchAction action=new TouchAction(driver);
//		action.tap(PointOption.point(895, 134)).perform();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[3])[2]")
	private WebElement savedTab;

	public void ClickonSavedTab() {
		action.clickElement(savedTab);
	}

	@FindBy(xpath = "(//android.widget.TextView)[3]")
	private WebElement returnActualGettextofjobTitle;

	public String ActualGettextJOBTitle() {
		return returnActualGettextofjobTitle.getText();
	}

}
