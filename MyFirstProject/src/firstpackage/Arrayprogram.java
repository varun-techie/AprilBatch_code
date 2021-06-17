package firstpackage;

public class Arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="varun";
		String sa= new String("kavin");
	
		
		//arrays--set of elements under the same data type
		//add
		String[] str = new String[3];
		str[0] = "testone";
		str[1] = "testtwo";
		str[2] = "testthree";
		
		//retreive,general based loop(arrays,collections,normal)
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
			if(str[i].equals("testtwo")) {
				System.out.println("work flow");
			}
		}
		
		//arrays and collections
		for (String as : str) {
			System.out.println(as);
		}
		
		int[] ia= new int[4];
		
		
		Object[] ob = new Object[4];
		ob[0] ="test";
		ob[1] = 23;
		ob[2] =false;
		ob[3] =123.44;
		
		
		
	}

}
