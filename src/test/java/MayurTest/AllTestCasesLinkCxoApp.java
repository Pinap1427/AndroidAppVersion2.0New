package MayurTest;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import AbstractComponents.AbstractComponent;
import LinkCxO2.O.Pages.AddEducationNew;
//import LinkCxO.Pages.ShareYourExperinece.createPoll;
import LinkCxO2.O.Pages.AddExperienceNew;
import LinkCxO2.O.Pages.AddIndustryNew;
import LinkCxO2.O.Pages.AddLanguageNew;
import LinkCxO2.O.Pages.AddPublicationsNew;
import LinkCxO2.O.Pages.AdditionalInformationNEw;
import LinkCxO2.O.Pages.ApplyJobNew;
import LinkCxO2.O.Pages.AwardsandCertificationsNew;
import LinkCxO2.O.Pages.CandidateShortlistHoldReject;
import LinkCxO2.O.Pages.ComapnyPostAsQueryNew;
import LinkCxO2.O.Pages.CompanyComposeAnArticle;
import LinkCxO2.O.Pages.CompanyCreateNewJob;
import LinkCxO2.O.Pages.CompanyCreatePollNew;
import LinkCxO2.O.Pages.CompanyCreatePost;
import LinkCxO2.O.Pages.CompanyCreateaSurveyNew;
import LinkCxO2.O.Pages.ComposeArticleNew;
import LinkCxO2.O.Pages.CreateClubNew;
import LinkCxO2.O.Pages.CreateEventNew;
import LinkCxO2.O.Pages.CreateJobNEw;
import LinkCxO2.O.Pages.CreatePollNEw;
import LinkCxO2.O.Pages.CreatePostNew;
import LinkCxO2.O.Pages.CreateSurveyNew;
import LinkCxO2.O.Pages.DeleteEducationNew;
import LinkCxO2.O.Pages.DeleteExperienceNew;
import LinkCxO2.O.Pages.EditEducationNew;
import LinkCxO2.O.Pages.EditExperienceNew;
import LinkCxO2.O.Pages.LoginWithEmailIDNew;
//import LinkCxO2.O.Pages.LoginWithMobileNumber;
import LinkCxO2.O.Pages.PostAsQueryNew;
import LinkCxO2.O.Pages.SignUpNew;
import LinkCxO2.O.Pages.ClubCreatePost;
import LinkCxO2.O.Pages.ClubCreateaSurveyNew;
import LinkCxO2.O.Pages.ClubPostAsQueryNew;
import LinkCxO2.O.Pages.ClubComposeAnArticle;
import LinkCxO2.O.Pages.ClubCreatePollNew;
import LinkCxO2.O.Utils.ExcelUtils;

//import com.ishine.utils.TestUtils;

import LinkCxO2.O.Utils.TestUtilsLinkCxo;
import LinkCxO2.O.base.TestBaseLinkCxo;
import jdk.internal.org.jline.utils.Log;

public class AllTestCasesLinkCxoApp extends TestBaseLinkCxo {
	private long startTime;
	
	@BeforeMethod
    public void beforeMethod() {
        startTime = System.nanoTime();
    }

    @AfterMethod
    public void afterMethod() {
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime) / 1_000_000_000; // Convert from nanoseconds to seconds
//        System.out.println("Test case execution time: " + duration + " seconds");
        
    	 long endTime = System.nanoTime();
         long durationInNanos = endTime - startTime;
         long durationInSeconds = durationInNanos / 1_000_000_000; // Convert from nanoseconds to seconds
         
         long minutes = durationInSeconds / 60;
         long seconds = durationInSeconds % 60;

         System.out.printf("Test case execution time: %d minutes and %d seconds%n", minutes, seconds);
        
    }



	@Override
	public void TestBase() throws IOException {
		super.TestBase();
		this.driver = driver;
	}

	int rowCount;
	String[][] testData;

//	   LoginWithMobileNumber loginmob;
	// Create reference of the pages class
	AbstractComponent absCom;
	ExcelUtils excel;
	TestUtilsLinkCxo testUtils1;
	LoginWithEmailIDNew emailidLoginMethod;
	SignUpNew newuserSignupMethod;
	CreatePostNew createpostMethod;
	ComposeArticleNew composeArticleMethod;
	CreatePollNEw pollCreateMethod;
	PostAsQueryNew postasQueryMethod;
	CreateSurveyNew surveyCreateMethod;
	AddExperienceNew expAdddMethod;
	EditExperienceNew expEditMethod;
	DeleteExperienceNew delExpMethod;
	AddEducationNew eduAddMethod;
	EditEducationNew eduEditMethod;
	DeleteEducationNew delEduMethod;
	AddIndustryNew indAddMEthod;
	AwardsandCertificationsNew addAwardsMethod;
	AddPublicationsNew pubAddMethod;
	AddLanguageNew langAddMethod;
	AdditionalInformationNEw addAdditonInfoMethod;
	CreateEventNew newEventCreateMethod;
	CreateClubNew newClubCreateMethod;
	CreateJobNEw newJobCreateMethod;
	ApplyJobNew newJobApplyMethod;
	CompanyCreatePost companyCreatePostMethod;
	CompanyComposeAnArticle companyArticleMethod;
	CompanyCreatePollNew companyCreatePollMethod;
	CompanyCreateaSurveyNew companyCreateSurveyMethod;
	ComapnyPostAsQueryNew companyPostasqueryMethod;
	CompanyCreateNewJob companyCreateJobMethod;
	CandidateShortlistHoldReject candstatusMethod;
	ClubCreatePost clubCreatePostMethod;
	ClubComposeAnArticle clubComposeArticleMethod;
	ClubCreatePollNew clubCreatePollMethod;
	ClubCreateaSurveyNew clubCreateASurveyMethod;
	ClubPostAsQueryNew clubPostAsQueryMethod;

	@BeforeTest
	public void SetUp() throws Exception {
		LaunchApp();
		// Path to your Excel file using user.dir
//		String excelPath = System.getProperty("user.dir") + File.separator + "AndroidAppVersion2.0New" + File.separator + "TestData" + File.separator + "Datasheet.xlsx";
		String excelPath = System.getProperty("user.dir") + "\\TestData\\Datasheet.xlsx";
		System.out.println(excelPath);
		// Create an instance of ExcelUtils to read data
		excel = new ExcelUtils(excelPath, "Sheet1");
//        rowCount = excel.getRowCount();
//        testData = new String[rowCount - 1][3]; // Assuming 3 columns and first row is header
//
//        for (int i = 1; i < rowCount; i++) {  // Assuming first row is header
//            testData[i - 1][0] = excel.getCellData(i, 0);
//            testData[i - 1][1] = excel.getCellData(i, 1);
//            testData[i - 1][2] = excel.getCellData(i, 2);
//        }

		testUtils1 = new TestUtilsLinkCxo(driver);
		absCom = new AbstractComponent(driver);
		emailidLoginMethod = new LoginWithEmailIDNew(driver);
		newuserSignupMethod = new SignUpNew(driver);
		createpostMethod = new CreatePostNew(driver);
		composeArticleMethod = new ComposeArticleNew(driver);
		pollCreateMethod = new CreatePollNEw(driver);
		postasQueryMethod = new PostAsQueryNew(driver);
		surveyCreateMethod = new CreateSurveyNew(driver);
		expAdddMethod = new AddExperienceNew(driver);
		expEditMethod = new EditExperienceNew(driver);
		delExpMethod = new DeleteExperienceNew(driver);
		eduAddMethod = new AddEducationNew(driver);
		eduEditMethod = new EditEducationNew(driver);
		delEduMethod = new DeleteEducationNew(driver);
		indAddMEthod = new AddIndustryNew(driver);
		addAwardsMethod = new AwardsandCertificationsNew(driver);
		pubAddMethod = new AddPublicationsNew(driver);
		langAddMethod = new AddLanguageNew(driver);
		addAdditonInfoMethod = new AdditionalInformationNEw(driver);
		newEventCreateMethod = new CreateEventNew(driver);
		newClubCreateMethod = new CreateClubNew(driver);
		newJobCreateMethod = new CreateJobNEw(driver);
		newJobApplyMethod = new ApplyJobNew(driver);
		companyCreatePostMethod = new CompanyCreatePost(driver);
		companyArticleMethod = new CompanyComposeAnArticle(driver);
		companyCreatePollMethod = new CompanyCreatePollNew(driver);
		companyCreateSurveyMethod = new CompanyCreateaSurveyNew(driver);
		companyPostasqueryMethod = new ComapnyPostAsQueryNew(driver);
		companyCreateJobMethod = new CompanyCreateNewJob(driver);
		candstatusMethod = new CandidateShortlistHoldReject(driver);
		clubCreatePostMethod = new ClubCreatePost(driver);
		clubComposeArticleMethod = new ClubComposeAnArticle(driver);
		clubCreatePollMethod = new ClubCreatePollNew(driver);
		clubCreateASurveyMethod = new ClubCreateaSurveyNew(driver);
		clubPostAsQueryMethod = new ClubPostAsQueryNew(driver);

	}

	@Test(priority = 1, enabled = true)
	public void LoginInWithEmailid() throws IOException, InterruptedException {
		////////Login with Email id /////////
		testUtils1.extentReport();
		testUtils1.testCaseCreate("TC 1 : Login With Email id ");
		Thread.sleep(3000);
		emailidLoginMethod.ClickonContinueWithEmailorMobile();
		testUtils1.test.log(Status.INFO, "Click on Continue With Email id or Mobile Number");

		emailidLoginMethod.EnterEmailId();
		testUtils1.test.log(Status.INFO, "Enter Email id");
		emailidLoginMethod.TouchClickonSendOtp();
		testUtils1.test.log(Status.INFO, "Click on Send Otp");
		emailidLoginMethod.enterOtp1();
		testUtils1.test.log(Status.INFO, "Enter Otp 1");
		emailidLoginMethod.enterOtp2();
		testUtils1.test.log(Status.INFO, "Enter Otp 2");
		emailidLoginMethod.enterOtp3();
		testUtils1.test.log(Status.INFO, "Enter Otp 3");
		emailidLoginMethod.enterOtp4();
		testUtils1.test.log(Status.INFO, "Enter Otp 4");
		emailidLoginMethod.enterOtp5();
		testUtils1.test.log(Status.INFO, "Enter Otp 5");
		emailidLoginMethod.enterOtp6();
		testUtils1.test.log(Status.INFO, "Enter Otp 6");
		emailidLoginMethod.ClickonConfirmtoVerifyButton();
		testUtils1.test.log(Status.INFO, "click on verify button");
		Thread.sleep(3000);
		try {
			if (emailidLoginMethod.verifyLoginSuccesfully()) {
				testUtils1.passTestCase("To verify User is succusfully able to login");
			}

		} catch (Exception e) {
			testUtils1.failTestCase("To verify User is not able to login successfully");
		}
//		Thread.sleep(2000);
//		absCom.SwipDown();
//		testUtils1.test.log(Status.INFO, "Swipe down");

	}

	@Test(priority = 2, enabled = true)
	public void CreatePost() throws InterruptedException, IOException, AWTException {

		testUtils1.testCaseCreate("TC 2 : Create Post ");
		Thread.sleep(3000);
		createpostMethod.ClickonPlusIcon();
		testUtils1.test.log(Status.INFO, "Click on Plus Icon");

		createpostMethod.ClickonCreatePost();
		testUtils1.test.log(Status.INFO, "Click on Create Post");
		String CreatePostDesc = excel.getCellData(1, 5);
		createpostMethod.EnterTextForPOst(CreatePostDesc);
		testUtils1.test.log(Status.INFO, "Enter Text ");
		createpostMethod.ClickonPhotosIcon();
		testUtils1.test.log(Status.INFO, "Click on Photos icon");
		Thread.sleep(3000);
//		createpostMethod.EnterBtn();
		createpostMethod.SelectImage();
		testUtils1.test.log(Status.INFO, "Select Image");
		Thread.sleep(3000);
		createpostMethod.ClickonAddYourPost();
		testUtils1.test.log(Status.INFO, "Click on Add Your Post");
		createpostMethod.ClickonPublishNow();
		testUtils1.test.log(Status.INFO, "Click on Publish Now");
		Thread.sleep(4000);
		try {
			if (createpostMethod.VerifyPostCreatedorNOt()) {

				testUtils1.passTestCase("User is able to Create Post");

			}
		} catch (IOException e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Post");
		}

	}

	@Test(priority = 3, enabled = false)
	public void ComposeArticle() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 3 : Compose Article");
		Thread.sleep(3000);

		try {

			composeArticleMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			composeArticleMethod.ClickonComposeArticle();
			testUtils1.test.log(Status.INFO, "Click on Compose Article");
			composeArticleMethod.ClickonImage();
			testUtils1.test.log(Status.INFO, "Click on Image");
			Thread.sleep(3000);
			composeArticleMethod.SelectImage();
			testUtils1.test.log(Status.INFO, "Select Image");
			String ArticleTitle = excel.getCellData(1, 6);
			composeArticleMethod.EnterArticleTitle(ArticleTitle);
			testUtils1.test.log(Status.INFO, "Enter Article");
			String ArticleDesc = excel.getCellData(1, 7);
			composeArticleMethod.EnterDescription(ArticleDesc);
			testUtils1.test.log(Status.INFO, "Enter Description of Article");
			composeArticleMethod.ClickonPublishArticle();
			testUtils1.test.log(Status.INFO, "Click on Publish Article");
			Thread.sleep(3000);
			try {
				if (composeArticleMethod.VerifyArticlePostedorNot()) {

					testUtils1.passTestCase("User is able to compose Article");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to compose Article");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to compose Article");
		}
	}

	@Test(priority = 4, enabled = false)
	public void CreatePoll() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 4 : Create Poll ");
		Thread.sleep(3000);
