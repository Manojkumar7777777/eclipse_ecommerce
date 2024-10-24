package Collections;

import java.util.HashSet;

public class program6 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
		hs.remove(50);
		System.out.println(hs);
		//hs.contains(150);
		System.out.println(hs.contains(150));
		System.out.println(hs.toArray());
		// TODO Auto-generated method stub
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		

	}

}
