package chapter1;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] r = urlify("Mr John Smith    ".toCharArray(), 13);
		for (int i =0; i < r.length; i++) {
			System.out.print(r[i]);
		}
	}
	
	//Mine
	public static char[] urlify(char[] s, int c) {
		
		int e = s.length - c;
		
		for(int i = s.length -1; e > 0; i-- ) {

			if(s[i-e] != ' ') {
				
				s[i] = s[i-e];
			} else {
				
				s[i] = '0';
				s[i-1] = '2';
				s[i-2] = '%';
				i = i -2;
				e =e -2;
			}	
		}
		
		return s;
	}
	
	//Correct
	public static char[] urlifyC(char[] str, int length) {
		
		int spaceCount = 0, newLength, i;
		
		for (i = 0; i <length; i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if(str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength -1;
			}
		}
		
		return str;
		
	}
	
}