//need to change xpath in category selection
		try {

			pollCreateMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			pollCreateMethod.ClickonCreatePoll();
			testUtils1.test.log(Status.INFO, "Click on Create Poll");
			pollCreateMethod.ClickonOptionAddButton();
			testUtils1.test.log(Status.INFO, "Click on Add Option ");
			pollCreateMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Category");
			pollCreateMethod.SelectCategoryfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Category from dropdown");
			String PollQuestion = excel.getCellData(1, 8);
			pollCreateMethod.EnterQuestion(PollQuestion);
			testUtils1.test.log(Status.INFO, "Enter Question");
			String PollOption1 = excel.getCellData(1, 9);
			pollCreateMethod.EnterOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			String PollOption2 = excel.getCellData(1, 10);
			pollCreateMethod.EnterOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			String PollOption3 = excel.getCellData(1, 11);
			pollCreateMethod.EnterOption3();
			testUtils1.test.log(Status.INFO, "Enter Option 3");
			String PollOption4 = excel.getCellData(1, 12);
			pollCreateMethod.EnterOption4();
			testUtils1.test.log(Status.INFO, "Enter Option 4");
			pollCreateMethod.ClickonPollEndDropDown();
			testUtils1.test.log(Status.INFO, "Click on Poll End Dropdown");
			pollCreateMethod.SelectPollEndDate();
			testUtils1.test.log(Status.INFO, "Select Poll End date");
			pollCreateMethod.ClickonPublishPollButton();
			testUtils1.test.log(Status.INFO, "Click on Publish Poll Button");
			Thread.sleep(3000);
			try {
				if (pollCreateMethod.VerifyPollCreatedorNot()) {
					testUtils1.passTestCase("User is  able to Create Poll");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Create Poll");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Poll");
		}
	}

	@Test(priority = 5, enabled = false)
	public void PostAsQuery() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 5 : Post as Query ");
		Thread.sleep(3000);
		try {
			// need to change xpath in category selection
			postasQueryMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			postasQueryMethod.ClickonPostAsQuery();
			testUtils1.test.log(Status.INFO, "Click on Post as Query");
			postasQueryMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Category");
			postasQueryMethod.SelectCategoryfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Category from dropdown");
			String QueryQuest = excel.getCellData(1, 24);
			postasQueryMethod.EnterQuestion(QueryQuest);
			testUtils1.test.log(Status.INFO, "Enter Question");
			String QueryDesc = excel.getCellData(1, 25);
			postasQueryMethod.EnterDescription(QueryDesc);
			testUtils1.test.log(Status.INFO, "Enter Description");
			postasQueryMethod.ClickonPostYourQueryButton();
			testUtils1.test.log(Status.INFO, "Click on Post Your Query");

			Thread.sleep(3000);
			try {
				if (postasQueryMethod.VerifyQueryPostorNot()) {
					testUtils1.passTestCase("User is able to Post as Query");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Post as Query");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Post as Query");
		}
	}

	@Test(priority = 6, enabled = false)
	public void CreateSurvey() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 6 : Create Survey ");
		Thread.sleep(3000);
		try {
			surveyCreateMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			surveyCreateMethod.ClickonSurveybutton();
			testUtils1.test.log(Status.INFO, "Click on Create Your Survey");
			String SurveyTitle = excel.getCellData(1, 13);
			surveyCreateMethod.EnterTitle(SurveyTitle);
			testUtils1.test.log(Status.INFO, "Enter Title");
			String SurveyDesc = excel.getCellData(1, 14);
			surveyCreateMethod.EnterDescriptionforSurvey(SurveyDesc);
			testUtils1.test.log(Status.INFO, "Enter Description");
			surveyCreateMethod.ClickonSelectCategorySurvey();
			testUtils1.test.log(Status.INFO, "Click on Select Category dropdown");
			surveyCreateMethod.SelectCategoryfromDropdownSurvey();
			testUtils1.test.log(Status.INFO, "Select Category from Dropdown");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(508, 2000, 546);
			testUtils1.test.log(Status.INFO, "Swip down by co ordinates");
			surveyCreateMethod.ClickonFirstQuestionType();
			testUtils1.test.log(Status.INFO, "Click on First Question type");
			surveyCreateMethod.ClickonMultipleChoiceOpt();
			testUtils1.test.log(Status.INFO, "Select First Question Type");
			surveyCreateMethod.ClickonOptionAdd2Time();
			testUtils1.test.log(Status.INFO, "Click on Add question 2 times");
			String SurveyQuest1 = excel.getCellData(1, 15);
			surveyCreateMethod.EnterQuestion(SurveyQuest1);
			testUtils1.test.log(Status.INFO, "Enter Question 1");
			String SurveyOption1Q1 = excel.getCellData(1, 16);
			surveyCreateMethod.EnterOption1(SurveyOption1Q1);
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			String SurveyOption2Q1 = excel.getCellData(1, 17);
			surveyCreateMethod.EnterOption2(SurveyOption2Q1);
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			String SurveyOption3Q1 = excel.getCellData(1, 18);
			surveyCreateMethod.EnterOption3(SurveyOption3Q1);
			testUtils1.test.log(Status.INFO, "Enter Option 3");
			String SurveyOption4Q1 = excel.getCellData(1, 19);
			surveyCreateMethod.EnterOption4(SurveyOption4Q1);
			testUtils1.test.log(Status.INFO, "Enter Option 4");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(517, 2097, 576);
			surveyCreateMethod.ClickonSecondQuestionType();
			testUtils1.test.log(Status.INFO, "Click on Second Question Type");
			surveyCreateMethod.ClickonSelectOpt();
			testUtils1.test.log(Status.INFO, "Click on SELECT Option");
			String SurveyQuest2 = excel.getCellData(1, 20);
			surveyCreateMethod.EnterSecondQuestion(SurveyQuest2);
			testUtils1.test.log(Status.INFO, "Enter Second Question");
			String SurveyOption1Q2 = excel.getCellData(1, 21);
			surveyCreateMethod.EnterSecondOption1(SurveyOption1Q2);
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			String SurveyOption2Q2 = excel.getCellData(1, 22);
			surveyCreateMethod.EnterSecondOption2(SurveyOption2Q2);
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			Thread.sleep(2000);
//			absCom.SwipDown();
			absCom.swipDownByCoordinates(517, 2122, 454);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			surveyCreateMethod.ClickonAddAnotherQuestion();
			testUtils1.test.log(Status.INFO, "Click on Add Another Question");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(521, 2122, 664);
//			absCom.SwipDown();
			testUtils1.test.log(Status.INFO, "Swipe down by Co Ordinates");
			surveyCreateMethod.ClickonThirdQuestionType();
			testUtils1.test.log(Status.INFO, "Click on Third Question Type");
			surveyCreateMethod.ClickonTextOption();
			testUtils1.test.log(Status.INFO, "Select Text From DropDown");
			String SurveyQuest3 = excel.getCellData(1, 23);
			surveyCreateMethod.EnterThirdQuestion(SurveyQuest3);
			testUtils1.test.log(Status.INFO, "Enter Third Question");
			Thread.sleep(3000);
			surveyCreateMethod.ClickonSurveyEndDropDown();
			testUtils1.test.log(Status.INFO, "Click on Survey End Dropdown");
			surveyCreateMethod.ClickonDatetoEndSurvey();
			testUtils1.test.log(Status.INFO, "Select end Date From dropdown");
			surveyCreateMethod.ClickonCreateYourSurveyfinal();
			testUtils1.test.log(Status.INFO, "Click on final Create Your Survey Button");
			Thread.sleep(5000);

			try {
				if (surveyCreateMethod.VerifySuveyCreatedorNOT()) {

					testUtils1.passTestCase("User is able to Create Survey");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Create Survey");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Survey");
		}
	}

