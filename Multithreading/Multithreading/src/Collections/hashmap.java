package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Priya");
		hm.put(2, "Sandesh");
		hm.put(3, "Jeevan");
		hm.put(4, "Karthisha");
		hm.put(5, "Ganesh");
		System.out.println("hm");
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.print(e.getKey()+" ");
			
		}
		System.out.println();
		
		
		
		// TODO Auto-generated method stub

	}

}
