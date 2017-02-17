import java.util.*;
public class palindrome {

	//private static Scanner s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String str = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
	    str = input.nextLine();
		
	    if(str == null || str.isEmpty())
	    {
	    	throw new NullPointerException();
	    }
	    
		boolean result = checkPalindrome(str);
		System.out.println("Entered string is a palindrome:" + result);
	}
	
  
	public static String removeSpaces(String input) {
		// the below code removes spaces and converts the string to lowercase
		String output = input.replaceAll("\\s+","");
		output = output.toLowerCase();
		
		return output;
	}
	
	public static boolean checkPalindrome(String input) { // the code below checks if string is a palindrome or not
		String newstr = removeSpaces(input);
		char arr[] = newstr.toCharArray();
		int j = arr.length-1;
		for (int i = 0; i < j; i++, j--) {
			if(arr[j] != arr[i]) {
				return false;
			}
		}	
		for (int i = 0; i <= arr.length/2;i++) {
			if (!( (arr[i] >= '0' && arr[i] <= '9') || (arr[i] >= 'a' && arr[i] <= 'z') ))  {
				return false;
			}
		}
		return true;		
		
	}
}
