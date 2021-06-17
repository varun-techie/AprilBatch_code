package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classtwo {
	
	
	
	@BeforeMethod
	public void beforemethod() {

		System.out.println("before method");
	}
	
	
	@Test(priority=1, description="this method is for logion purpose")
	public void testone() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/upload/");
		
	}
	
	@Test(priority=2)
	public void testtwo() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/upload/");
	}
	
	@Test(priority=3,groups="mine")
	public void testthree() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		driver.get("http://demo.guru99.com/test/upload/");
		
	}
	
	@Test(priority=4,groups="mine")
	public void testfour() {
		
		System.out.println("thrid page");
		
	}

}
