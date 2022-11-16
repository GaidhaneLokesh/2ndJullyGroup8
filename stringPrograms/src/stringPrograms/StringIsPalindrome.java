package stringPrograms;

public class StringIsPalindrome {
	
	public static void main (String[]args) {
		
		String str="LOKESH", Reversestr="";
		for(int i= str.length()-1;i>=0; i--) {
			
			Reversestr = Reversestr +str.charAt(i);
			
		
		}
	   System.out.println(Reversestr);
	   if (Reversestr.equals(str))	{
			System.out.println("The string is Palindrome");
		}else {
			  System.out.println("The string is nor Palindrome");
		}
		

		
	}

}
