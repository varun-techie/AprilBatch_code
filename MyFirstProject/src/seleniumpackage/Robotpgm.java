package seleniumpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotpgm {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);	
		
		
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		Actions act= new Actions(driver);
		act.click(target).build().perform();
		
		StringSelection ss = new StringSelection("D:\\mytest\\checkhere\\textfile.txt");//select
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copy
		
		
		
		Robot rb=  new Robot();
		
		//paste it
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
