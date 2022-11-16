package stringPrograms;

public class ReverseTheWordOfString {

	public static void main(String[]args) {
		
		String ll="THIS IS LOKESH GAIDHANE", bg="";
		
		
		
		for(int i=ll.length()-1;i>=0; i-- ) {
			
			bg=bg+ ll.charAt(i);
		}
		System.out.print(bg);
		/*System.out.println();
		String[]lk= bg.split(" ");
		for(int j=lk.length-1; j>=0; j--) {
			
			System.out.print(lk[j]+" ");
		}*/
	
		
	}
}
