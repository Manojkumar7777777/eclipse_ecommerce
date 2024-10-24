package Collections;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tp = new TreeMap<Integer,String> ();
		tp.put(1, "Priya");
		tp.put(2, "Sandesh");
		tp.put(3, "Jeevan");
		tp.put(4, "Karthisa");
		tp.put(5, "manoj");
		System.out.println(tp);
		for(Map.Entry<Integer, String> e : tp.entrySet());{
			System.out.println(e.getKey()+" ");
		}
		System.out.println();
		for(Map.entry(Map.Entry, null))
		// TODO Auto-generated method stub

	}

}
