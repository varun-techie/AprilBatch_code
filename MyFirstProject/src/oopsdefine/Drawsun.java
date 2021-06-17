package oopsdefine;

public class Drawsun implements DrawingAttributes{
//drawsun(sub classed)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawsun sun = new Drawsun();
		sun.sketch();
		sun.rubber();
		sun.water();
		
		System.out.println(sun.stt);
		///////////////sun.stt
		
		DrawingAttributes.juice();
		
		//DrawingAttributes d= new DrawingAttributes();
		
		}

	@Override
	public void sketch() {
		// TODO Auto-generated method stub
		System.out.println("using sketch");
	}

	@Override
	public void rubber() {
		// TODO Auto-generated method stub
	System.out.println("using rubber");	
	}

	@Override
	public void chart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pencil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mic() {
		// TODO Auto-generated method stub
		
	}

}
