package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myfirsttestng {

	// testng---number of annoataions(decide how method can be execueted),@override

	@BeforeClass
	public void beforeclass() {

		System.out.println("before class");
	}
	

	@AfterClass
	public void afterclass() {

		System.out.println("after class");
	}
	
	@BeforeTest
	public void beforemethod() {

		System.out.println("before method");
	}

	@Test(priority = 1,enabled=false)
	public void login() {
		System.out.println("a");

	}

	@AfterMethod
	public void aftermethod() {

		System.out.println("after method");
	}

	@Test(priority = 3)
	public void homepage() {
		System.out.println("c");
	}

	@Test(priority = 2)
	public void addtocart() {

		System.out.println("b");
	}

}
