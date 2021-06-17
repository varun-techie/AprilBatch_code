package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//draganddrophttps://demoqa.com/droppable
		
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/menu#");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		
		WebElement elem=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		WebElement elem1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		Actions act= new Actions(driver);
		act.moveToElement(elem).build().perform();
		Thread.sleep(2000);
		act.moveToElement(elem1).build().perform();
		
		
	}

}
