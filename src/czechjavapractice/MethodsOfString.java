package czechjavapractice;

public class MethodsOfString {

	public static void main(String[] args) {

		String s0="HYDERABAD"; 
		String s= "hyderabad";
		String s1= "hyderabad"; String a="hyd"; String d="bad";
		String s2="Kerala";
		String s3="Mumbai";
		
		//Concat
		
		String s4= s1.concat(s2);
		System.out.println("Concatination of 2 strings is :" +s4);
		
		//length of string
		
		int len= s1.length();
		System.out.println("the length of hyderabad is:"+ len);
		
		
		//CharAt
		
		char c= s1.charAt(5);
		System.out.println("Char at 5th index in hyderabad is:" + c);
		
		// CompareTo
		
	     int comp =s1.compareTo(s2);
	     System.out.println("comparision of 2 strings is:"+comp);
	     
	     //compareToIgnoreCase
	     
	     int comp1 =s1.compareToIgnoreCase(s2);
	     System.out.println("comparision  of Ignorecase 2 strings is:"+comp1);
	     
	     //equals
	     
	     boolean b= s.equals(s1);
	     System.out.println("Comparision of s & s1 is equal" + b );
	     
	     
	     //EqualsIgnorecAse
	     boolean b1=s0.equalsIgnoreCase(s);
	     System.out.println("Comparision of strings ignorecase is :"+ b1);
	     
	     //Starts with Ends with
	     
	     boolean b3= s1.startsWith(a);
	     boolean b4=s1.endsWith(d);
	     System.out.println(b3);
	     System.out.println(b4);
	     
	     //indexOf
	     int oc=s1.indexOf(a);
	     System.out.println("index of a in s1 is: " + oc);
	     
	     //replace
	     
	     String n= s3.replace('m', 'k');
	     System.out.println("the new replaced word is:"+n);
	     
	     //substring 
	     //Starting index starts with 0 & ending index starts with 1
	     
	     String ns= s1.substring(2);
	     System.out.println("extracted substring is:"+ ns);
	     
	     String ns1= s2.substring(1, 3);
	     System.out.println("get substring with begin & end index is:"+ns1);
	     
	     //toLower & toUpper
	     
	     String upp=s1.toUpperCase();
	     System.out.println("To Uppercase :"+upp);
	     
	     String low= s0.toLowerCase();
	     System.out.println("To lowercase:"+low);
	     
	     //split
	     
	     String x= "This is my book";
	     String ch[]=x.split(" ");
	    for(int i=0;i<ch.length;i++)
	    	System.out.println(ch[i]);
	     
	     // getchars , converting string into char array
	    
	    String y= "omsairam";
	    char arr[]= new char[10];
	    y.getChars(0, 5,arr ,0);
	    System.out.println(arr);
	    System.out.println("the char at 2nd index is:"+ arr[2]);
	    
	    
	     
	     
		
		
	}

}
