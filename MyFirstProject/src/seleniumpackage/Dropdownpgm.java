package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.zoho.com/signup.html");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"zip-countryname-change\"]")).click();
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.id("country"));
		Select se= new Select(element);
		//se.selectByIndex(4);
		
		//se.selectByValue("AF");
		se.selectByVisibleText("Australia");
		
		
		
		
		
		
	}

}
