package chapter2;

public class SinglyLinkedList {

	public Node head;
	public Node last;
	
	public SinglyLinkedList() {

		head = null;
		last = null;
	}
	
	public void addFront(Node n) {
		if(head == null) {
			head = n;
			last = n;
		} else {
			n.next = head;
			head = n;
		}
	}
	
	public void add(Node n) {
		if(head == null) {
			head = n;
			last = n;
		} else {
			last.next = n;
			last = n;
		}
	}
	
}
