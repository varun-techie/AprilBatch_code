package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub//div[@id='block_top_menu']/ul/li/following-sibling::li/a
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);

		
		List<WebElement> ele =driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li/following-sibling::li/a"));
		
		Thread.sleep(2000);
		
		for(WebElement e: ele) {
			System.out.println(e.getText());
			if(e.getText().equals("DRESSES")) {
				e.click();
				break;
			}
		}
		
		
	}

}
