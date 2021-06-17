package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Complexusergesture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		
		WebElement elemet1=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act= new Actions(driver);
		act.doubleClick(elemet1).build().perform();
		
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(element2).build().perform();
		
		
		
		
		
	}

}
