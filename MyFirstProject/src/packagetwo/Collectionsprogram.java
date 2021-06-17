package packagetwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collectionsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//add and retrieve
		
		//class
		//ordered...
		//duplicates...
		//random access
		ArrayList<String>  arr = new ArrayList<String>();
		arr.add("testone");
		arr.add("testtwo");
		arr.add("testthree");
		arr.add("testthree");
		
		List<String> ar = new ArrayList<String>();
		//selenium ---webdriver(interface)
		
		String sas="";
		//Double
		//
		//collections-only objects accepts
		ArrayList<Integer>  ss=new ArrayList<Integer>();
		
		
		int a=11;
		Integer i=Integer.valueOf(a);//explicit
		//wrapper class
		Integer j=a;//implicit
		
		
		arr.add(2, "dummy");
		System.out.println(arr.get(2));
		
		//arrays and collections
		for(String s:arr) {
			System.out.println(s);
				}
		
		
		//general for loop
		//iterator---loop---collections
		
		Iterator<String> itr=arr.iterator();//assigning the values to itr
		///iterate itr
		///whether elements present in itr
		
		while(itr.hasNext()) {
		
		System.out.println(itr.next());//get my values
	
		
		}
		
		
		//unordered,no index concept
		//unique values
		HashSet<String>  aro= new HashSet<String>();
		aro.add("one");
		aro.add("sca");
		aro.add("three");
		aro.add("three");
		aro.add(null);
		System.out.println(aro.size());
		 	
		//foreach
		for(String ass:aro) {
			System.out.println(ass);
				}
		
		
		
		
		
	}

}
