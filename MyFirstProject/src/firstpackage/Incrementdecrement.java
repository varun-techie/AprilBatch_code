package firstpackage;

public class Incrementdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;

		System.out.println(i++);// i=i+1;2//10
		System.out.println(i);// 11

		System.out.println(++i); // 12
		System.out.println(i);// 12

		// control statements

		int a = 10;
		int b = 8;
		int c=12;

		if (a > b) {
//login page
			System.out.println("yes a is bigger");
		} else if(a>c) {

			System.out.println("ye a is  bigger compared to c");
		} else if(c>b) {
			
			System.out.println("yes c is bigger");
		}else {
			//error thrown
			System.out.println("nothing got passed");
		}
		
		

	}

}
