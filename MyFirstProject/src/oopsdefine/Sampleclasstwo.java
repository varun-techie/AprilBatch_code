package oopsdefine;

public class Sampleclasstwo extends Sampleclassone{

	
	String variableone="varible";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sampleclasstwo two= new Sampleclasstwo();
		two.display();
		
		//super///non static stuff
	}
	
	public Sampleclasstwo() {
		super();
		
		
	}
	
	
	
	//this---local objects--methods,variable,constructor
	//super
	
	public void display() {
	System.out.println(super.variableone);
	super.methodone();
	System.out.println(variableone);//local object mean	
		
	}

}
