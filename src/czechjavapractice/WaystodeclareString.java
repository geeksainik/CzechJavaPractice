package czechjavapractice;

public class WaystodeclareString {

	public static void main(String[] args) {
         
		// First way
		String s= "Hello";
		System.out.println(s);
		
		//2nd way
		
		String s1= new String("Hello");
		System.out.println(s1);
		
		//3rd way converting an character array into String
		 
		char s2[]= {'t','a','b','l','e'};
		
		String s3= new String(s2);
		
		System.out.println(s3);
		
		String s4= new String(s2,1,4);
		
		System.out.println(s4);
		
		
		
	}

}
