package MayurTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import AbstractComponents.AbstractComponent;
//import LinkCxO.Pages.ShareYourExperinece.createPoll;
//import LinkCxO2.O.Pages.ComposeArticle;
//import LinkCxO2.O.Pages.CreateClubMayur;
//import LinkCxO2.O.Pages.CreateEvent;
//import LinkCxO2.O.Pages.CreateJobMayur;
//import LinkCxO2.O.Pages.CreatePoll;
//import LinkCxO2.O.Pages.CreatePost;
//import LinkCxO2.O.Pages.CreateQuery;
//import LinkCxO2.O.Pages.EditStatusFromInactiveToOpenApp;
//import LinkCxO2.O.Pages.EditStatusFromOpenToClosedApp;
//import LinkCxO2.O.Pages.EditStatusFromOpenToInactiveApp;
////import LinkCxO2.O.Pages.LoginWithMobileNumber;
//import LinkCxO2.O.Pages.MobileNumberLogin;
//import LinkCxO2.O.Pages.MyProfileUpdateFull;
//import LinkCxO2.O.Pages.SendJobConnection;
//import LinkCxO2.O.Pages.SaveJob;

//import com.ishine.utils.TestUtils;

import LinkCxO2.O.Utils.TestUtilsLinkCxo;
import LinkCxO2.O.base.TestBaseLinkCxo;
import jdk.internal.org.jline.utils.Log;

