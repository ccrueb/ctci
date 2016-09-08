package chapter2;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
	}
	
	
	//Lots of unimplemented methods.
	public static void removeDups(Node head) {
	
		HashSet set = new HashSet();
		
		Node itr = head;
		
		set.add(itr.data);
		
		while(itr.hasNext()) {
			itr = itr.next();
			if(!set.contains(itr.data)) {
				set.add(itr.data);
			} else {
				itr.remove();
			}
			
		}
	}

}
