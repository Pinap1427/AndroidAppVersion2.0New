package LinkCxO2.O.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import LinkCxO2.O.Utils.TestUtilsLinkCxo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseLinkCxo {
		
		public static AndroidDriver driver;
		public static Properties prop;
		public static WebDriverWait wait;
		
		public void TestBase() throws IOException{	
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/ishine/config/configure.propertief");
			prop=new Properties();
			prop.load(fs);
		}
		
		public static void LaunchApp() throws MalformedURLException
		{
			//DesiredCapabilities dc = new DesiredCapabilities();
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("deviceName", "LinkCxOPhone");
//			dc.setCapability("UDID", "31d2859a");//for physical device
			dc.setCapability("UDID", "emulator-5554");//for emulator
//			dc.setCapability("platformVersion", "9");
			dc.setCapability("platformVersion", "8");
//			dc.setCapability("app", "D://LinkCxO//application-33fdc9cb-2973-459c-b708-4edc940ef34e.apk");
			dc.setCapability("app", "D://LinkCxO//application-53e518d2-4e3c-4050-830a-5bd5ccacc366.apk");
//			dc.setCapability("app", "D://LinkCxO//pgs1.156.0_0.315.2_uxXGf.apk");
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AndroidDriver(url, dc);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 wait = new WebDriverWait(driver, 20);
			 
		}
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		public static void InitializeBrowser() throws IOException {
//			TestUtilsLinkCxo testUtils=new TestUtilsLinkCxo();
//			String browserName=prop.getProperty("BROWSER");
//			if(browserName.equalsIgnoreCase("chrome"))
//			{
//				WebDriverManager.chromedriver().setup();
//				ChromeOptions option =new ChromeOptions();
//				option.addArguments("--remote-allow-origins=*");
//				driver=new ChromeDriver(option);	
//			}
//			else if(browserName.equalsIgnoreCase("firefox"))
//			{
//				WebDriverManager.firefoxdriver().setup();
//				FirefoxOptions option =new FirefoxOptions();
//				option.addArguments("--remote-allow-origins=*");
//				driver=new FirefoxDriver(option);	
//			}
//			else if(browserName.equalsIgnoreCase("Edge"))
//			{
//				WebDriverManager.edgedriver().setup();
//				EdgeOptions option =new EdgeOptions();
////				option.a("--remote-allow-origins=*");
//				driver=new EdgeDriver(option);	
//			}
//			
//			driver.get(prop.getProperty("URL"));
//			driver.manage().window().maximize();
//			String windowSize = prop.getProperty("WindowSize");
//			String[] dimensions = windowSize.split("x");
//			int width = Integer.parseInt(dimensions[0]);
//			int height = Integer.parseInt(dimensions[1]);
//			Dimension dimension = new Dimension(width,height);
//			driver.manage().window().setSize(dimension);
//			driver.manage().deleteAllCookies();
////			driver.manage().timeouts().pageLoadTimeout(TestUtilsLinkCxo.pageloadtime,TimeUnit.SECONDS);
////			driver.manage().timeouts().implicitlyWait(TestUtilsLinkCxo.implicitywait,TimeUnit.SECONDS);	
//		}

//	}
