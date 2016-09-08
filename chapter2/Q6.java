package chapter2;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPali(Node head) {
		Node reverse = new Node(head.data);
		
		Node itr = head.next;
		while(itr != null) {
			Node newReverse = new Node(itr.data);
			newReverse.next = reverse;
			reverse = newReverse;
		}
		
		while(reverse != null && head != null) {
			if((reverse == null && head != null) || (head == null && reverse != null) || reverse.data != head.data) {
				return false;
			}
			
			head = head.next;
			reverse = reverse.next;
		}
		
		return true;
		
	}

}
