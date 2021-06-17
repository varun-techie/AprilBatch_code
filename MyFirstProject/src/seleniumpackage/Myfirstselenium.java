package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Myfirstselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//open the browsers
		//jars, classes and interfaces
		//import jar, project--->buildpath--->configure buildpath--->libraries
		
		//(exe+browser---dummy)
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		//relation
		//single reference to point to the multiple classes(chorm,ff,segd)
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\driverSelenium\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		//selenium 2---firefox browser means---no system.setproperty
		//selenium3--mandate
		
		System.setProperty("webdriver.edge.driver", "D:\\driverSelenium\\msedgedriver.exe");
		EdgeDriver edge = new EdgeDriver();
		
		//IE(prerequiesties)
		//zoom level 100percent
		//security-all four---checkbox uncheck
		//finaltab,check the ssecond option(under advanced--security)
		System.setProperty("webdriver.ie.driver", "D:\\driverSelenium\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		
	}

}