//
	@Test(priority = 1, enabled = false)
	public void NewUSerSignUP() throws IOException, InterruptedException {
		testUtils1.extentReport();
		testUtils1.testCaseCreate("TC 1 : New User Sign Up ");
		Thread.sleep(3000);
		try {
			newuserSignupMethod.ClickonContinueWithEmailorMobile();
			testUtils1.test.log(Status.INFO, "Click on Continue With Email id or Mobile Number");

			newuserSignupMethod.EnterEmailId();
			testUtils1.test.log(Status.INFO, "Enter Email id");
			newuserSignupMethod.TouchClickonSendOtp();
			testUtils1.test.log(Status.INFO, "Click on Send Otp");
			newuserSignupMethod.enterOtp1();
			testUtils1.test.log(Status.INFO, "Enter Otp 1");
			newuserSignupMethod.enterOtp2();
			testUtils1.test.log(Status.INFO, "Enter Otp 2");
			newuserSignupMethod.enterOtp3();
			testUtils1.test.log(Status.INFO, "Enter Otp 3");
			newuserSignupMethod.enterOtp4();
			testUtils1.test.log(Status.INFO, "Enter Otp 4");
			newuserSignupMethod.enterOtp5();
			testUtils1.test.log(Status.INFO, "Enter Otp 5");
			newuserSignupMethod.enterOtp6();
			testUtils1.test.log(Status.INFO, "Enter Otp 6");
			newuserSignupMethod.ClickonConfirmtoVerifyButton();
			testUtils1.test.log(Status.INFO, "click on verify button");
			Thread.sleep(3000);
			newuserSignupMethod.EnterFirstName();
			testUtils1.test.log(Status.INFO, "Enter First Name");
			newuserSignupMethod.EnterLastName();
			testUtils1.test.log(Status.INFO, "Enter Last Name");
			newuserSignupMethod.EnterCompany();
			testUtils1.test.log(Status.INFO, "Enter Company Name");
			newuserSignupMethod.ClickonDesignationDropDown();
			testUtils1.test.log(Status.INFO, "Click on Select Designation Dropdown");
			newuserSignupMethod.SelectDesignation();
			testUtils1.test.log(Status.INFO, "Select Designation");
			newuserSignupMethod.EnterExperience();
			testUtils1.test.log(Status.INFO, "Enter total exprience");
			newuserSignupMethod.EnterPhoneNumber();
			testUtils1.test.log(Status.INFO, "Enter Phone Number");
			newuserSignupMethod.EntnerLink();
			testUtils1.test.log(Status.INFO, "Enter Social Media Link");
			newuserSignupMethod.ClickonSubmitButton();
			testUtils1.test.log(Status.INFO, "Click on Submit Button");
			Thread.sleep(4000);

			try {
				if (newuserSignupMethod.VerifySignUpComplete()) {

					testUtils1.passTestCase("User is able to sign up.");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to sign up.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to sign up.");
		}
	}

	@Test(priority = 7, enabled = false)
	public void EditProfileFull() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 7  : Edit Profile ");
		Thread.sleep(3000);
		testUtils1.testCaseCreate("TC 7 A : Add Experience ");
		try {
			expAdddMethod.ClickonProfile();
			testUtils1.test.log(Status.INFO, "Click on Profile");
			Thread.sleep(2000);
			expAdddMethod.ClickonPlusIconExp();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			expAdddMethod.EnterDesignation();
			testUtils1.test.log(Status.INFO, "Enter Designation");
			expAdddMethod.ClickonSelectJobType();
			testUtils1.test.log(Status.INFO, "Click on Select Job Type");
			expAdddMethod.SelectJobTypeFromDropdown();
			testUtils1.test.log(Status.INFO, "Select Job Type From Dropdown");
			expAdddMethod.EnterCompanyName();
			testUtils1.test.log(Status.INFO, "Enter Company name");
			expAdddMethod.EnterLocation();
			testUtils1.test.log(Status.INFO, "Enter Location");
			expAdddMethod.ClickonCheckBox();
			testUtils1.test.log(Status.INFO, "Click on CheckBox");
			expAdddMethod.ClickonSelectDate();
			testUtils1.test.log(Status.INFO, "Click on Select Date");
			expAdddMethod.SelectDate();
			testUtils1.test.log(Status.INFO, "Select date");
			expAdddMethod.EnterSummary();
			testUtils1.test.log(Status.INFO, "Enter Summary");
			expAdddMethod.ClickonSaveButton();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(3000);
//			absCom.SwipDown();
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			try {
				if (expAdddMethod.VerifyExperienceAddedorNOT()) {
					testUtils1.passTestCase("User is able to add Experience");
				}
			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to add Experience");
			}
//////////////// Edit Experience////////////////////////////////////
			testUtils1.testCaseCreate("TC 7 B : Edit Experience ");
			Thread.sleep(3000);
			expEditMethod.ClickonEditExperience();
			testUtils1.test.log(Status.INFO, "Click on Edit Experience");
			expEditMethod.ClickonFirstExperienceEdit();
			testUtils1.test.log(Status.INFO, "Click on First Experience Edit");
			expEditMethod.EnterEditedDesign();
			testUtils1.test.log(Status.INFO, "Enter Designation");
			expEditMethod.ClickonEditedJobType();
			testUtils1.test.log(Status.INFO, "Click on Job Type");
			expEditMethod.SelectEditedJobType();
			testUtils1.test.log(Status.INFO, "Select Job Type");
			expEditMethod.EnterCompanyNameEdit();
			testUtils1.test.log(Status.INFO, "Enter Company Name");
			expEditMethod.EnterLocationEdit();
			testUtils1.test.log(Status.INFO, "Enter Location");
//			expEditMethod.ClickonCheckBox();
//			testUtils1.test.log(Status.INFO, "Click on CheckBox");
			expEditMethod.ClickonSelectDate();
			testUtils1.test.log(Status.INFO, "Click on Select Date");
			expEditMethod.SelectDate();
			testUtils1.test.log(Status.INFO, "Select date");
			expEditMethod.EnterSummary();
			testUtils1.test.log(Status.INFO, "Enter Summary");
			expEditMethod.ClickonSaveButton();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(3000);

//		absCom.swipDownByCoordinates(740, 2072, 1332);
//		testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			try {
				if (expEditMethod.VerifyEditedExperienceAddedorNOT()) {
					testUtils1.passTestCase("User is able to Edit Experience");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Edit Experience");
			}
			//// delete Experience script //////

			testUtils1.testCaseCreate("TC 7 C : Delete Experience ");
			delExpMethod.ClickonEdiExperience();
			testUtils1.test.log(Status.INFO, "Click on Edit Experience");
			delExpMethod.ClickonDeleteIcon();
			testUtils1.test.log(Status.INFO, "Click on Delete Icon");
			delExpMethod.ClickonDeleteButton();
			testUtils1.test.log(Status.INFO, "Click on Delete  Button");

			try {
				if (delExpMethod.VerifyExpDeletedOrNot()) {
					testUtils1.passTestCase("User is able to Delete Experience");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not Delete to Edit Experience");
			}

			delExpMethod.BackMethod();
			testUtils1.test.log(Status.INFO, "Go Back");

			///////// Add Education//////////
			testUtils1.testCaseCreate("TC 7 D : Add Education");
			Thread.sleep(3000);
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			eduAddMethod.ClickonPlusButtonInExp();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			eduAddMethod.EnterSchool();
			testUtils1.test.log(Status.INFO, "Enter school");
			eduAddMethod.EnterDegree();
			testUtils1.test.log(Status.INFO, "Enter Degree");
			eduAddMethod.ClickonSelectDAte();
			testUtils1.test.log(Status.INFO, "Click on Select Date");
			eduAddMethod.ClickonSelectYear();
			testUtils1.test.log(Status.INFO, "Click on 2024 year List");
			eduAddMethod.SelectStartYearfromList();
			testUtils1.test.log(Status.INFO, "Select Year From List");
			eduAddMethod.ClickonOkButton();
			testUtils1.test.log(Status.INFO, "Click on  OK Button");
			eduAddMethod.ClickonSelectEndDAte();
			testUtils1.test.log(Status.INFO, "Click on End Date");
			eduAddMethod.ClickonSelectYear();
			testUtils1.test.log(Status.INFO, "Click on 2024 year List");
			eduAddMethod.SelectEndYearfromList();
			testUtils1.test.log(Status.INFO, "Select End Year From List");
			eduAddMethod.ClickonOkButton();
			testUtils1.test.log(Status.INFO, "Click on  OK Button");
			eduAddMethod.EnterFieldOfStudy();
			testUtils1.test.log(Status.INFO, "Enter Field of Study");
			eduAddMethod.EnterGradeorCGPA();
			testUtils1.test.log(Status.INFO, "Enter Grade");
			eduAddMethod.EnterDescriptionEduction();
			testUtils1.test.log(Status.INFO, "Enter Description");
			eduAddMethod.ClickonSaveButtonEdu();
			testUtils1.test.log(Status.INFO, "Click on  Save Button");
			Thread.sleep(3000);
//			absCom.swipDownByCoordinates(740, 2072, 1332);
//			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			try {
				if (eduAddMethod.VerifyEducationaddedOrNOT()) {
					testUtils1.passTestCase("User is able to Add Education");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Add Education");
			}

			/////// Edit Education/////////
			testUtils1.testCaseCreate("TC 7 E : Edit Education");
			Thread.sleep(3000);
			eduEditMethod.ClickonEditEducation(); // changes in this method for test
			testUtils1.test.log(Status.INFO, "Click on Edit Education");
			eduEditMethod.ClickonEditFirstEducation();
			testUtils1.test.log(Status.INFO, "Click on First Edit Education");
			eduEditMethod.EnterSchoolEdit();
			testUtils1.test.log(Status.INFO, "Enter School");
			eduEditMethod.EnterDegreeEdit();
			testUtils1.test.log(Status.INFO, "Enter Degree");
			eduEditMethod.EnterFieldofStudyEdit();
			testUtils1.test.log(Status.INFO, "Enter Field of Study ");
			eduEditMethod.EnterGradeEdit();
			testUtils1.test.log(Status.INFO, "Enter  Grade");
			eduEditMethod.EnterDescrtiptionEdit();
			testUtils1.test.log(Status.INFO, "Enter Description");
			eduEditMethod.ClickonSaveButtonEdu();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(3000);
//			absCom.swipDownByCoordinates(740, 2072, 1332);
//			testUtils1.test.log(Status.INFO, "Swipe down");

			try {
				if (eduEditMethod.VerifyEducationaddedOrNOT()) {
					testUtils1.passTestCase("User is  able to Add Education");

				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Edit Education");
			}
//////Delete Education////

			testUtils1.testCaseCreate("TC 7 F : Delete Education");
			Thread.sleep(3000);
			delEduMethod.ClickonEditEducation();

			delEduMethod.ClickonDeleteEducationIcon();

			delEduMethod.ClickonDeleteButton();

			try {
				if (delEduMethod.VerifyEDuDeletedOrNot()) {
					testUtils1.passTestCase("User is able to Delete Education");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not Delete to Edit Education");
			}

			delEduMethod.BackMethod();
			testUtils1.test.log(Status.INFO, "Go Back");

			/////// Add Industry////////
////////////Add Industry///////
			testUtils1.testCaseCreate("TC 7 E : Add Industry ");
			Thread.sleep(4000);
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");

			indAddMEthod.AddIndustryClick();
			testUtils1.test.log(Status.INFO, "Click on Add Industry");
			String actualText = indAddMEthod.getFirstIndustryText();
			System.out.println(actualText);
			testUtils1.test.log(Status.INFO, "Gettext of the First industry which we will add");
			indAddMEthod.SelectIndustryfromList();
			testUtils1.test.log(Status.INFO, "Select First Industry");
			indAddMEthod.ClickonSaveButtonIndustry();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(4000);
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			String ExpectedText = indAddMEthod.getLastIndustryText();
			System.out.println(ExpectedText);
			Thread.sleep(2000);
			try {
				// Assert that the actual text matches the expected text
				Assert.assertEquals(actualText, ExpectedText);

				// If the assertion passes, log success and update the extent report
				testUtils1.passTestCase("User is able to add Industry.");
			} catch (AssertionError e) {
				// If the assertion fails, log failure and update the extent report
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to add Industry.");
			}

			//////// End Add Industry////////

			////// Add Awards///////
			testUtils1.testCaseCreate("TC 7  F: Add Awards and Certifications ");
			Thread.sleep(3000);
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			addAwardsMethod.ClickonAddinAwards();
			testUtils1.test.log(Status.INFO, "Click on Add button in Awards");
			addAwardsMethod.EnterAwardTitle();
			testUtils1.test.log(Status.INFO, "Enter Award Title");
			Thread.sleep(2000);
			String ActualTitleAwards1 = addAwardsMethod.getFirstAwardTitleText();
			System.out.println(ActualTitleAwards1);
			testUtils1.test.log(Status.INFO, "Gettext of First Award Titless");
			addAwardsMethod.EnterCertifiedByName();
			testUtils1.test.log(Status.INFO, "Enter Certified by name");
			addAwardsMethod.ClickonSelectDate();
			testUtils1.test.log(Status.INFO, "Click on Select Date");
			addAwardsMethod.SelectDate();
			testUtils1.test.log(Status.INFO, "Select Date");
			addAwardsMethod.EnterDescrtiptionAwards();
			testUtils1.test.log(Status.INFO, "Enter Description for Awards");
			Thread.sleep(2000);
			addAwardsMethod.ClickonSaveButton();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(4000);
			String ExpectedTitleAwards = addAwardsMethod.getLastAwardText();
			System.out.println(ExpectedTitleAwards);
			Thread.sleep(2000);
			int endIndex = ExpectedTitleAwards.indexOf(" | "); // Find the index of " | "
			String ExpectedSubstringTitleAwards = ExpectedTitleAwards.substring(0, endIndex).trim(); //
//			String ExpectedSubstringTitleAwards=ExpectedTitleAwards.substring(0, ExpectedTitleAwards.indexOf('|'));
			System.out.println(ExpectedSubstringTitleAwards);
//			try {
			// Assert that the actual text matches the expected text
			if (ActualTitleAwards1.equalsIgnoreCase(ExpectedSubstringTitleAwards)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to add Awards and Certifiactions.");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to add Awards and Certifiactions.");
			}
			////// End Awards and Certifications///////

			/////// Add Publications//////////
			testUtils1.testCaseCreate("TC 7  G: Add Publications ");
			Thread.sleep(3000);
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			pubAddMethod.ClickonPlusIconInPublications();
			testUtils1.test.log(Status.INFO, "Click on plus icon in Publications");
			pubAddMethod.EnterTitlePublication();
			testUtils1.test.log(Status.INFO, "Enter Title ");
			String ExpectedTitlePub = pubAddMethod.getFirstPublicationTitleText();
			Thread.sleep(1000);
			System.out.println(ExpectedTitlePub);
			pubAddMethod.EnterPublishedbyPublication();
			testUtils1.test.log(Status.INFO, "Enter Published By");
			pubAddMethod.EnterCoAutherPublication();
			testUtils1.test.log(Status.INFO, "Enter Co Auther");
			pubAddMethod.ClickonSelectDate();
			testUtils1.test.log(Status.INFO, "Click on Select Date");
			pubAddMethod.SelectDate();
			testUtils1.test.log(Status.INFO, "Select Date From calender");
			pubAddMethod.EnterDescrtiptionPublications();
			testUtils1.test.log(Status.INFO, "Enter Descripton for Publications");
			pubAddMethod.ClickonSaveButton();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(3000);
			String ActualTitlePub = pubAddMethod.getLastPublicationsText();
			Thread.sleep(1000);
			System.out.println(ActualTitlePub);
			if (ActualTitlePub.equalsIgnoreCase(ExpectedTitlePub)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Add Publications.");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Add Publications.");
			}
			////// End Publications///////

			/////// Add Languages//////////
			testUtils1.testCaseCreate("TC 7  H: Add Languages ");
			Thread.sleep(3000);
			langAddMethod.ClickonLAnguageEditButton();
			testUtils1.test.log(Status.INFO, "Click on Language Add Button");
			langAddMethod.ClickonSelectLanguageDropdown();
			testUtils1.test.log(Status.INFO, "Click on Select Language Dropdown");
			Thread.sleep(3000);
			langAddMethod.SelectFirstLanguage();
			testUtils1.test.log(Status.INFO, "Select First Language");
			langAddMethod.SelectAllCheckBox();
			testUtils1.test.log(Status.INFO, "Select All CheckBox");
			langAddMethod.ClickOnLanguageSaveButton();
			testUtils1.test.log(Status.INFO, "Click on Language Save Button");
			Thread.sleep(3000);
			String ExpectedLanguage = langAddMethod.getFirstLanguaeText();
			System.out.println(ExpectedLanguage);
			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			langAddMethod.ClickonSubmitLanguageButton();
			testUtils1.test.log(Status.INFO, "Click on Submit Button");
			Thread.sleep(4000);

			absCom.swipDownByCoordinates(740, 2072, 1332);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);

			String ActualLanguage = langAddMethod.getLastLanguageAddedText();
			System.out.println(ActualLanguage);
			if (ActualLanguage.equals(ExpectedLanguage)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Add Languages.");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Add Languages.");
			}
/////////////////////////End Languages//////////////////////////////////
			/////////// Add Additional Information///////////////////

			testUtils1.testCaseCreate("TC 7  I: Add Additional Infromation ");
			Thread.sleep(3000);
			addAdditonInfoMethod.ClickonEditAdditionalInfo();
			testUtils1.test.log(Status.INFO, "Click on Edit Button for Additional Information");
			addAdditonInfoMethod.EnterEmailid();
			testUtils1.test.log(Status.INFO, "Enter Email id");
			addAdditonInfoMethod.SelectCurrency();
			testUtils1.test.log(Status.INFO, "Select Currency as INR");
			addAdditonInfoMethod.ClickonIndustryDropdown();
			testUtils1.test.log(Status.INFO, "Click on Industry Dropdown");
			addAdditonInfoMethod.SelectIndustryFromDD();
			testUtils1.test.log(Status.INFO, "Select Industry From Dropdown");
			addAdditonInfoMethod.ClickonConfirmButton();
			testUtils1.test.log(Status.INFO, "Click on Confirm Button");
			addAdditonInfoMethod.ClickonLocationDropdown();
			testUtils1.test.log(Status.INFO, "Click on Location Dropdown");
			addAdditonInfoMethod.selectLocationfromDD();
			testUtils1.test.log(Status.INFO, "Select Location From Dropdown");
			addAdditonInfoMethod.ClickonConfirmButton();
			testUtils1.test.log(Status.INFO, "Click on Confirm Button");
			addAdditonInfoMethod.ClickonSaveButton();
			testUtils1.test.log(Status.INFO, "Click on Save Button");
			Thread.sleep(2000);
			try {
				if (addAdditonInfoMethod.VerifyAdditionalInformationisAddedorNOT()) {
					testUtils1.passTestCase("User is able to add Additional Information");
				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to add Additional Information");
			}

		} catch (Exception e) {// final catch block
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Edit Profile , TestCase Failed");
		}
	}

	@Test(priority = 8, enabled = true)
	public void CreateNewEvent() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 8 : Create New Event ");
		Thread.sleep(3000);
		try {
			newEventCreateMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			newEventCreateMethod.ClickonEventsButton();
			testUtils1.test.log(Status.INFO, "Click on Events Button");
			newEventCreateMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			newEventCreateMethod.ClickonAddImage();
			testUtils1.test.log(Status.INFO, "Click pon Add Image");
			newEventCreateMethod.SelectImage();
			testUtils1.test.log(Status.INFO, "Select Image to Upload");
			String EventTitle=excel.getCellData(1, 26);
			newEventCreateMethod.EnterEventTitle(EventTitle);
			testUtils1.test.log(Status.INFO, "Enter Event Title");
			newEventCreateMethod.ClickonSelectIndustry();
			testUtils1.test.log(Status.INFO, "Click on Select Industry");
			newEventCreateMethod.SelectIndustryFromDD();
			testUtils1.test.log(Status.INFO, "Select Industry From DropDown");
			newEventCreateMethod.ClickonConfirmButton();
			testUtils1.test.log(Status.INFO, "Click on Confirm Button");
			newEventCreateMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Select Category");
			// swipe down method add.
			absCom.swipDownByCoordinates(542, 2135, 1114);
			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			newEventCreateMethod.SelectCategoryFromDD();
			testUtils1.test.log(Status.INFO, "Select Category from Dropdown");
			newEventCreateMethod.ClickonConfirmButton();
			testUtils1.test.log(Status.INFO, "Click on Confirm Button");
			Thread.sleep(2000);
			String EventDetails=excel.getCellData(1, 27);
			newEventCreateMethod.EnterEventDetails(EventDetails);
			testUtils1.test.log(Status.INFO, "Enter Event Details");
			newEventCreateMethod.ClickonCreateMyEvent();
			testUtils1.test.log(Status.INFO, "Click on Create My Event");
			Thread.sleep(4000);
			newEventCreateMethod.ClickonHostType();
			testUtils1.test.log(Status.INFO, "Click on Host Type");
			newEventCreateMethod.SelectHostType();
			testUtils1.test.log(Status.INFO, "Select Host Type");
			newEventCreateMethod.ClickonOfflineRadioButton();
			testUtils1.test.log(Status.INFO, "Click on Offline Radio Button");
			String EventVenue=excel.getCellData(1, 28);
			newEventCreateMethod.EnterLocation(EventVenue);
			testUtils1.test.log(Status.INFO, "Enter Event Location");
			newEventCreateMethod.SelectCurrency();
			testUtils1.test.log(Status.INFO, "Select Currency");
			newEventCreateMethod.EnterAmount();
			testUtils1.test.log(Status.INFO, "Enter Event Amount");
			newEventCreateMethod.ClickonSelectFirstDate();
			testUtils1.test.log(Status.INFO, "Click on Select First Date");
			newEventCreateMethod.SelectDate();
			testUtils1.test.log(Status.INFO, "Select Event Start Date");
			newEventCreateMethod.ClickonStartTime();
			testUtils1.test.log(Status.INFO, "Click on Start Time");
			newEventCreateMethod.SelectStartTime();
			testUtils1.test.log(Status.INFO, "Select Event Start Time");
			newEventCreateMethod.ClickonEndDate();
			testUtils1.test.log(Status.INFO, "Click on End date");
			newEventCreateMethod.SelectEndDate();
			testUtils1.test.log(Status.INFO, "Select Event End Date");
			newEventCreateMethod.ClickonEndTime();
			testUtils1.test.log(Status.INFO, "Click on End Time");
			newEventCreateMethod.SelectEndTime();
			testUtils1.test.log(Status.INFO, "Select Event End Time");
			newEventCreateMethod.EnterEmail();
			testUtils1.test.log(Status.INFO, "Enter Email id ");
			newEventCreateMethod.ClickonNextButton();
			testUtils1.test.log(Status.INFO, "Click on Next Button");
			Thread.sleep(3000);
//		newEventCreateMethod.SelectCheckBoxOfConnection();
//		testUtils1.test.log(Status.INFO, "Select First Connection Checkbox");
			newEventCreateMethod.ClickonPublishEvent();
			testUtils1.test.log(Status.INFO, "Click on Publish Event");
			Thread.sleep(2000);

			newJobCreateMethod.TouchClickonMyJob();
			testUtils1.test.log(Status.INFO, "Click on My Jobs Using Touch Click");

//			absCom.swipDownByCoordinates(542, 2135, 1114);
//			testUtils1.test.log(Status.INFO, "Swipe down");
			Thread.sleep(3000);
			try {
				if (newEventCreateMethod.VerifyEventCreatedorNOT()) {
					testUtils1.passTestCase("User is  able to Create Event");

				}

			} catch (Exception e) {
				e.printStackTrace();
				testUtils1.failTestCase("User is not able to Create Event , TestCase Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Event , TestCase Failed");
		}

	}

	@Test(priority = 9, enabled = true)
	public void CreateClub() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 9 : Create New Club ");
		Thread.sleep(3000);

		newClubCreateMethod.ClickonMoreButton();
		testUtils1.test.log(Status.INFO, "Click on More Button");
		newClubCreateMethod.ClickonClubButton();
		testUtils1.test.log(Status.INFO, "Click on Club Button");
		newClubCreateMethod.ClickonPlusIcon();
		testUtils1.test.log(Status.INFO, "Click on Plus Icon");
		newClubCreateMethod.ClickonAddImage();
		testUtils1.test.log(Status.INFO, "Click on Add Image");
		newClubCreateMethod.SelectImage();
		testUtils1.test.log(Status.INFO, "Select Image");
		String ClubTitle=excel.getCellData(1, 30);
		newClubCreateMethod.EnterClubTitle(ClubTitle);
		testUtils1.test.log(Status.INFO, "Enter Club Title");
		String ExpectedClubTitle = newClubCreateMethod.ExpectedGettexTitle();
		System.out.println(ExpectedClubTitle);
		String ClubDetails=excel.getCellData(1, 31);
		newClubCreateMethod.EnterClubDetails(ClubDetails);
		testUtils1.test.log(Status.INFO, "Enter Club Details");
//		add scroll down 
		Thread.sleep(2000);
		absCom.swipDownByCoordinates(521, 2122, 664);
		
		newClubCreateMethod.SelectCurrency();
		testUtils1.test.log(Status.INFO, "Select Currency");
		newClubCreateMethod.EnterAmount();
		testUtils1.test.log(Status.INFO, "Enter Amount");
		newClubCreateMethod.ClickonSelectIndustry();
		absCom.swipDownByCoordinates(740, 2072, 1332);
		testUtils1.test.log(Status.INFO, "Swipe down");
		testUtils1.test.log(Status.INFO, "Click on Select Industry");
		newClubCreateMethod.SelectIndustryFromDD();
		testUtils1.test.log(Status.INFO, "Select Industry From DropDown");
		newClubCreateMethod.ClickonConfirmButton();
		testUtils1.test.log(Status.INFO, "Click on Confirm Button");
		newClubCreateMethod.ClickonSelectCategory();
		testUtils1.test.log(Status.INFO, "Click on Select Category");
		newClubCreateMethod.SelectCategoryFromDD();
		testUtils1.test.log(Status.INFO, "Select Category from Dropdown");
		newClubCreateMethod.ClickonConfirmButton();
		testUtils1.test.log(Status.INFO, "Click on Confirm Button");
		newClubCreateMethod.ClickonCreateMyClub();
		testUtils1.test.log(Status.INFO, "Click on Create My Club");
//		newClubCreateMethod.SelectFirstConnection();
//		testUtils1.test.log(Status.INFO, "Select First Connection Checkbox");
		Thread.sleep(3000);
		newClubCreateMethod.ClickonPublishClub();
		testUtils1.test.log(Status.INFO, "Click on Publish Club");
		newJobCreateMethod.TouchClickonMyJob();
		testUtils1.test.log(Status.INFO, "Click on My Jobs Using Touch Click");
//		absCom.swipDownByCoordinates(740, 2072, 1332);
//		testUtils1.test.log(Status.INFO, "Swipe down");
		Thread.sleep(5000);
		String ActualClubTitle = newClubCreateMethod.ActualGettexTitle();
		System.out.println(ActualClubTitle);
		if (ActualClubTitle.equals(ExpectedClubTitle)) {
			System.out.println("inside if block");
			testUtils1.passTestCase("User is able to Create New Club.");
			System.out.println("after ss method");
		} else {
			testUtils1.failTestCase("User is not able to Create New Club.");
		}

	}

	@Test(priority = 10, enabled = false)
	public void CreateNewJob() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 10 : Create New Job ");
		Thread.sleep(3000);
		try {
			newJobCreateMethod.ClickonJobsButton();
			testUtils1.test.log(Status.INFO, "Click on Jobs Button");
			newJobCreateMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			Thread.sleep(3000);
			String jobTitle = excel.getCellData(1, 2);
			newJobCreateMethod.enterJobTitle(jobTitle);
			testUtils1.test.log(Status.INFO, "Enter Job Title");
			String ExpectedJobTitle = newJobCreateMethod.ExpectedGettextJOBTitle();
			System.out.println(ExpectedJobTitle);
			String JobCompany = excel.getCellData(1, 3);
			newJobCreateMethod.EnterCompanyName(JobCompany);
			testUtils1.test.log(Status.INFO, "Enter Company Name");
			newJobCreateMethod.ClickonSelectIndustry();
			testUtils1.test.log(Status.INFO, "Click on Select Industry");
			newJobCreateMethod.SelectIndustryFromDD();
			testUtils1.test.log(Status.INFO, "Select Industry from Dropdown");
			newJobCreateMethod.ClickonConfirmButton();
			testUtils1.test.log(Status.INFO, "Click on Confirm Button");
			newJobCreateMethod.ClickonSelectJobType();
			testUtils1.test.log(Status.INFO, "Click on Select Job Type");
			newJobCreateMethod.SelectJobTypeFromDropdown();
			testUtils1.test.log(Status.INFO, "Select JobType from Dropdown");
			newJobCreateMethod.ClickonWorkplace();
			testUtils1.test.log(Status.INFO, "Click on Workplace");
			newJobCreateMethod.SelectWorkplaceFromDropdown();
			testUtils1.test.log(Status.INFO, "Select Workplace from Dropdown");
			newJobCreateMethod.EnterJobSkills();
			testUtils1.test.log(Status.INFO, "Enter Job Skills");
			Thread.sleep(4000);
			newJobCreateMethod.EnterLocation();
			testUtils1.test.log(Status.INFO, "Enter Location");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(626, 1370, 235);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			///// Add Scroll Down Method////////
			newJobCreateMethod.ClickonContinueButton();
			testUtils1.test.log(Status.INFO, "Click on Continue Button");
			newJobCreateMethod.SelectQualificationfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Qualification from dropdown");
			newJobCreateMethod.ClickonMinExp();
			testUtils1.test.log(Status.INFO, "Click on Min Exp");
			newJobCreateMethod.SelectMinExp();
			testUtils1.test.log(Status.INFO, "Select Min Exp from Dropdown");
			newJobCreateMethod.ClickonMaxExp();
			testUtils1.test.log(Status.INFO, "Click on Max Exp");
			newJobCreateMethod.SelectMaxExp();
			testUtils1.test.log(Status.INFO, "Select Max Exp from Dropdown");
			newJobCreateMethod.SelectCurrency();
			testUtils1.test.log(Status.INFO, "Select Currency from Dropdown");
			newJobCreateMethod.ClickonSalary();
			testUtils1.test.log(Status.INFO, "Click on Min Salary");
			newJobCreateMethod.SelectMinSalary();
			testUtils1.test.log(Status.INFO, "Select Min Salary from Dropdown");
			newJobCreateMethod.ClickonMAxSalary();
			testUtils1.test.log(Status.INFO, "Click on  Max Salary");
			newJobCreateMethod.SelectMaxSalary();
			testUtils1.test.log(Status.INFO, "Select Max Salary from Dropdown");
			newJobCreateMethod.ClickonCompanyRadioButton();
			testUtils1.test.log(Status.INFO, "Click on Company Radio Button");
			String JobDesc = excel.getCellData(1, 4);
			newJobCreateMethod.EnterJD(JobDesc);
			testUtils1.test.log(Status.INFO, "Enter JD");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(626, 1370, 235);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			newJobCreateMethod.ClickonContinueButtoninJOb();
			testUtils1.test.log(Status.INFO, "Click on Continue Job Button");
			Thread.sleep(3000);
//			newJobCreateMethod.TouchClickonMyJob();
//			testUtils1.test.log(Status.INFO, "Click on My Jobs Using Touch Click");
//			newJobCreateMethod.ClickonSavedTab();
//			testUtils1.test.log(Status.INFO,
//					"Click on Saved tab , Currently it is showing in saved tab instead of Hiring");
//			Thread.sleep(3000);
			String ActualJobTitle = newJobCreateMethod.ActualGettextJOBTitle();
			System.out.println(ActualJobTitle);
			if (ActualJobTitle.equals(ExpectedJobTitle)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create New Job.");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create New Job.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create New Job.");
		}
	}

	@Test(priority = 11, enabled = false)
	public void ApplyJob() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 11 : Apply Job ");
		Thread.sleep(3000);
		try {
			newJobApplyMethod.ClickonJobsButton();
			testUtils1.test.log(Status.INFO, "Click on Jobs Button");
			Thread.sleep(2000);
			newJobApplyMethod.ClickonSecondJob();
			testUtils1.test.log(Status.INFO, "Click on Second job");
			Thread.sleep(4000);
			String ExpectedJobGettext = newJobApplyMethod.getFirstAppliedJobText();
			System.out.println(ExpectedJobGettext);
			newJobApplyMethod.ClickonApplyJob();
			testUtils1.test.log(Status.INFO, "Click on Apply Job");
//			newJobApplyMethod.EnterEmailid();
//			testUtils1.test.log(Status.INFO, "Enter Email id ");
			newJobApplyMethod.SelectSalaryFromDD();
			testUtils1.test.log(Status.INFO, "Select Salary From Dropdown");
			newJobApplyMethod.ClickonSelectIndustry();
			testUtils1.test.log(Status.INFO, "Click on Select Industry");
			newJobApplyMethod.SelectIndustryFromDropdown();
			testUtils1.test.log(Status.INFO, "Select Industry From Dropdown");
			newJobApplyMethod.ClickonLocation();
			testUtils1.test.log(Status.INFO, "Click on Location");
			newJobApplyMethod.SelectLocationFromDropdown();
			testUtils1.test.log(Status.INFO, "Select Location From Dropdown");
			newJobApplyMethod.ClickonopenforRelationRadioButton();
			testUtils1.test.log(Status.INFO, "Click on Open for Relocation Radion Button");
			newJobApplyMethod.ClickonservingNoticePeriodRadioButton();
			testUtils1.test.log(Status.INFO, "Click on Serving notice Period Radio Button");
			newJobApplyMethod.SElectNoOfDays();
			testUtils1.test.log(Status.INFO, "Select Number of Days");
			newJobApplyMethod.AttachResume();
			testUtils1.test.log(Status.INFO, "Attach Resume");
			Thread.sleep(3000);
			newJobApplyMethod.ClickonSubmitButton();
			testUtils1.test.log(Status.INFO, "Click on Submit Button");
			Thread.sleep(3000);
			String ActualJobGettext = newJobApplyMethod.getLastappliedJObText();
			System.out.println(ActualJobGettext);

			if (ActualJobGettext.equals(ExpectedJobGettext)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Apply for new Job");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Apply for a Job");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Apply for a Job");
		}

	}

	@Test(priority = 12, enabled = false)
	public void CreatePostinCompany() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 12 : Create Post in Company  ");
		Thread.sleep(3000);
		try {
			companyCreatePostMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			companyCreatePostMethod.ClickonCompanyButton();
			testUtils1.test.log(Status.INFO, "Click on Company button");
//			absCom.swipDownByCoordinates(576, 1996, 542);
//			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyCreatePostMethod.ClickonCompanyFromList();
			testUtils1.test.log(Status.INFO, "Click on Company from list");
			companyCreatePostMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			companyCreatePostMethod.ClickonCreatePost();
			testUtils1.test.log(Status.INFO, "Click on Create Post");
			companyCreatePostMethod.EnterTextForPOst();
			testUtils1.test.log(Status.INFO, "Enter Text ");
			String ExpectedPostText = companyCreatePostMethod.GetExpectedTitlePost();
			System.out.println(ExpectedPostText);
			companyCreatePostMethod.ClickonPhotosIcon();
			testUtils1.test.log(Status.INFO, "Click on Photos icon");
			Thread.sleep(3000);
//			createpostMethod.EnterBtn();
//			companyCreatePostMethod.ClickonAllowButton();
//			testUtils1.test.log(Status.INFO, "Click on Allow");
			companyCreatePostMethod.SelectImage();
			testUtils1.test.log(Status.INFO, "Select Image");
			Thread.sleep(3000);
			companyCreatePostMethod.ClickonAddYourPost();
			testUtils1.test.log(Status.INFO, "Click on Add Your Post");
			companyCreatePostMethod.ClickonPublishNow();
			testUtils1.test.log(Status.INFO, "Click on Publish Now");
			Thread.sleep(3000);
//			companyCreatePostMethod.ClickonBackIcon();
//			testUtils1.test.log(Status.INFO, "Click on Back Button");

			String ActualPostText = companyCreatePostMethod.GetActualTitlePost();
			System.out.println(ActualPostText);

			if (ActualPostText.equals(ExpectedPostText)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create Post in Company");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create Post in Company");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Post in Company");
		}
	}

	@Test(priority = 13, enabled = false)
	public void ComposeAnArticleinCompany() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 13 : Compose an Article in Company  ");
		Thread.sleep(3000);
		try {

			companyArticleMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			companyArticleMethod.ClickonCompanyButton();
			testUtils1.test.log(Status.INFO, "Click on Company button");
			absCom.swipDownByCoordinates(576, 1996, 542);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyArticleMethod.ClickonCompanyFromList();
			testUtils1.test.log(Status.INFO, "Click on Company from list");
			companyArticleMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			companyArticleMethod.ClickonComposeArticle();
			testUtils1.test.log(Status.INFO, "Click on Compose Article");
			companyArticleMethod.ClickonImage();
			testUtils1.test.log(Status.INFO, "Click on Image");
			companyArticleMethod.SelectImage();
			testUtils1.test.log(Status.INFO, "Select Image");
			companyArticleMethod.EnterArticleTitle();
			testUtils1.test.log(Status.INFO, "Enter Article");
			String ExpectedArticleTitle = companyArticleMethod.GettextOfExpArticle();
			System.out.println(ExpectedArticleTitle);
			companyArticleMethod.EnterDescription();
			testUtils1.test.log(Status.INFO, "Enter Description of Article");
			companyArticleMethod.ClickonPublishArticle();
			testUtils1.test.log(Status.INFO, "Click on Publish Article");
			Thread.sleep(7000);
			companyArticleMethod.ClickonBackIcon();
			testUtils1.test.log(Status.INFO, "Click on back button");
			String ActualArticleTitle = companyArticleMethod.gettextOfActualArticleTitle();
			System.out.println(ActualArticleTitle);

			if (ActualArticleTitle.equals(ExpectedArticleTitle)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Compose an Article in Company");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Compose an Article in Company");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Compose an Article in Company");
		}
	}

	@Test(priority = 14, enabled = false)
	public void CreatePollinCompany() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 14 : Create Poll in Company  ");
		Thread.sleep(3000);
		try {

			companyCreatePollMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			companyCreatePollMethod.ClickonCompanyButton();
			testUtils1.test.log(Status.INFO, "Click on Company button");
			absCom.swipDownByCoordinates(576, 1996, 542);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyCreatePollMethod.ClickonCompanyFromList();
			testUtils1.test.log(Status.INFO, "Click on Company from list");

			companyCreatePollMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			companyCreatePollMethod.ClickonCreatePoll();
			testUtils1.test.log(Status.INFO, "Click on Create Poll");
			companyCreatePollMethod.ClickonOptionAddButton();
			testUtils1.test.log(Status.INFO, "Click on Add Option ");
			companyCreatePollMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Category");
			companyCreatePollMethod.SelectCategoryfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Category from dropdown");
			companyCreatePollMethod.EnterQuestion();
			testUtils1.test.log(Status.INFO, "Enter Question");
			Thread.sleep(2000);
			String ExpectedQuestion = companyCreatePollMethod.GetFirstTextofPoll();
			System.out.println(ExpectedQuestion);
			companyCreatePollMethod.EnterOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			companyCreatePollMethod.EnterOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			companyCreatePollMethod.EnterOption3();
			testUtils1.test.log(Status.INFO, "Enter Option 3");
			companyCreatePollMethod.EnterOption4();
			testUtils1.test.log(Status.INFO, "Enter Option 4");
			companyCreatePollMethod.ClickonPollEndDropDown();
			testUtils1.test.log(Status.INFO, "Click on Poll End Dropdown");
			companyCreatePollMethod.SelectPollEndDate();
			testUtils1.test.log(Status.INFO, "Select Poll End date");
			companyCreatePollMethod.ClickonPublishPollButton();
			testUtils1.test.log(Status.INFO, "Click on Publish Poll Button");
			Thread.sleep(3000);
			companyCreatePollMethod.ClickonBackIcon();
			testUtils1.test.log(Status.INFO, "Click on Back Button");
			Thread.sleep(3000);
			String ActualQuestion = companyCreatePollMethod.GetLastTextofPoll();
			System.out.println(ActualQuestion);

			if (ActualQuestion.equals(ExpectedQuestion)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create Poll in Company");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create Poll in Company");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Poll in Company");
		}
	}

	@Test(priority = 15, enabled = false)
	public void CreateSurveyinCompany() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 15 : Create Survey in Company  ");
		Thread.sleep(3000);
		try {
			companyCreateSurveyMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			companyCreateSurveyMethod.ClickonCompanyButton();
			testUtils1.test.log(Status.INFO, "Click on Company button");
			absCom.swipDownByCoordinates(576, 1996, 542);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyCreateSurveyMethod.ClickonCompanyFromList();
			testUtils1.test.log(Status.INFO, "Click on Company from list");

			companyCreateSurveyMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			companyCreateSurveyMethod.ClickonSurveybutton();
			testUtils1.test.log(Status.INFO, "Click on Create Your Survey");
			companyCreateSurveyMethod.EnterTitle();
			testUtils1.test.log(Status.INFO, "Enter Title");
			String ExpectedSurveyTitle = companyCreateSurveyMethod.GetFirstTextofSurvey();
			System.out.println(ExpectedSurveyTitle);
			companyCreateSurveyMethod.EnterDescriptionforSurvey();
			testUtils1.test.log(Status.INFO, "Enter Description");
			companyCreateSurveyMethod.ClickonSelectCategorySurvey();
			testUtils1.test.log(Status.INFO, "Click on Select Category dropdown");
			companyCreateSurveyMethod.SelectCategoryfromDropdownSurvey();
			testUtils1.test.log(Status.INFO, "Select Category from Dropdown");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(508, 2000, 546);
			testUtils1.test.log(Status.INFO, "Swip down by co ordinates");
			companyCreateSurveyMethod.ClickonFirstQuestionType();
			testUtils1.test.log(Status.INFO, "Click on First Question type");
			companyCreateSurveyMethod.ClickonMultipleChoiceOpt();
			testUtils1.test.log(Status.INFO, "Select First Question Type");
			companyCreateSurveyMethod.ClickonOptionAdd2Time();
			testUtils1.test.log(Status.INFO, "Click on Add question 2 times");
			companyCreateSurveyMethod.EnterQuestion();
			testUtils1.test.log(Status.INFO, "Enter Question 1");
			companyCreateSurveyMethod.EnterOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			companyCreateSurveyMethod.EnterOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			companyCreateSurveyMethod.EnterOption3();
			testUtils1.test.log(Status.INFO, "Enter Option 3");
			companyCreateSurveyMethod.EnterOption4();
			testUtils1.test.log(Status.INFO, "Enter Option 4");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(517, 2097, 576);
			companyCreateSurveyMethod.ClickonSecondQuestionType();
			testUtils1.test.log(Status.INFO, "Click on Second Question Type");
			companyCreateSurveyMethod.ClickonSelectOpt();
			testUtils1.test.log(Status.INFO, "Click on SELECT Option");
			companyCreateSurveyMethod.EnterSecondQuestion();
			testUtils1.test.log(Status.INFO, "Enter Second Question");
			companyCreateSurveyMethod.EnterSecondOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			companyCreateSurveyMethod.EnterSecondOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			Thread.sleep(2000);
//			absCom.SwipDown();
			absCom.swipDownByCoordinates(517, 2122, 454);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyCreateSurveyMethod.ClickonAddAnotherQuestion();
			testUtils1.test.log(Status.INFO, "Click on Add Another Question");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(521, 2122, 664);
//			absCom.SwipDown();
			testUtils1.test.log(Status.INFO, "Swipe down by Co Ordinates");
			companyCreateSurveyMethod.ClickonThirdQuestionType();
			testUtils1.test.log(Status.INFO, "Click on Third Question Type");
			companyCreateSurveyMethod.ClickonTextOption();
			testUtils1.test.log(Status.INFO, "Select Text From DropDown");
			companyCreateSurveyMethod.EnterThirdQuestion();
			testUtils1.test.log(Status.INFO, "Enter Third Question");
			companyCreateSurveyMethod.ClickonSurveyEndDropDown();
			testUtils1.test.log(Status.INFO, "Click on Survey End Dropdown");
			companyCreateSurveyMethod.ClickonDatetoEndSurvey();
			testUtils1.test.log(Status.INFO, "Select end Date From dropdown");
			companyCreateSurveyMethod.ClickonCreateYourSurveyfinal();
			testUtils1.test.log(Status.INFO, "Click on final Create Your Survey Button");
			Thread.sleep(5000);
			companyCreateSurveyMethod.ClickonBackIcon();
			testUtils1.test.log(Status.INFO, "Click on back button ");
			String ActualSurveyTitle = companyCreateSurveyMethod.GetLastTextofSurvey();
			System.out.println(ActualSurveyTitle);

			if (ActualSurveyTitle.equals(ExpectedSurveyTitle)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create Survey in Company");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create Survey in Company");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Survey in Company");
		}

	}

	@Test(priority = 16, enabled = false)
	public void PostAsQueryinCompany() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 16 : Post As Query in Company  ");
		Thread.sleep(3000);
		try {

			companyPostasqueryMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			companyPostasqueryMethod.ClickonCompanyButton();
			testUtils1.test.log(Status.INFO, "Click on Company button");
			absCom.swipDownByCoordinates(576, 1996, 542);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyPostasqueryMethod.ClickonCompanyFromList();
			testUtils1.test.log(Status.INFO, "Click on Company from list");

			companyPostasqueryMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			companyPostasqueryMethod.ClickonPostAsQuery();
			testUtils1.test.log(Status.INFO, "Click on Post as Query");
			companyPostasqueryMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Category");
			companyPostasqueryMethod.SelectCategoryfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Category from dropdown");
			companyPostasqueryMethod.EnterQuestion();
			testUtils1.test.log(Status.INFO, "Enter Question");
			String ExpectedQueryQuestion = companyPostasqueryMethod.GetFirstTextofQuery();
			System.out.println(ExpectedQueryQuestion);
			companyPostasqueryMethod.EnterDescription();
			testUtils1.test.log(Status.INFO, "Enter Description");
			companyPostasqueryMethod.ClickonPostYourQueryButton();
			testUtils1.test.log(Status.INFO, "Click on Post Your Query");
			Thread.sleep(5000);
			companyPostasqueryMethod.ClickonBackIcon();
			testUtils1.test.log(Status.INFO, "Click on back Button");
			Thread.sleep(5000);
			String ActualQueryQuestion = companyPostasqueryMethod.GetLastTextofQuery();
			System.out.println(ActualQueryQuestion);

			if (ActualQueryQuestion.equals(ExpectedQueryQuestion)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Post As Query in Company");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able Post As Query in Company");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Post As Query in Company");
		}
	}

	@Test(priority = 17, enabled = false)
	public void CreateJobinCompany() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 17 : Create JOb in Company  ");
		Thread.sleep(3000);
		try {

			companyCreateJobMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			companyCreateJobMethod.ClickonCompanyButton();
			testUtils1.test.log(Status.INFO, "Click on Company button");
			absCom.swipDownByCoordinates(576, 1996, 542);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			companyCreateJobMethod.ClickonCompanyFromList();
			testUtils1.test.log(Status.INFO, "Click on Company from list");

			companyCreateJobMethod.ClickonJobsbuttoninCompanyPage();
			;
			testUtils1.test.log(Status.INFO, "Click on Jobs buttin");
			Thread.sleep(2000);
			companyCreateJobMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			companyCreateJobMethod.EnterJobTitle();
			testUtils1.test.log(Status.INFO, "Enter Job Title");
			String ExpectedJobTitle = companyCreateJobMethod.ExpectedGettextJOBTitle();
			System.out.println(ExpectedJobTitle);
			companyCreateJobMethod.EnterCompanyName();
			testUtils1.test.log(Status.INFO, "Enter Company Name");
			companyCreateJobMethod.ClickonSelectIndustry();
			testUtils1.test.log(Status.INFO, "Click on Select Industry");
			companyCreateJobMethod.SelectIndustryFromDD();
			testUtils1.test.log(Status.INFO, "Select Industry from Dropdown");
			companyCreateJobMethod.ClickonConfirmButton();
			testUtils1.test.log(Status.INFO, "Click on Confirm Button");
			companyCreateJobMethod.ClickonSelectJobType();
			testUtils1.test.log(Status.INFO, "Click on Select Job Type");
			companyCreateJobMethod.SelectJobTypeFromDropdown();
			testUtils1.test.log(Status.INFO, "Select JobType from Dropdown");
			companyCreateJobMethod.ClickonWorkplace();
			testUtils1.test.log(Status.INFO, "Click on Workplace");
			companyCreateJobMethod.SelectWorkplaceFromDropdown();
			testUtils1.test.log(Status.INFO, "Select Workplace from Dropdown");
			companyCreateJobMethod.EnterJobSkills();
			testUtils1.test.log(Status.INFO, "Enter Job Skills");
			Thread.sleep(4000);
			companyCreateJobMethod.EnterLocation();
			testUtils1.test.log(Status.INFO, "Enter Location");
			companyCreateJobMethod.ClickonContinueButton();
			testUtils1.test.log(Status.INFO, "Click on Continue Button");
			companyCreateJobMethod.ClickonMinExp();
			testUtils1.test.log(Status.INFO, "Click on Min Exp");
			companyCreateJobMethod.SelectMinExp();
			testUtils1.test.log(Status.INFO, "Select Min Exp from Dropdown");
			companyCreateJobMethod.ClickonMaxExp();
			testUtils1.test.log(Status.INFO, "Click on Max Exp");
			companyCreateJobMethod.SelectMaxExp();
			testUtils1.test.log(Status.INFO, "Select Max Exp from Dropdown");
			companyCreateJobMethod.SelectCurrency();
			testUtils1.test.log(Status.INFO, "Select Currency from Dropdown");
			companyCreateJobMethod.ClickonSalary();
			testUtils1.test.log(Status.INFO, "Click on Min Salary");
			companyCreateJobMethod.SelectMinSalary();
			testUtils1.test.log(Status.INFO, "Select Min Salary from Dropdown");
			companyCreateJobMethod.ClickonMAxSalary();
			testUtils1.test.log(Status.INFO, "Click on  Max Salary");
			companyCreateJobMethod.SelectMaxSalary();
			testUtils1.test.log(Status.INFO, "Select Max Salary from Dropdown");
			companyCreateJobMethod.ClickonCompanyRadioButton();
			testUtils1.test.log(Status.INFO, "Click on Company Radio Button");
			companyCreateJobMethod.EnterJD();
			testUtils1.test.log(Status.INFO, "Enter JD");
			Thread.sleep(2000);
			companyCreateJobMethod.ClickonContinueButtoninJOb();
			testUtils1.test.log(Status.INFO, "Click on Continue Job Button");
			Thread.sleep(3000);
			companyCreateJobMethod.ClickonBackIcon();
			testUtils1.test.log(Status.INFO, "Click on Back Button");
//			companyCreateJobMethod.ClickonSavedTab();
//			testUtils1.test.log(Status.INFO,
//					"Click on Saved tab , Currently it is showing in saved tab instead of Hiring");
			Thread.sleep(3000);
			String ActualJobTitle = companyCreateJobMethod.ActualGettextJOBTitle();
			System.out.println(ActualJobTitle);

			if (ActualJobTitle.equals(ExpectedJobTitle)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create New Job in Company Page.");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create New Job in Company Page.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Job in Company Page");
		}

	}

	@Test(priority = 18, enabled = false)
	public void ChangeCandidateStaus() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 18 : Change candidate Status  ");
		Thread.sleep(3000);
		try {

			candstatusMethod.ClickonJobsButton();
			testUtils1.test.log(Status.INFO, "Click on Jobs Button");
			Thread.sleep(5000);
			candstatusMethod.TouchClickonMyJob();
			testUtils1.test.log(Status.INFO, "Click on My jobs icon");
			candstatusMethod.ClickonHiringTab();
			testUtils1.test.log(Status.INFO, "Click on Hiring tab");
			candstatusMethod.ClickonJob();
			testUtils1.test.log(Status.INFO, "Click on Job");
			Thread.sleep(3000);
			candstatusMethod.ClickonAppliedButton();
			testUtils1.test.log(Status.INFO, "Click on Applied Button");
			if (candstatusMethod.VerifyCandidateisDispalyedinAppliedTab()) {
				testUtils1.passTestCase("user is able to see Candidate in Applied Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate in Applied Tab");
			}
			// applied to shortlist///
			candstatusMethod.ClickonThreeDot();
			testUtils1.test.log(Status.INFO, "Click on Three Dot Applied");
			candstatusMethod.ClickonShortListButton();
			testUtils1.test.log(Status.INFO, "Click on Shortlist ");
			candstatusMethod.ClickShortListedTab();
			testUtils1.test.log(Status.INFO, "Click on Shortlist tab");

			if (candstatusMethod.VerifyCandidateisDispalyedinShortListedTab()) {
				testUtils1.passTestCase("user is able to see Candidate from applied to ShortList Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from applied to  ShortList Tab");
			}

			// shortlist to hold///
			candstatusMethod.ClickonThreeDotShortListed();
			testUtils1.test.log(Status.INFO, "Click on Three Dot in Shortlisted");
			candstatusMethod.ClickonHoldButton();
			testUtils1.test.log(Status.INFO, "Click on Hold");
			candstatusMethod.ClickonHoldTab();
			testUtils1.test.log(Status.INFO, "Click on Hold Tab");

			if (candstatusMethod.VerifyCandidateisDispalyedinHoldTab()) {
				testUtils1.passTestCase("user is able to see Candidate from Shortlist to  Hold Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from Shortlist to Hold Tab");
			}

			/// hold to reject///
			candstatusMethod.ClickonThreeDotHold();
			testUtils1.test.log(Status.INFO, "Click on Three Dot in Hold");
			candstatusMethod.ClickonRejectButton();
			testUtils1.test.log(Status.INFO, "Click on Reject Button");
			candstatusMethod.ClickonRejectedTab();
			testUtils1.test.log(Status.INFO, "Click on Rejected Tab");

			if (candstatusMethod.VerifyCandidateisDispalyedinRejectedTab()) {
				testUtils1.passTestCase("user is able to see Candidate from Hold to  Rejected Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from Hold to Rejected Tab");
			}

			/* rejected to shortlist */
			candstatusMethod.ClickonThreeDotRejected();
			testUtils1.test.log(Status.INFO, "Click on Rejected");
			candstatusMethod.ClickonShortListButton();
			testUtils1.test.log(Status.INFO, "click on Shortlist Button");
			candstatusMethod.ClickShortListedTab();
			testUtils1.test.log(Status.INFO, "Click on Shortlisted Tab");

			if (candstatusMethod.VerifyCandidateisDispalyedinShortListedTab()) {
				testUtils1.passTestCase("user is able to see Candidate from Rejected to Shortlist Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from Rejected to Shortlist Tab");
			}

			/// shortlist to Reject///
			candstatusMethod.ClickonThreeDotShortListed();
			testUtils1.test.log(Status.INFO, "Click on Three Dot Shortlist ");
			candstatusMethod.ClickonRejectButton();
			testUtils1.test.log(Status.INFO, "Click on Reject Button");
			candstatusMethod.ClickonRejectedTab();
			testUtils1.test.log(Status.INFO, "Click on Rejected Tab");

			if (candstatusMethod.VerifyCandidateisDispalyedinRejectedTab()) {
				testUtils1.passTestCase("user is able to see Candidate from Shortlist to Rejected Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from Shortlist to Rejected Tab");
			}

			/// rejected to hold////
			candstatusMethod.ClickonThreeDotRejected();
			testUtils1.test.log(Status.INFO, "Click on Rejected Three Dot");
			candstatusMethod.ClickonHoldButton();
			testUtils1.test.log(Status.INFO, "Click on Hold ");
			candstatusMethod.ClickonHoldTab();
			testUtils1.test.log(Status.INFO, "Click on Hold Tab");
			if (candstatusMethod.VerifyCandidateisDispalyedinHoldTab()) {
				testUtils1.passTestCase("user is able to see Candidate from Rejected to Hold  Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from Rejected to Hold Tab");
			}

			// hold to shortlist///
			candstatusMethod.ClickonThreeDotHold();
			testUtils1.test.log(Status.INFO, "Click on Three Dot Hold");
			candstatusMethod.ClickonShortListButton();
			testUtils1.test.log(Status.INFO, "Click on Shortlist Button");
			candstatusMethod.ClickShortListedTab();
			testUtils1.test.log(Status.INFO, "click on Shortlist Tab");

			if (candstatusMethod.VerifyCandidateisDispalyedinShortListedTab()) {
				testUtils1.passTestCase("user is able to see Candidate from Hold to Shortlist  Tab");
			} else {
				testUtils1.failTestCase("user is not able to see Candidate from Hold to Shortlist Tab");
			}

		} catch (Exception e) {
			e.printStackTrace();
//			testUtils1.failTestCase("user is not able to Change Candidate Status");

		}

	}

	@Test(priority = 19, enabled = false)
	public void ClubCreatePost() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 19 : Club Create Post  ");
		Thread.sleep(3000);
		try {
			clubCreatePostMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			clubCreatePostMethod.ClickonClubButton();
			testUtils1.test.log(Status.INFO, "Click on Club button");
			clubCreatePostMethod.ClickonMyClubButton();
			testUtils1.test.log(Status.INFO, "Click on My Club");
			clubCreatePostMethod.ClickonFirstClub();
			testUtils1.test.log(Status.INFO, "Click on First Club button");//
			clubCreatePostMethod.ClickonPostButton();
			testUtils1.test.log(Status.INFO, "Click on Post button");
			clubCreatePostMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			clubCreatePostMethod.ClickonCreatePost();
			testUtils1.test.log(Status.INFO, "Click on Create Post");
			Thread.sleep(4000);
			clubCreatePostMethod.EnterTextForPOst();
			testUtils1.test.log(Status.INFO, "Enter Text ");
			String ExpectedPostText = clubCreatePostMethod.GetExpectedTitlePost();
			System.out.println(ExpectedPostText);
			clubCreatePostMethod.ClickonPhotosIcon();
			testUtils1.test.log(Status.INFO, "Click on Photos icon");
			Thread.sleep(3000);
//			createpostMethod.EnterBtn();
//			clubCreatePostMethod.ClickonAllowButton();
//			testUtils1.test.log(Status.INFO, "Click on Allow");
			Thread.sleep(2000);
			clubCreatePostMethod.SelectImage();
			testUtils1.test.log(Status.INFO, "Select Image");
			Thread.sleep(3000);
			clubCreatePostMethod.ClickonAddYourPost();
			testUtils1.test.log(Status.INFO, "Click on Add Your Post");
			clubCreatePostMethod.ClickonPublishNow();
			testUtils1.test.log(Status.INFO, "Click on Publish Now");
			Thread.sleep(6000);

			String ActualPostText = clubCreatePostMethod.GetActualTitlePost();
			System.out.println(ActualPostText);

			if (ActualPostText.equals(ExpectedPostText)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create Post in Club");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create Post in Club");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Post in Club");
		}

	}

	@Test(priority = 20, enabled = false)
	public void ClubComposeAnArticle() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 20 : Club Compose an Article  ");
		Thread.sleep(3000);

		try {

			clubComposeArticleMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			clubComposeArticleMethod.ClickonClubButton();
			testUtils1.test.log(Status.INFO, "Click on Club button");
			clubComposeArticleMethod.ClickonMyClubButton();
			testUtils1.test.log(Status.INFO, "Click on My Club");
			clubComposeArticleMethod.ClickonFirstClub();
			testUtils1.test.log(Status.INFO, "Click on First Club button");//
			clubComposeArticleMethod.ClickonPostButton();
			testUtils1.test.log(Status.INFO, "Click on Post button");
			clubComposeArticleMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			clubComposeArticleMethod.ClickonComposeArticle();
			testUtils1.test.log(Status.INFO, "Click on Compose Article");
			Thread.sleep(4000);
			clubComposeArticleMethod.ClickonImage();
			testUtils1.test.log(Status.INFO, "Click on Image");
			clubComposeArticleMethod.SelectImage();
			testUtils1.test.log(Status.INFO, "Select Image");
			clubComposeArticleMethod.EnterArticleTitle();
			testUtils1.test.log(Status.INFO, "Enter Article");
			String ExpectedArticleTitle = clubComposeArticleMethod.GettextOfExpArticle();
			System.out.println(ExpectedArticleTitle);
			clubComposeArticleMethod.EnterDescription();
			testUtils1.test.log(Status.INFO, "Enter Description of Article");
			clubComposeArticleMethod.ClickonPublishArticle();
			testUtils1.test.log(Status.INFO, "Click on Publish Article");
			Thread.sleep(5000);
			String ActualArticleTitle = clubComposeArticleMethod.gettextOfActualArticleTitle();
			System.out.println(ActualArticleTitle);

			if (ActualArticleTitle.equals(ExpectedArticleTitle)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Compose an Article in Company");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Compose an Article in Company");
			}
		} catch (Exception e) {

			testUtils1.failTestCase("User is not able to Compose an Article in Company");
		}
	}

	@Test(priority = 21, enabled = false)
	public void CreatePollinClub() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 21 : Create Poll in Club  ");
		Thread.sleep(3000);
		try {

			clubCreatePollMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			clubCreatePollMethod.ClickonClubButton();
			testUtils1.test.log(Status.INFO, "Click on Club button");
			clubCreatePollMethod.ClickonMyClubButton();
			testUtils1.test.log(Status.INFO, "Click on My Club");
			clubCreatePollMethod.ClickonFirstClub();
			testUtils1.test.log(Status.INFO, "Click on First Club button");//
			clubCreatePollMethod.ClickonPostButton();
			testUtils1.test.log(Status.INFO, "Click on Post button");
			clubCreatePollMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			clubCreatePollMethod.ClickonCreatePoll();
			testUtils1.test.log(Status.INFO, "Click on Create Poll");
			clubCreatePollMethod.ClickonOptionAddButton();
			testUtils1.test.log(Status.INFO, "Click on Add Option ");
			clubCreatePollMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Category");
			clubCreatePollMethod.SelectCategoryfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Category from dropdown");
			clubCreatePollMethod.EnterQuestion();
			testUtils1.test.log(Status.INFO, "Enter Question");
			Thread.sleep(2000);
			String ExpectedQuestion = clubCreatePollMethod.GetFirstTextofPoll();
			System.out.println(ExpectedQuestion);
			clubCreatePollMethod.EnterOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			clubCreatePollMethod.EnterOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			clubCreatePollMethod.EnterOption3();
			testUtils1.test.log(Status.INFO, "Enter Option 3");
			clubCreatePollMethod.EnterOption4();
			testUtils1.test.log(Status.INFO, "Enter Option 4");
			clubCreatePollMethod.ClickonPollEndDropDown();
			testUtils1.test.log(Status.INFO, "Click on Poll End Dropdown");
			clubCreatePollMethod.SelectPollEndDate();
			testUtils1.test.log(Status.INFO, "Select Poll End date");
			clubCreatePollMethod.ClickonPublishPollButton();
			testUtils1.test.log(Status.INFO, "Click on Publish Poll Button");
			Thread.sleep(3000);
			Thread.sleep(3000);
			String ActualQuestion = clubCreatePollMethod.GetLastTextofPoll();
			System.out.println(ActualQuestion);

			if (ActualQuestion.equals(ExpectedQuestion)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create Poll in Club");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create Poll in Club");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Poll in Club");
		}
	}

	@Test(priority = 22, enabled = false)
	public void CreateASurvetinClub() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 22 : Create A Survey in Club  ");
		Thread.sleep(3000);
		try {
			clubCreateASurveyMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			clubCreateASurveyMethod.ClickonClubButton();
			testUtils1.test.log(Status.INFO, "Click on Club button");
			clubCreateASurveyMethod.ClickonMyClubButton();
			testUtils1.test.log(Status.INFO, "Click on My Club");
			clubCreateASurveyMethod.ClickonFirstClub();
			testUtils1.test.log(Status.INFO, "Click on First Club button");//
			clubCreateASurveyMethod.ClickonPostButton();
			testUtils1.test.log(Status.INFO, "Click on Post button");
			clubCreateASurveyMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");
			clubCreateASurveyMethod.ClickonSurveybutton();
			testUtils1.test.log(Status.INFO, "Click on Create Your Survey");
			clubCreateASurveyMethod.EnterTitle();
			testUtils1.test.log(Status.INFO, "Enter Title");
			String ExpectedSurveyTitle = clubCreateASurveyMethod.GetFirstTextofSurvey();
			System.out.println(ExpectedSurveyTitle);
			clubCreateASurveyMethod.EnterDescriptionforSurvey();
			testUtils1.test.log(Status.INFO, "Enter Description");
			clubCreateASurveyMethod.ClickonSelectCategorySurvey();
			testUtils1.test.log(Status.INFO, "Click on Select Category dropdown");
			clubCreateASurveyMethod.SelectCategoryfromDropdownSurvey();
			testUtils1.test.log(Status.INFO, "Select Category from Dropdown");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(508, 2000, 546);
			testUtils1.test.log(Status.INFO, "Swip down by co ordinates");
			clubCreateASurveyMethod.ClickonFirstQuestionType();
			testUtils1.test.log(Status.INFO, "Click on First Question type");
			clubCreateASurveyMethod.ClickonMultipleChoiceOpt();
			testUtils1.test.log(Status.INFO, "Select First Question Type");
			clubCreateASurveyMethod.ClickonOptionAdd2Time();
			testUtils1.test.log(Status.INFO, "Click on Add question 2 times");
			clubCreateASurveyMethod.EnterQuestion();
			testUtils1.test.log(Status.INFO, "Enter Question 1");
			clubCreateASurveyMethod.EnterOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			clubCreateASurveyMethod.EnterOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			clubCreateASurveyMethod.EnterOption3();
			testUtils1.test.log(Status.INFO, "Enter Option 3");
			clubCreateASurveyMethod.EnterOption4();
			testUtils1.test.log(Status.INFO, "Enter Option 4");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(517, 2097, 576);
			clubCreateASurveyMethod.ClickonSecondQuestionType();
			testUtils1.test.log(Status.INFO, "Click on Second Question Type");
			clubCreateASurveyMethod.ClickonSelectOpt();
			testUtils1.test.log(Status.INFO, "Click on SELECT Option");
			clubCreateASurveyMethod.EnterSecondQuestion();
			testUtils1.test.log(Status.INFO, "Enter Second Question");
			clubCreateASurveyMethod.EnterSecondOption1();
			testUtils1.test.log(Status.INFO, "Enter Option 1");
			clubCreateASurveyMethod.EnterSecondOption2();
			testUtils1.test.log(Status.INFO, "Enter Option 2");
			Thread.sleep(2000);
//		absCom.SwipDown();
			absCom.swipDownByCoordinates(517, 2122, 454);
			testUtils1.test.log(Status.INFO, "Swipe down By Co Ordinates");
			clubCreateASurveyMethod.ClickonAddAnotherQuestion();
			testUtils1.test.log(Status.INFO, "Click on Add Another Question");
			Thread.sleep(2000);
			absCom.swipDownByCoordinates(521, 2122, 664);
//		absCom.SwipDown();
			testUtils1.test.log(Status.INFO, "Swipe down by Co Ordinates");
			clubCreateASurveyMethod.ClickonThirdQuestionType();
			testUtils1.test.log(Status.INFO, "Click on Third Question Type");
			clubCreateASurveyMethod.ClickonTextOption();
			testUtils1.test.log(Status.INFO, "Select Text From DropDown");
			clubCreateASurveyMethod.EnterThirdQuestion();
			testUtils1.test.log(Status.INFO, "Enter Third Question");
			clubCreateASurveyMethod.ClickonSurveyEndDropDown();
			testUtils1.test.log(Status.INFO, "Click on Survey End Dropdown");
			clubCreateASurveyMethod.ClickonDatetoEndSurvey();
			testUtils1.test.log(Status.INFO, "Select end Date From dropdown");
			clubCreateASurveyMethod.ClickonCreateYourSurveyfinal();
			testUtils1.test.log(Status.INFO, "Click on final Create Your Survey Button");
			Thread.sleep(5000);
//			clubCreateASurveyMethod.ClickonBackIcon();
//			testUtils1.test.log(Status.INFO, "Click on back button ");
			String ActualSurveyTitle = clubCreateASurveyMethod.GetLastTextofSurvey();
			System.out.println(ActualSurveyTitle);

			if (ActualSurveyTitle.equals(ExpectedSurveyTitle)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Create Survey in Club");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able to Create Survey in Club");
			}

		} catch (Exception e) {
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Create Survey in Club");
		}

	}

	@Test(priority = 22, enabled = false)
	public void PostAsQueryinClub() throws InterruptedException, IOException {
		testUtils1.testCaseCreate("TC 22 : Post As Query in Club  ");
		Thread.sleep(3000);

		try {

			clubPostAsQueryMethod.ClickonMoreButton();
			testUtils1.test.log(Status.INFO, "Click on More Button");
			clubPostAsQueryMethod.ClickonClubButton();
			testUtils1.test.log(Status.INFO, "Click on Club button");
			clubPostAsQueryMethod.ClickonMyClubButton();
			testUtils1.test.log(Status.INFO, "Click on My Club");
			clubPostAsQueryMethod.ClickonFirstClub();
			testUtils1.test.log(Status.INFO, "Click on First Club button");//
			clubPostAsQueryMethod.ClickonPostButton();
			testUtils1.test.log(Status.INFO, "Click on Post button");
			clubPostAsQueryMethod.ClickonPlusIcon();
			testUtils1.test.log(Status.INFO, "Click on Plus Icon");

			clubPostAsQueryMethod.ClickonPostAsQuery();
			testUtils1.test.log(Status.INFO, "Click on Post as Query");
			clubPostAsQueryMethod.ClickonSelectCategory();
			testUtils1.test.log(Status.INFO, "Click on Category");
			clubPostAsQueryMethod.SelectCategoryfromDropdown();
			testUtils1.test.log(Status.INFO, "Select Category from dropdown");
			clubPostAsQueryMethod.EnterQuestion();
			testUtils1.test.log(Status.INFO, "Enter Question");
			String ExpectedQueryQuestion = clubPostAsQueryMethod.GetFirstTextofQuery();
			System.out.println(ExpectedQueryQuestion);
			clubPostAsQueryMethod.EnterDescription();
			testUtils1.test.log(Status.INFO, "Enter Description");
			clubPostAsQueryMethod.ClickonPostYourQueryButton();
			testUtils1.test.log(Status.INFO, "Click on Post Your Query");
			Thread.sleep(5000);
			Thread.sleep(5000);
			String ActualQueryQuestion = companyPostasqueryMethod.GetLastTextofQuery();
			System.out.println(ActualQueryQuestion);

			if (ActualQueryQuestion.equals(ExpectedQueryQuestion)) {
				System.out.println("inside if block");
				testUtils1.passTestCase("User is able to Post As Query in Club");
				System.out.println("after ss method");
			} else {
				testUtils1.failTestCase("User is not able Post As Query in Club");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			testUtils1.failTestCase("User is not able to Post As Query in Club");
		}

	}

	@AfterTest
	public void tearDown() throws IOException {
		if (excel != null) {
			excel.close();
		}
		testUtils1.ExtentFlush();
		driver.quit();

	}

}

