package stringPrograms;

public class ReverseTheString {
	
	public static void main(String[]args){

		String input= "LOKESH", output="";
		for(int i=input.length()-1;i>=0; i--) {
			
		output= output + input.charAt(i);}
	
		System.out.print(output);

} }
