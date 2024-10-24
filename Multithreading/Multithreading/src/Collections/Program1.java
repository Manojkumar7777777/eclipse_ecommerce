package Collections;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		al.add(al);
		al.add("jeevan");
		al.add("S");
		al.add("true");
		al.add(567.456);
		al.add(347.4587f);
		System.out.println(al);
		al.add(8,"Sandesh");
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al1);
		al1.addAll(al);
		System.out.println(al1);
		al.addAll(8,al1);
		System.out.println(al);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
