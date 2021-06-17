package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singlereference {

	
	static WebDriver driver=null;
	
	//broser==chrome
	//to decide and return browser reference
	public static WebDriver launchbrowser(String browser) {
		
		//String browser="chrome";//input
		
		
		if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			
			 driver= new FirefoxDriver();
		}
		
		return driver;
		
		
	}
	
	
	
}
