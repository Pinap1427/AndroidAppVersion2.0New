package LinkCxO2.O.Utils;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import LinkCxO2.O.base.TestBaseLinkCxo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.WaitOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeywords extends TestBaseLinkCxo{
	
	
	

	public static boolean isDisplay(WebElement ele) {	
		wait.until(ExpectedConditions.visibilityOf(ele));
		return ele.isDisplayed();	
	}

	public static boolean isClickable(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isEnabled();
	}
	
	public static void clickElement(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}
	
	public static void sendKeysElement(WebElement ele, String element) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(element);
	}


	public static void clearElement(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.clear();
	}

	public static void selectByValue(WebElement ele, String countryName){
		wait.until(ExpectedConditions.visibilityOf(ele));
		Select select = new Select(ele);
		select.selectByVisibleText(countryName);
	}
	public static String getText(WebElement ele)
	{
		wait.until(ExpectedConditions.visibilityOf(ele));
		return ele.getText();
	}
//    public void clickElementById(String id) {
//        MobileElement element = (MobileElement) driver.findElementsByAccessibilityId(id);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//    }
	
}
