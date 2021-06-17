package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("123123");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		driver.switchTo().alert().sendKeys("");
		driver.switchTo().alert().getText();
		
		
		
		
	}

}
