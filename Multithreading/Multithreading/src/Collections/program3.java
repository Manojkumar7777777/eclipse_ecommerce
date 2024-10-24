package Collections;

import java.util.LinkedList;

public class program3 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(75);
		ll.add(125);
		ll.add(175);
		System.out.println(ll);
		ll.add(5,"manoj");
		System.out.println(ll);
		LinkedList ll1 = new LinkedList();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		System.out.println(ll1);
		ll1.addAll(ll);
		System.out.println(ll1);
		ll.addAll(5, ll1);
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		ll.descendingIterator();
		System.out.println(ll);
		LinkedList clone = (LinkedList)ll.clone();
		System.out.println(clone);
		boolean res = ll.contains(75);
		System.out.println(res);
		res = ll.contains(750);
		System.out.println(res);
		boolean res1 = ll1.contains(20);
		System.out.println(res1);
		res1 = ll1.contains(30);
		System.out.println(res1);
		LinkedList ll2 = new LinkedList();
		
		ll2.add(43);
		ll2.add(4);
		ll2.add(34);
		ll2.add(11);
		ll2.add(7);
		System.out.println(ll2);
		ll2.descendingIterator();
		System.out.println(ll2);
		

		
		//to-generated method stub

	}

}
