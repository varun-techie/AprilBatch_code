package packagethree;


import java.util.Date;

import packagetwo.Aclass;

import java.sql.*;



public class Bclass extends Aclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			Bclass a = new Bclass();
			a.a="asdasd";
			a.methodA();
			
			
			String s="200";
			int aa=Integer.parseInt(s);//Intger.valueof
					System.out.println(aa);
			
			int b=12;
			String sa=String.valueOf(b);
			//100.0
			
			Date d = new Date();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
