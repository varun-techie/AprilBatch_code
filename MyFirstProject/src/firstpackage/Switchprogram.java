package firstpackage;

public class Switchprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int,char until java 1.7
		//string
		int day=4;
		String s="monday";
		///giving an exprression inside switch
		switch (s) {
		//first block checking monday
		case "monday":
			System.out.println("monday");
			break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "thrusday":
			System.out.println("thrusday");
			break;
		default:
			System.out.println("sunday");
			break;
		}
		
		
		
	}

}
