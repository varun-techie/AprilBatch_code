package oopsdefine;

public class Javapgm extends Seleniumpgm{

	
	
	String javatwo="two";
	
	
	public void methodtwo() {
		System.out.println("method two");
	}
	
	public void commonmethod() {
		
		System.out.println("common method");
		System.out.println("engine running at 1400cc");
	}
	
	public static void main(String[] args) {
		
		Javapgm java= new Javapgm();
		java.seleniumone="asdas";
		
		java.methodone();
		
	}
	
	
	
}