//reference
//MobileNumberLogin loginwithmobile;
//CreatePost CreatePostmethod;
//ComposeArticle composemethod;
//CreatePoll pollMethod;
//CreateQuery querymethod;
//CreateClubMayur clubcreatemethod;
//CreateEvent eventcreatemethod;
//CreateJobMayur jobcreatemethod;
//SendJobConnection jobconnectionSendMethod;
//MyProfileUpdateFull profileUpdate;
//SaveJob jobSaveMethod;
//EditStatusFromOpenToInactiveApp opentoinactiveMethod;
//EditStatusFromInactiveToOpenApp inactivetoopenMethod;
//EditStatusFromOpenToClosedApp opentoclosedMethod;

//objects
// loginwithmobile = new MobileNumberLogin(driver);
//CreatePostmethod = new CreatePost(driver);
//composemethod = new ComposeArticle(driver);
//pollMethod = new CreatePoll(driver);
//querymethod = new CreateQuery(driver);
//clubcreatemethod = new CreateClubMayur(driver);
//eventcreatemethod = new CreateEvent(driver);
//jobcreatemethod = new CreateJobMayur(driver);
//jobconnectionSendMethod = new SendJobConnection(driver);
//profileUpdate = new MyProfileUpdateFull(driver);
//jobSaveMethod = new SaveJob(driver);
//opentoinactiveMethod = new EditStatusFromOpenToInactiveApp(driver);
//inactivetoopenMethod = new EditStatusFromInactiveToOpenApp(driver);
//opentoclosedMethod = new EditStatusFromOpenToClosedApp(driver);
