package stringPrograms;

public class practice {
	public static void main(String args[]){
	//	 input= "This is velocity class
	//	output = sith si  yticolev ssalc
				
     //   System.out.println("This is velocity class");
        System.out.println();
		
        String l="This is velocity class" , g="" ;
  
 
        
			
	/*for (int i=l.length()-1; i>=0; i--){

				g =  g+ l.charAt(i) ;
			}
			//System.out.println( g); // ssalc yticolev si sith
			 
        String h[] = l.split(" ");
			
			  for (int j= h.length-1 ; j>=0 ; j--) {
			
				    System.out.print( h[j] +" ");
				  
			  }*/
        System.out.println("123456789000987654321");
        String s ="123456789000988654321" , p="";
        
        for (int i=s.length()-1; i>=0; i--){

		p =  p+ s.charAt(i) ;
	}  System.out.println(p);
	if ( s.equals(p)) {
		System.out.println("Given string is palindrom");
	}
	else {
		System.out.println("Given string is not palindrom");
	}
        
        
		
			 }
			 
}
