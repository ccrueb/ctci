package chapter1;

public class Two {

	public static void main(String[] args) {
		String a = "dog";
		String b = "g0d";
		
		System.out.println(isPermutation(a,b));

	}
	
	//Mine
	public static boolean isPermutation(String a, String b) {
		if(a.length() != b.length()) return false;
		
		return(compareArrays(charCount(a),charCount(b)));
	}
	
	private static int[] charCount(String s) {
		int[] charCount = new int[128];
		for(int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i)]++;
		}
		
		return charCount;
	}
	
	private static boolean compareArrays(int[]a, int[] b) {
		if (a.length != b.length) return false;
		
		for(int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		
		return true;
	}
	
	//Correct
	public static boolean isPermutationC(String s, String t) {
		if (s.length() != t.length()) return false;
		
		int[] letters = new int[128];
		
		char[] s_array = s.toCharArray();
		for(char c: s_array) {
			letters[c]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if (letters[c] < 0) return false;
		}
		
		return true;
	}

}
