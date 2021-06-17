package firstpackage;

public class Stringmanipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " today is a fine day";
		
		System.out.println(str.length());
		
		
		String st= str.substring(4);
		System.out.println(st);
		
		System.out.println(str.substring(4, 18));
		
		
		//indexof,charat
		System.out.println(str.indexOf('x'));
		
		System.out.println(str.charAt(7));
		
		
		System.out.println(str.trim());
		
		//replace(char) and replaceall(string)
		
		System.out.println(str.replace('y', 'Y').trim());
		System.out.println(str.replaceAll("fine", "bad"));
		
		
	}
	
	
	

}
