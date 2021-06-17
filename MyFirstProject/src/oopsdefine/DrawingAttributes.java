package oopsdefine;

public interface DrawingAttributes extends Singingattributes {

	//static and final 
	
	final String stt="testthree";//cant change the value fof the variable
	
	//static and final
	//100 percent abstraction
	//method signature,incomplete methods--------Abstract(implicit) methods
	public abstract void sketch();
	public void rubber();
	public void chart();
	
	public void pencil();
	
	default void water() {
		System.out.println("test");
	}
	
	static void juice() {
		System.out.println("test juice");
	}
	
	
	//multiple inheritance
	
}
