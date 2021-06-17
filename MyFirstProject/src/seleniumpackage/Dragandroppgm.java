package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Dragandroppgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//draganddrophttps://demoqa.com/droppable
		
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();//mandatory
		Thread.sleep(3000);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		Actions act= new Actions(driver);
		//act.dragAndDrop(source, target).build().perform();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		//act.clickAndHold(source).pause(2000).moveToElement(target).release().build().perform();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"droppable\"]/p")));
		
		
		Wait<WebDriver> waitt= new FluentWait<WebDriver>(driver).withTimeout(20,TimeUnit.SECONDS).
				pollingEvery(4, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement ele=waitt.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
			}
		});
		
		//cordinates
		int xfrom=source.getLocation().getX();
		int yfrom=source.getLocation().getY();
		
		
		
		int xto=target.getLocation().getX();
		int yto=target.getLocation().getY();
		
		xto=xto-xfrom+10;
		yto=yto-yfrom+20;
		
		
		act.dragAndDropBy(source, xto, yto).build().perform();
		
		
		act.sendKeys(Keys.DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}

}
