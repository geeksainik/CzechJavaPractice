package czechjavapractice;

import java.util.Scanner;

public class MultiplicationTableof5 {

	public static void main(String[] args) {

		System.out.println("We are printing the multiplication table of 5");
		
		for(int i=1; i<=10 ; i++)
			
		{		System.out.println("5 * " + i + "=" + (5*i));
		         
		}
		
		System.out.println("we are printing the multiplication table of  the user entered number");
		System.out.println("enter a number");
		Scanner num= new Scanner(System.in);
		int j= num.nextInt();
		
        for(int i=1; i<=10 ; i++)
			
		{		System.out.println( j + "*" + i + "=" + (j*i));
		         
		}
	}

}
