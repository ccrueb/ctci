package chapter1;
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(oneEdit("pale", "bake"));

	}
	
	//Mine
	public static boolean oneEdit(String a, String b) {
		boolean countChange = (a.length() != b.length());
		boolean changeFound = false;
		
		String big, small;
		if (a.length() >= b.length()) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		int smallI = 0;
		int bigI = 0;
		for (; smallI < small.length();) {
			if(big.charAt(bigI) != small.charAt(smallI)) {
				if(changeFound) return false;
				changeFound = true;
				if(countChange) {
					bigI++;
				}
				
			}
			smallI++;
			bigI++;
		}
		
		return true;
	}
	
	//Correct is almost the same expect assigning big/small is done with a ternary

}
