package packagetwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMappgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//get the values--jump
		//map----key value pair
		//only value 
		//hashmap,hashtable(synchronized)
		//non-synchronised---developer--application---
		
		HashMap<Integer, String>  hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "testone");
		hmap.put(2, "testtwo");
		hmap.put(3, "testthree");
		
		
		
		//retrieve values
		//entryset(key,value),keyset(keys,values(values)
		//100 percent
		for(Map.Entry<Integer, String> hm:hmap.entrySet()) {
			
			System.out.println(hm.getKey()+" "+hm.getValue());
		}
		
		
		for(Integer i:hmap.keySet()) {
			System.out.println(i);
		}
		
		
		for(String s:hmap.values()) {
			System.out.println(s);
		}
		
		
		
		Iterator<Map.Entry<Integer, String>> itr=hmap.entrySet().iterator();//assigning the values to itr
		///iterate itr
		///whether elements present in itr
		
		while(itr.hasNext()) {
		
		System.out.println(itr.next());//get my values
		
		}
		
	}

}
