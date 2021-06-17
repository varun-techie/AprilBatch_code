package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutorpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		
		
		  JavascriptExecutor js =(JavascriptExecutor) driver;
			/*
			 * js.executeScript("document.getElementById('email').value='testtwp';");
			 * 
			 * WebElement
			 * element=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
			 * js.executeScript("arguments[0].click();", element);
			 */
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[5]/div/div/div/div/div[1]/div/div/a"));
		js.executeScript("arguments[0].scrollIntoView();", element1);
		element1.click();
		
		
		
	}

}
