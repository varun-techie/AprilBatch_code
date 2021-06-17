package oopsdefine;

public class Combinedboth extends Javapgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Javapgm ja= new Javapgm(); ja.methodtwo();
		 * 
		 * System.out.println(ja.javatwo);
		 * 
		 * 
		 * Seleniumpgm sel= new Seleniumpgm(); sel.methodone();
		 */
		
		
		Combinedboth both = new Combinedboth();
		both.methodone();
		both.methodtwo();
		
		
		both.commonmethod();
		both.addnewlights("test one light");
		
	}

	@Override
	public void commonmethod() {
		
		System.out.println("my own engine");
		System.out.println("1700cc");
	}
	
	//overloading
	public void addnewlights(String a) {
		
	}
	
	
	public void addnewlights() {
		
	}
	
	public void addnewlights(String a, int b, double c) {
		
	}
	
}
