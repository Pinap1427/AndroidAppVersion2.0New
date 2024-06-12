package AbstractComponents;


import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class AbstractComponent{
	
	public AndroidDriver driver;
	//public static final EXPLICIT_WAIT = 10;
	
	public AbstractComponent(AndroidDriver driver) 
	{
		this.driver=driver;
	}

	public void click(MobileElement mobileElement) 
	{
		mobileElement.click();
	}
	
	public void Keys(MobileElement StartEndDate)
	{
		AndroidElement startdate= (AndroidElement) driver.findElementById("android:id/pickers");
		startdate.sendKeys(Keys.TAB);
		startdate.sendKeys(Keys.ARROW_DOWN);
	}
	public void SwipDown()
	{
		try {
			
			org.openqa.selenium.Dimension size = driver.manage().window().getSize();
			System.out.println(size);

			int startX = size.width / 2;
	        int startY = (int) (size.height * 0.8); // 80% from the bottom
	        int endY = (int) (size.height * 0.2); // 20% from the top

	        // Perform swipe up action
	        TouchAction touchAction = new TouchAction(driver);
	        touchAction.press(PointOption.point(startX, startY))
	                   .moveTo(PointOption.point(startX, endY))
	                   .release()
	                   .perform();
	        System.out.println("Swipe down action performed successfully.");
	    } catch (Exception e) {
	        System.out.println("Error occurred while performing swipe down action: " + e.getMessage());
	        e.printStackTrace();
	    }

			
		
		
	}
	public void swipDownByCoordinates(int startX, int startY, int endY)
	{

         // Perform swipe up action
         TouchAction touchAction = new TouchAction(driver);
         touchAction.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
	}
	
	public void WaitForElementVisible(MobileElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
//	public Select DropDownSelection(String element, WebElement designation)
//	{
//		
//		//AndroidElement selectElement = (AndroidElement) driver.findElement(By.id("com.linkcxo:id/designation"));
//        Select select = new Select(designation);
//        // select an option by its visible text
//        select.selectByVisibleText(element);
//        return select;
//        
//        Select objSelect =new Select(driver.findElement(By.id("search-box")));
//        objSelect.selectByVisibleText("Automation");
//	
//	}
}

