package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameprogm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		String s2=driver.getCurrentUrl();
		String s3=driver.getTitle();
		String s4=driver.getPageSource();//page content
		if(s4.contains("HTML source")) {
			
		}
		
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");//id or name
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame1\"]")));
		
	String s=	driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		System.out.println(s);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText());
		
		
		driver.switchTo().frame(1);
		
		
		String s1=	driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
			System.out.println(s1);
		
		driver.close();
		
	}

}
