package chapter2;

public class Q2 {

	public static void main(String[] args) {
		
		Node head = new Node(0);
		Node builder = head;
		for (int i = 1; i < 11; i++) {
			builder.next = new Node(i);
			builder = builder.next;
		}
		
		
		System.out.println(kLast(head, 2).data);
		
		
	}
	
	//Mine- this requires two passes, a better solution is with recursion or placing a second pointer k nodes ahead
	public static Node kLast(Node head, int k) {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;	
		}
		if( k > count || k < 1) return null;
		
		curr = head;
		for (int i = 0; i < count - k; i++) {
			curr = curr.next;
		}
		
		return curr;
	}

}
