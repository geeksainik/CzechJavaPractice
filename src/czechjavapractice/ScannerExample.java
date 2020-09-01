package czechjavapractice;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("enter name,sal,age");
		Scanner sc=new Scanner(System.in);
		System.out.println("name" +sc.next());
		System.out.println("sal"+sc.nextFloat());
		System.out.println("age="+sc.nextInt());
		 
		
		
	}

}
