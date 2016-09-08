package chapter2;

public class Q3 {

	
	
	public static void main(String[] args) {
		
	}
	
	//Mine - note that the last node cannot be deleted this way
	public static void delete(Node middle) {
		middle.data = middle.next.data;
		middle.next = middle.next.next;
	}
}
