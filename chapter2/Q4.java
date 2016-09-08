package chapter2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void partion(SinglyLinkedList list, int part) {
		
		Node itr = list.head;
		Node prev = null;
		while (itr != null) {
			if(itr.data < part) {
				prev.next = itr.next;
				list.addFront(itr);
			} else {
				prev.next = itr.next;
				list.add(itr);
			}
			
			prev = itr;
			itr = itr.next;
		}
		
		
	}

}
