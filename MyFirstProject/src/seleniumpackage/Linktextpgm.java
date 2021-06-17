package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.zoho.com/signup.html");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(2000);
		
		//gettxt-------------------xpath
		//link,text
		driver.findElement(By.linkText("Terms of Service")).click();///direct u can find the lement
		//driver.findElement(By.partialLinkText("Terms of S")).click();
		
		
		//tagname---link<a--morethan one element in a page
		//dynamically
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		
		for(WebElement e:elements) {
			System.out.println(e.getText());
			
			if(e.getText().equals("Terms of Service")) {
				e.click();
			}
			
		}
		
		
		
		

		
		
	}

}
