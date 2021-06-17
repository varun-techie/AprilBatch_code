package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mysecondpgm extends Singlereference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.zoho.com/signup.html");
		driver.manage().window().maximize();//mandatory
		
		Thread.sleep(2000);///2seconds
		//selenium waits,
        
		/*
		 * By someref=By.id("test"); WebElement ele =driver.findElement(someref);
		 * ele.sendKeys("");
		 */
		
		//id unique
		/*
		 * driver.findElement(By.id("emailfield")).sendKeys("testone@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("mypassword");
		 */
		
		
		driver.findElement(By.name("email")).sendKeys("testtwo@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("testhree@gmail.com");

		driver.findElement(By.name("password")).sendKeys("testpassword");
		
		
		//driver.findElement(By.className("form-input sgnpaswrd")).sendKeys("aaaaaa");
		Thread.sleep(3000);
		
		driver.findElement(By.className("signupbtn")).click();
		
		
		
	}

}
