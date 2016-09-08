package chapter1;

public class Q1 {

	public static void main(String[] args) {
		
		String ex = "tt";
		
		System.out.println(uniqueChars(ex));

	}
	
	//Mine
	public static boolean uniqueChars(String s) {
		char[] arr = s.toCharArray();
		boolean[] table = new boolean[26]; //assuming a-z characters
		
		for(int i = 0; i < arr.length; i++) {
			if(table[arr[i]- 'a'] == true) {
				return false;
			} else {
				table[arr[i] - 'a'] = true;
			}
		}
		
		return true;
	}
	
	
	//Correct
	public static boolean uniqueCharsC(String str) {
		if (str.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
	}

}
