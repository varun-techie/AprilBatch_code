package seleniumpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotpg {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		//conversion,TYPECASTING
		TakesScreenshot scr =(TakesScreenshot) driver;
		//file(select) and fileinputstream(read)
		File s = scr.getScreenshotAs(OutputType.FILE);
		
		File f =  new File("D:\\mytest\\checkhere\\myimage.png");
		
		//download commons.io jar
		//fileutils
		FileUtils.copyFile(s, f);
		
		
	}

}
