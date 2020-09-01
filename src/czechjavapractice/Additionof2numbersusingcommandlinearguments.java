package czechjavapractice;

public class Additionof2numbersusingcommandlinearguments {
	
     public static void main(String args[])
         {
	
    	 int length= args.length;
    	 System.out.println(length);
    	 
    	String n1=args[0];
    	 String n2=args[1];
    	 
    	 int num1=Integer.parseInt(n1);
    	 int num2=Integer.parseInt(n2);
    	 int sum= num1+num2;
    	 System.out.println("sum=" + sum);
    
       }

}
