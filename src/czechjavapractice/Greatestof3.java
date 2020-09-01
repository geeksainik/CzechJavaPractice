package czechjavapractice;

import java.util.Scanner;

public class Greatestof3 {

	public static void main(String[] args) {

		System.out.println("Enter 3 Numbers to find greatest ");
		
		Scanner num= new Scanner(System.in);
		
		int a=num.nextInt();
		
		int b=num.nextInt();
		
		int c=num.nextInt();
		
		if(a>b && a>c)
			System.out.println(a +" is the greatest");
		
		else if(b>a && b>c)
		System.out.println(b +" is the greatest");
		
		else
			System.out.println(c +" is the greatest");
		
	}

}
