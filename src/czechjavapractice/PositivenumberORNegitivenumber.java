package czechjavapractice;

import java.util.Scanner;

public class PositivenumberORNegitivenumber {

	public static void main(String[] args) {
     
		System.out.println("Enter a Number to check if it is +ve or _ve");
		
		int num;
		
	   Scanner number=new Scanner(System.in);
	  
	     num=number.nextInt();
	     
	     if(num>0)
	     {
	    	 System.out.println("Number is +ve");
	     }
	     
	     else if (num==0)
	    	 System.out.println("Number is 0");
	     else
	    	 System.out.println("Number is -ve");
	   
	  
		
		
	}

}
