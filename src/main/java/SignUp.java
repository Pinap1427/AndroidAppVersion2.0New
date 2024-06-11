import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
	}

}