public class SampleTesting extends TestBaseLinkCxo {
//
//	@Override
//	public void TestBase() throws IOException {
//		// TODO Auto-generated method stub
//		super.TestBase();
//		this.driver = driver;
//	}
//
////	   LoginWithMobileNumber loginmob;
//	//Create reference of the pages class
//	AbstractComponent absCom;
//	TestUtilsLinkCxo testUtils1;
//	MobileNumberLogin loginwithmobile;
//	CreatePost CreatePostmethod;
//	ComposeArticle composemethod;
//	CreatePoll pollMethod;
//	CreateQuery querymethod;
//	CreateClubMayur clubcreatemethod;
//	CreateEvent eventcreatemethod;
//	CreateJobMayur jobcreatemethod;
//	SendJobConnection jobconnectionSendMethod;
//	MyProfileUpdateFull profileUpdate;
//	SaveJob jobSaveMethod;
//	EditStatusFromOpenToInactiveApp opentoinactiveMethod;
//	EditStatusFromInactiveToOpenApp inactivetoopenMethod;
//	EditStatusFromOpenToClosedApp opentoclosedMethod;
//
//	@BeforeTest
//	public void SetUp() throws Exception {
//		LaunchApp();
//		testUtils1 = new TestUtilsLinkCxo(driver);
//		absCom = new AbstractComponent(driver);
//		loginwithmobile = new MobileNumberLogin(driver);
//		CreatePostmethod = new CreatePost(driver);
//		composemethod = new ComposeArticle(driver);
//		pollMethod = new CreatePoll(driver);
//		querymethod = new CreateQuery(driver);
//		clubcreatemethod = new CreateClubMayur(driver);
//		eventcreatemethod = new CreateEvent(driver);
//		jobcreatemethod = new CreateJobMayur(driver);
//		jobconnectionSendMethod = new SendJobConnection(driver);
//		profileUpdate = new MyProfileUpdateFull(driver);
//		jobSaveMethod = new SaveJob(driver);
//		opentoinactiveMethod = new EditStatusFromOpenToInactiveApp(driver);
//		inactivetoopenMethod = new EditStatusFromInactiveToOpenApp(driver);
//		opentoclosedMethod = new EditStatusFromOpenToClosedApp(driver);
//
//	}
//
//	@Test(priority = 1, enabled = true)
//	public void LoginInWithMobileNumber1() throws IOException, InterruptedException {
//		testUtils1.extentReport();
//		testUtils1.testCaseCreate("TC1 : Login With Mobile Number");
//		Thread.sleep(3000);
//		try {
//			if (loginwithmobile.LoginPageisDisplayed()) {
//				testUtils1.passTestCase("Login Page is displayed");
//			}
//		} catch (Exception e) {
//			testUtils1.failTestCase("Login Page is not displayed");
//		}
//		loginwithmobile.entermobno();
//		System.out.println("Enter Mobile number");
//
//		loginwithmobile.ClickonArrowButton();
//		System.out.println("Click on arrow button");
//		try {
//			if (loginwithmobile.ToVerifyOtpPage()) {
//				testUtils1.passTestCase("Otp page is displayed");
//			}
//		} catch (Exception e) {
//			testUtils1.failTestCase("Otp page is not displayed");
//		}
//		loginwithmobile.enterOtp1();
//		System.out.println("Enter Otp 1");
//		loginwithmobile.enterOtp2();
//		System.out.println("Enter Otp 2");
//		loginwithmobile.enterOtp3();
//		System.out.println("Enter Otp 3");
//		loginwithmobile.enterOtp4();
//		System.out.println("Enter Otp 4");
//		loginwithmobile.enterOtp5();
//		System.out.println("Enter Otp 5");
//		loginwithmobile.enterOtp6();
//		System.out.println("Enter Otp 6");
//		loginwithmobile.ClickonVerifyButton();
//		System.out.println("click on verify button");
//		try {
//			if (loginwithmobile.VerifyLoginSuccesfully()) {
//				testUtils1.passTestCase("To verify User is succusfully able to login");
//			}
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("To verify User is not able to login successfully");
//		}
//	}
//
//	@Test(priority = 2, enabled = false)
//	public void CreatePost() throws IOException, InterruptedException {
////		testUtils1.extentReport();
//		testUtils1.testCaseCreate("TC2 : Create Post ");
//
//		Thread.sleep(3000);
//		try {
//			CreatePostmethod.ClickOnPlusIcon();
//			Thread.sleep(3000);
//			CreatePostmethod.ClickonCreatePost();
//			Thread.sleep(3000);
//			CreatePostmethod.enterDescription();
//			CreatePostmethod.ClickonPhoto();
//			CreatePostmethod.ClickonGallery();
//			CreatePostmethod.ClickOnDownLoad();
//			Thread.sleep(3000);
//			CreatePostmethod.SelectImagetoupload();
//			Thread.sleep(3000);
//			CreatePostmethod.CLickonPostBtn();
//			try {
//				if (CreatePostmethod.Verifypost()) {
//					testUtils1.passTestCase("To verify User is able to create new post");
//				}
//			} catch (Exception e) {
//				testUtils1.failTestCase("To verify User is not able to create new post");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(priority = 3, enabled = false)
//	public void ComposeAnArticle() throws InterruptedException, IOException {
//		testUtils1.testCaseCreate("TC3 : Compose An Article");
//
//		Thread.sleep(3000);
//		composemethod.ClickOnPlusIcon();
//		composemethod.ClickonComposeArticle();
//		composemethod.ClickonCameraIcon();
//		composemethod.ClickonGallery();
//		composemethod.ClickOnDownLoad();
//		Thread.sleep(3000);
//		composemethod.SelectImagetoupload();
//		Thread.sleep(3000);
//		composemethod.enterHeadline();
//		composemethod.enterDescriptionforarticle();
//		composemethod.ClickonPublishButton();
//		Thread.sleep(3000);
//		try {
//			if (composemethod.Verifyarticlepostedornot()) {
//				testUtils1.passTestCase("User is able to compose an article");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			testUtils1.failTestCase("User is not able to compse an article");
//		}
//	}
//
//	@Test(priority = 4, enabled = false)
//	public void CreateAPoll() throws InterruptedException {
//		testUtils1.testCaseCreate("TC4 : Create a Poll");
//
//		Thread.sleep(3000);
//
//		try {
//
//			pollMethod.ClickOnPlusIcon();
//			pollMethod.ClickonCreateAPoll();
//			pollMethod.EnterTitle();
//			pollMethod.enterAllOptions();
//			Thread.sleep(3000);
//			pollMethod.ClickonSelectDayDropdown();
//			pollMethod.SelectDayFromDropDown();
//			pollMethod.ClickonPostBtnPoll();
//
//			try {
//				if (pollMethod.ToVerifyPollCreatedOrNot()) {
//
//					testUtils1.passTestCase("User is able to Create a poll");
//				}
//
//			} catch (Exception e) {
//				// TODO: handle exception
//				testUtils1.failTestCase("User is not able to Create a poll");
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 5, enabled = false)
//	public void CreateaQuery() throws InterruptedException, IOException {
//		testUtils1.testCaseCreate("TC5 : Create A Query");
//		Thread.sleep(3000);
//
//		querymethod.ClickOnPlusIcon();
//		querymethod.ClickonCreateAQueryBTn();
//		querymethod.ClickonCaterogryDropDown();
//		querymethod.SelectFromDropdown();
//		querymethod.ClickonSubmitButton();
//		querymethod.EnterQuestion();
//		querymethod.ClickonCreateBtn();
//		Thread.sleep(3000);
//		try {
//			if (querymethod.ToVerifyQueryCreatedOrNot()) {
//				testUtils1.passTestCase("User is able to Create Query");
//
//			}
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to Create Query");
//		}
//
//	}
//
//	@Test(priority = 6, enabled = false)
//	public void CreateClub() throws InterruptedException {
//
//		testUtils1.testCaseCreate("TC6 : Create Club");
//
//		Thread.sleep(3000);
//
//		try {
//
//			clubcreatemethod.ClickonMoreButton();
//			clubcreatemethod.ClickonClubButton();
//			clubcreatemethod.ClickonMyClubbutton();
//			clubcreatemethod.ClickonCreateicon();
//			clubcreatemethod.ClickonAddBanner();
//			clubcreatemethod.ClickonGallery();
//			clubcreatemethod.ClickOnDownLoad();
//			clubcreatemethod.SelectImagetoupload();
//			Thread.sleep(3000);
//			clubcreatemethod.enterClubTitle();
//			clubcreatemethod.EnterClubDetails();
//			clubcreatemethod.ClickonPrivateRadioButton();
//			clubcreatemethod.ClickomIndustryDropDown();
//			clubcreatemethod.SelectIndustryFromDropDown();
//			clubcreatemethod.clickonSubmitButton();
//			clubcreatemethod.ClickonFuncionDropdown();
//			clubcreatemethod.selectFunctionFromDropDOwn();
//			clubcreatemethod.clickonSubmitButton();
//			clubcreatemethod.ClickOnCategory();
//			clubcreatemethod.SelectCatergoryFromDropDown();
//			clubcreatemethod.ClickOnCreateClubBtnFinal();
//			Thread.sleep(4000);
//			try {
//				if (clubcreatemethod.verifyClubCreateOrNot()) {
//					testUtils1.passTestCase("User is able to create new club");
//
//				}
//			} catch (Exception e) {
//				testUtils1.failTestCase("User is not able to create new club");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(priority = 7, enabled = false)
//	public void CreateEvent() throws InterruptedException, IOException {
//		testUtils1.testCaseCreate("TC7 : Create Event");
//
//		Thread.sleep(3000);
//		try {
//			eventcreatemethod.ClickonMoreButton();
//			eventcreatemethod.ClickonEventsButton();
//			eventcreatemethod.clickOnMyEventsButton();
//			eventcreatemethod.ClickButtonPlusIcon();
//			eventcreatemethod.ClickonAddBanner();
//			eventcreatemethod.ClickonGallery();
//			eventcreatemethod.ClickOnDownLoad();
//			Thread.sleep(3000);
//			eventcreatemethod.SelectImagetoupload();
//			Thread.sleep(3000);
//			eventcreatemethod.enterEventTitle();
//			eventcreatemethod.EnterEventDescription();
//			eventcreatemethod.ClickomIndustryDropDown();
//			eventcreatemethod.SelectIndustryFromDropDown();
//			eventcreatemethod.clickonSubmitButton();
//			eventcreatemethod.ClickonFuncionDropdown();
//			eventcreatemethod.selectFunctionFromDropDOwn();
//			eventcreatemethod.clickonSubmitButton();
//			eventcreatemethod.ClickOnCategory();
//			eventcreatemethod.SelectCatergoryFromDropDown();
//			eventcreatemethod.clickonSubmitButton();
//			eventcreatemethod.ClickonNextButton();
//			eventcreatemethod.ClickOnSelectHost();
//			eventcreatemethod.ClickOnIndivisualButton();
//			eventcreatemethod.ClickonPrivateRadioButton();
//			eventcreatemethod.ClickonOfflineRadioButton();
//			eventcreatemethod.EnterVenue();
//			eventcreatemethod.ClickonStartdate();
//			eventcreatemethod.ClickonOkButton();
//			eventcreatemethod.ClickonEnddate();
//			eventcreatemethod.ClickonEndOkButton();
//			eventcreatemethod.ClickonStartTimeButton();
//			eventcreatemethod.ClickonOkButton();
//			eventcreatemethod.ClickonEndTimeButton();
//			eventcreatemethod.ClickonOkButton();
//			eventcreatemethod.ClickonNextBtn();
//			eventcreatemethod.ClickonClub();
//			eventcreatemethod.SelectClubFromList();
//			eventcreatemethod.ClickOnCreateEventButtonFinal();
//			Thread.sleep(4000);
//			try {
//				if (eventcreatemethod.VerifEventCreatedOrNot()) {
//					testUtils1.passTestCase("User is able to create event succesfully");
//
//				}
//			} catch (Exception e) {
//				testUtils1.failTestCase("User is not able to create event");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 8, enabled = false)
//	public void CreateJob() throws InterruptedException {
//
//		testUtils1.testCaseCreate("TC8 : Create Job");
//
//		Thread.sleep(3000);
//		try {
//
//			jobcreatemethod.ClickonJobBtn();
//			jobcreatemethod.ClickonHireButton();
//			jobcreatemethod.ClickonCreatePlusIcon();
//			jobcreatemethod.EnterJobTitleName();
//			String ActualText = driver.findElement(By.id("com.linkcxo:id/job_title")).getText();
//			System.out.println(ActualText);
//			Thread.sleep(3000);
//			jobcreatemethod.EnterCompanyName();
//			jobcreatemethod.ClickomIndustryDropDown();
//			jobcreatemethod.SelectIndustryFromDropDown();
//			jobcreatemethod.clickonSubmitButton();
//			jobcreatemethod.ClickonFuncionDropdown();
//			jobcreatemethod.selectFunctionFromDropDOwn();
//			jobcreatemethod.clickonSubmitButton();
//			jobcreatemethod.ClickOnMinMaldrop();
//			jobcreatemethod.SelectSalaryFromDrop();
//			jobcreatemethod.ClickOnMaxSalDrop();
//			jobcreatemethod.SelectMaxSalaryFromDrop();
//			jobcreatemethod.EnterJobLocation();
//			jobcreatemethod.ClickOnJobTypeDropDown();
//			jobcreatemethod.SelectJobTypeFromDropDown();
//			jobcreatemethod.ClickonMinExp();
//			jobcreatemethod.SelectMinExpFromDropDown();
//			jobcreatemethod.ClickonMaxExp();
//			jobcreatemethod.SelectMaxExpFromDropDown();
//			jobcreatemethod.ClickonNExtButton();
//			jobcreatemethod.EnterQualification();
//			jobcreatemethod.EnterSkills();
//			Thread.sleep(2000);
//			jobcreatemethod.EnterJD();
//			Thread.sleep(4000);
//			jobcreatemethod.ClickonPosTButton();
//			Thread.sleep(6000);
//			jobcreatemethod.ClickonAppliedJob();
//			String ExpectedText = driver.findElement(By.id("com.linkcxo:id/job_title_Id")).getText();
//			System.out.println(ExpectedText);
//			Thread.sleep(3000);
//			try {
//				if (ExpectedText.equals(ActualText)) {
//					testUtils1.passTestCase("User is able to Create New Job");
//
//				}
//			} catch (Exception e) {
//				testUtils1.failTestCase("User is not able to Create New Job");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(priority = 9, enabled = false)
//	public void SendConnection() throws InterruptedException, IOException {
//
//		testUtils1.testCaseCreate("TC 09 : Send Connection");
//
//		Thread.sleep(3000);
//
//		try {
//			jobconnectionSendMethod.ClickonNetworkButton();
//			testUtils1.test.log(Status.INFO, "Click on Network Button");
//			jobconnectionSendMethod.clikonFirstConnectionConnectButton();
//			testUtils1.test.log(Status.INFO, "Click on First Connection Connect Button");
//			jobconnectionSendMethod.ClickonMynetWorkButton();
//			testUtils1.test.log(Status.INFO, "Click on My Network tab");
//			jobconnectionSendMethod.ClickonSentButton();
//			testUtils1.test.log(Status.INFO, "Click on Sent Button");
//			Thread.sleep(3000);
//
//			try {
//				if (jobconnectionSendMethod.VerifyConnectioninSentTab()) {
//
//					testUtils1.passTestCase("User is able to send connection");
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				testUtils1.failTestCase("User is not able to send connection");
//			}
//			jobconnectionSendMethod.ClickonCancelButton();
//			testUtils1.test.log(Status.INFO, "Click on Cancel Button");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			testUtils1.failTestCase("User is not able to send connection");
//			// TODO: handle exception
//		}
//
//	}
//
//	@Test(priority = 10, enabled = false)
//	public void ProfieUpdate() throws InterruptedException {
//		testUtils1.testCaseCreate("TC 10 : Update Profile");
//		Thread.sleep(3000);
//
//		try {
//
//			profileUpdate.ThreebarMenuBtn();
//			profileUpdate.CLickonUserName();
//			Thread.sleep(5000);
//			try {
//				// startX,startY,end Y
//				absCom.swipDownByCoordinates(492, 2059, 731); // startX,startY,end Y
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			profileUpdate.ClickonLangauge();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(priority = 10, enabled = false)
//	public void SaveJob() throws IOException, InterruptedException {
//		testUtils1.testCaseCreate("TC 10 : Save Job");
//		Thread.sleep(3000);
//		try {
//			jobSaveMethod.ClickonJobsButton();
//			testUtils1.test.log(Status.INFO, "Click on Jobs Button");
//			jobSaveMethod.ClickonFirstJob();
//			testUtils1.test.log(Status.INFO, "Click on First Job");
//			jobSaveMethod.ClickonSaveButton();
//			testUtils1.test.log(Status.INFO, "Click on Save Button");
//			Thread.sleep(3000);
//
//			try {
//				if (jobSaveMethod.VerifySavedJob()) {
//					testUtils1.passTestCase("User is  able to Save Job");
//
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				testUtils1.failTestCase("User is not able to Save Job");
//				// TODO: handle exception
//			}
//			jobSaveMethod.ClickonFirstViewJob();
//			testUtils1.test.log(Status.INFO, "Click on First View Job");
//			jobSaveMethod.ClickonUnsaveButton();
//			testUtils1.test.log(Status.INFO, "Click on UnSave Button");
//
//			try {
//				if (jobSaveMethod.VerifyjobisUnsaveorNOT()) {
//					testUtils1.passTestCase("User is  able to UnSave Job");
//
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				testUtils1.failTestCase("User is not able to UnSave Job");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			testUtils1.failTestCase("User is not able to Save Job");
//		}
//	}
//
//	@Test(priority = 11, enabled = false)
//	public void EditstatusFromOpenToInactive() throws InterruptedException, IOException {
//		testUtils1.testCaseCreate("TC 11 : Change Status from Open To Inactive");
//		Thread.sleep(3000);
//
//		opentoinactiveMethod.ClickonJobBtn();
//		testUtils1.test.log(Status.INFO, "Click on Jobs Button");
//		opentoinactiveMethod.ClickonHireButton();
//		testUtils1.test.log(Status.INFO, "Click on Hire Button");
//		opentoinactiveMethod.ClickonEditButton();
//		testUtils1.test.log(Status.INFO, "Click on Edit Button");
//		opentoinactiveMethod.ClickonJobStatus();
//		testUtils1.test.log(Status.INFO, "Click on Job Status");
//		opentoinactiveMethod.SelectInactiveFromDropdown();
//		testUtils1.test.log(Status.INFO, "Select Inactive From Dropdown");
//		opentoinactiveMethod.ClickonNExtButton();
//		testUtils1.test.log(Status.INFO, "Click on Next Button");
//		opentoinactiveMethod.ClickonPostButton();
//		testUtils1.test.log(Status.INFO, "Click on Post Button");
//		Thread.sleep(4000);
//		try {
//			if (opentoinactiveMethod.VerifyJobisinInactiveorNot()) {
//
//				testUtils1.passTestCase("User is  able to change job status from Open to Inactive");
//			}
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to change job status from Open to Inactive");
//		}
//
//		try {
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to change job status from Open to Inactive");
//			// TODO: handle exception
//		}
//
//	}
//
//	@Test(priority = 12, enabled = false)
//	public void EditstatusFromInactivetoOpen() throws InterruptedException, IOException {
//		testUtils1.testCaseCreate("TC 12 : Change Status from Inactive To Open");
//		Thread.sleep(3000);
//
//		inactivetoopenMethod.ClickonJobBtn();
//		testUtils1.test.log(Status.INFO, "Click on Jobs Button");
//		inactivetoopenMethod.ClickonHireButton();
//		testUtils1.test.log(Status.INFO, "Click on Hire Button");
//		inactivetoopenMethod.ClickonEditButton();
//		testUtils1.test.log(Status.INFO, "Click on Edit Button");
//		inactivetoopenMethod.ClickonJobStatus();
//		testUtils1.test.log(Status.INFO, "Click on Job Status");
//		inactivetoopenMethod.SelectOpenFromDropdown();
//		testUtils1.test.log(Status.INFO, "Select Open From Dropdown");
//		inactivetoopenMethod.ClickonNExtButton();
//		testUtils1.test.log(Status.INFO, "Click on Next Button");
//		inactivetoopenMethod.ClickonPostButton();
//		testUtils1.test.log(Status.INFO, "Click on Post Button");
//		Thread.sleep(4000);
//		try {
//			if (inactivetoopenMethod.VerifyJobisinOpenorNot()) {
//
//				testUtils1.passTestCase("User is  able to change job status from Inactive to Open");
//			}
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to change job status from Inactive to Open");
//		}
//
//		try {
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to change job status from Inactive to Open");
//			// TODO: handle exception
//		}
//
//	}
//
//	@Test(priority = 13, enabled = true)
//	public void EditstatusFromOpenToClosed() throws InterruptedException, IOException {
//		testUtils1.testCaseCreate("TC 13 : Change Status from Open To Closed");
//		Thread.sleep(3000);
//
//		opentoclosedMethod.ClickonJobBtn();
//		testUtils1.test.log(Status.INFO, "Click on Jobs Button");
//		opentoclosedMethod.ClickonHireButton();
//		testUtils1.test.log(Status.INFO, "Click on Hire Button");
//		opentoclosedMethod.ClickonEditButton();
//		testUtils1.test.log(Status.INFO, "Click on Edit Button");
//		opentoclosedMethod.ClickonJobStatus();
//		testUtils1.test.log(Status.INFO, "Click on Job Status");
//		opentoclosedMethod.SelectClosedFromDropdown();
//		testUtils1.test.log(Status.INFO, "Select Closed From Dropdown");
//		opentoclosedMethod.ClickonNExtButton();
//		testUtils1.test.log(Status.INFO, "Click on Next Button");
//		opentoclosedMethod.ClickonPostButton();
//		testUtils1.test.log(Status.INFO, "Click on Post Button");
//		Thread.sleep(4000);
//		try {
//			if (opentoclosedMethod.VerifyJobisinClosedorNot()) {
//
//				testUtils1.passTestCase("User is  able to change job status from Open to Closed");
//			}
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to change job status from Open to Closed");
//		}
//
//		try {
//
//		} catch (Exception e) {
//			testUtils1.failTestCase("User is not able to change job status from Open to Closed");
//		}
//
//	}
//
//	@AfterTest
//	public void tearDown() {
//		testUtils1.ExtentFlush();
//		driver.quit();
//
//	}

}
