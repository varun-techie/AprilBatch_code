package seleniumpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		File f = new File("D:\\AprilBatch\\MyFirstProject\\Dummy.properties");//file select

		FileInputStream fis = new FileInputStream(f);//file read
		
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("signinbutton"));
		
String[] s=prop.getProperty("signinbutton").split(":");
System.out.println(s[0]);
System.out.println(s[1]);
		
	}

}
