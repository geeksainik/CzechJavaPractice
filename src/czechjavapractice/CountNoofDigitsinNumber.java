package czechjavapractice;

import java.util.Scanner;

public class CountNoofDigitsinNumber {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner num=new Scanner(System.in);
		 int count=0;
		 int n=num.nextInt();
		 while(n!=0)
		 {
			n= n/10;
			 count++;
		 }
		
		 
		System.out.println("Number of Digits in the number =" +count );
	}

}
