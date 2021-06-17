package firstpackage;

public class Equalsprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=10;
		
		//==
		if(a==b) {
			System.out.println("yes both are equal");
		}
		
		
		String s="varun";//String constant pool
		String s1="varun";//reference stack create
		
		if(s==s1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
		String s2= new String("varun");
		System.out.println(s2);
		
		if(s.equals(s2)) {
			System.out.println("yes again");
		}
		
	}

}
