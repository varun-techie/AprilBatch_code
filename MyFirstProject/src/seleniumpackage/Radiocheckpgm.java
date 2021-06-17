package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocheckpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(2000);
		
		
		//driver.findElement(By.id("seleniumbox")).click();
		//driver.findElement(By.id("php1")).click();
		
	boolean b=	driver.findElement(By.id("restapibox")).isSelected();
		System.out.println(b);
		
		/*
		 * if(driver.findElement(By.id("restapibox")).isSelected()) { ///true }else {
		 * //false }
		 */
		
		
		
		boolean c =driver.findElement(By.id("demo")).isEnabled();
		System.out.println(c);
		
		
		
		//isdisplayed--applicable for all the webelements
		boolean d=driver.findElement(By.id("demo")).isDisplayed();
		System.out.println(d);
		
		
	}

}
