package firstpackage;

public class Twodimensionalpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][]  str = new String[2][3];// 0 and 1---0 1 2
		
		
		String[][] st = {{"one","two"},{"three","four"},{"asdasd","asdasdsa"}};
		
		
		str[0][0] = "testone";
		str[0][1] ="testtwo";
		str[0][2] = "testthree";
		
		
		str[1][0]  ="checkone";
		str[1][1]  ="checktwo";
		str[1][2]  ="checkthree";
		
		System.out.println("no.of rows "+str.length );
		
		for(int i=0;i<str.length;i++) {
			System.out.println("no.of columns "+str[i].length);
			
			for(int j=0;j<str[i].length;j++) {
				
			System.out.println(str[i][j]);	
			}
			
			
		}
		
		
	}

}
