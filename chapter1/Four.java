package chapter1;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permPali("teste"));
	}
	
	//Mine
	public static boolean permPali(String s) {
		int[] arr = new int[128];
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		
		boolean oddFound = false;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]%2 == 1 && oddFound) return false;
			if(arr[i]%2 == 1) oddFound = true;
		}
		
		return true;
	}
	
	//Correct
	//My solution is the same but much simpler

}
