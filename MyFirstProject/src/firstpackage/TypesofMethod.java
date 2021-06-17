package firstpackage;

public class TypesofMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodone();
		methodone();
		methodone();
		methodone();
		methodtwo();
		add(23,32);
		add(12,34);
		
		int a=13;
		int b=newmethod(10);
		System.out.println(newmethod(10));
		int c=a+b;
		
		String s=getthistring();
		System.out.println(s);
	
		//logical operator
		// and &&
		// or ||
		
		
		
		if(getthzboolean() || getanotherboolean()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
	
	//method signature,method body/block of code
	public static void methodone() {
		
		System.out.println("my first method");
		
	}
	
	
	public static void methodtwo() {
		
		System.out.println("my second method");
		
	}	
	
	public static void add(int a,int b) {
		
		
		System.out.println(a+b);
		
	}

	
	public static void add(String c,int d) {
		
		
	}
	
	
	public static int newmethod(int a) {
		
		int b=a+a;
		
		return b;
		
		}
	
	
	public static String getthistring() {
		
		
		return "test";
	}
	
	
	public static boolean getthzboolean() {
		
		return false;
	}
	
	public static boolean getanotherboolean() {
		
		return true;
	}
	

}
