package packagetwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprogram {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		
		//normal flow --interrupted
		//checked exception(compile) ,unchecked exception(runtime)
	
		
		//throw---explicit he will throw an error
		/*
		 * int aa=19; if(aa>21) { throw new
		 * ArithmeticException("here am facing an error"); }
		 */
		
		FileInputStream fis=null;
		try {
			fis= new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			///definiely run
			System.out.println("i will run for sure");
		}
		
		
		System.out.println("am here no 1");
		
		
		/*
		 * String db="com.mysql.jdbc.driver"; Class.forName(db);
		 * 
		 * System.out.println("am here no 2");
		 */
		
		//unchecked excetpion---run time
		try {
			int a=50/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		int[] b= {12,11,565};
		System.out.println(b[10]);
		
	}

}
