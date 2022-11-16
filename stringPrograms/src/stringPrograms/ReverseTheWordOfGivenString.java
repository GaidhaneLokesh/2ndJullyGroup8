package stringPrograms;

public class ReverseTheWordOfGivenString {
public static void main(String[]args) {
	
	String lg = "This is given string" ,hh="";
   
	System.out.println("INPUT="+lg);
	System.out.println("OUTPUT=");
	
	String []bg = lg.split(" ");
	
    for(int i= bg.length-1 ; i>=0 ; i-- ) {
    	
    	hh = hh+ bg[i]+" ";
    
    	
    }System.out.print(hh);
 
	
}
}
