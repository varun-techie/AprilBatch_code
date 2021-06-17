package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		//windowhandle
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		
		//click
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		
		
		//multiple tabs
		Set<String>  windows=	driver.getWindowHandles();
		System.out.println(windows.size());
		
		
		
		//iteration
		for(String s: windows) {
			
			driver.switchTo().window(s);
			//respective window..
			//isdisplayed,!=null
			if(driver.findElements(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).size()>0) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("test@gmail.com");
				//break;
				//driver.close();//current focussed window
			}
							
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		//thing in parent
		
		driver.quit();//session--all windows
		
		
		
		
		
		
		
		
		
	}

}
