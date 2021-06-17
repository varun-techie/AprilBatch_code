package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']")).click();
		Thread.sleep(3000);
		
		//total no.of rows
		List<WebElement> rows =driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rows.size());
		
		outerloop:
		for(int i=0;i<rows.size();i++) {
			
			//first row//to find no.of columns
			List<WebElement> cells=driver.findElements(By.xpath("//table/tbody/tr["+(i+1)+"]/td[not(contains(@class,'k-other-month'))]"));
			Thread.sleep(2000);
			for(int j=0;j<cells.size();j++) {
				
				String date=driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[not(contains(@class,'k-other-month'))]["+(j+1)+"]/a")).getText();
				System.out.println(date);
				
				Thread.sleep(1000);
				if(date.equals("2")) {
					driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[not(contains(@class,'k-other-month'))]["+(j+1)+"]/a")).click();
					break outerloop;
				}
				
			}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
