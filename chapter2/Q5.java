package chapter2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Node a = new Node(1);
		a.next = new Node(7);
		
		Node b = new Node(2);
		b.next = new Node(5);
		
		Node result = add(a, b);
		while(result != null) {
			System.out.print(result.data);
			result = result.next;
		}
	}
	
	
	
	public static Node reverseAdd(Node numA, Node numB) {
		
		while(numA != null || numB != null) {
			
		}
		
		return null;
		
	}
	
	//Mine - good answer but should've tried to do it contained to the linked list
	public static Node add(Node numA, Node numB) {
	
		int a = buildNum(numA);
		int b = buildNum(numB);
		
		return createNumList(a + b);
	}
	
	public static int buildNum(Node n) {
		
		int result = 0;
		while(n != null) {
			result = result * 10;
			result += n.data;
			n = n.next;
		}
		return result;
	}
	
	public static Node createNumList(int x) {
		
		Node head = null;
		while(x % 10 != x) {

			Node n = new Node(x % 10);
			n.next = head;
			head = n;
			
			x = x /10;
		}
		Node n = new Node(x);
		n.next = head;
		head = n;
		
		return head;
		
	}

}
