package chapter1;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compress("abbc"));
		
	}
	//Mine - failed to use a StringBuilder O(p + k^2) complexity, also I was supposed to add a 1 for single chars oops
	public static String compress(String a) {
		String compressed = "";
		int count = 0;
		char curr = ' ';
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != curr) {
				if(count > 1) {
					compressed += count;
				}
				compressed += a.charAt(i);
				curr = a.charAt(i);
				count = 1;
			} else {
				count++;
			}
		}
		if (count > 1) compressed += count;
		
		return compressed.length() < a.length() ? compressed : a;
	}
	
	//Correct could slightly improved by checking if compressed is going to be shorter before building it
	public static String compressC(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		
		return compressed.length() < str.length() ? compressed.toString() : str;
	}

}
