package packagetwo;

public class Stringbufferbuilderprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sa = new String("asdasda");
		String s="test";//immutable
		concatString(s);
		System.out.println(s);
		
		
		//stringbuffer and string builder
		StringBuffer  sb= new StringBuffer("rest");//mutable
		concatbuffer(sb);
		System.out.println(sb);
		
		
		StringBuilder  sbb = new StringBuilder("check");//mutable
		concatbuilder(sbb);
		System.out.println(sbb);
		
	}

	private static void concatbuilder(StringBuilder sbb) {
		// TODO Auto-generated method stub
		StringBuilder s1= sbb.append(" builder here");
	}

	private static void concatbuffer(StringBuffer sb) {
		// TODO Auto-generated method stub
		StringBuffer s1=sb.append("buffer here");
		
	}

	private static void concatString(String s) {
		// TODO Auto-generated method stub
		String s1= s+" add here";
		
	}

}
