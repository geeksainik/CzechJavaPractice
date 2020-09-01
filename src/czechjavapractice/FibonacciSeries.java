package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Fibonacci Series is 0,1,1,2,3,5,8,13....
		
		int f1=0;
		int f2=1;
		int count=1;
		System.out.println("enter count for series");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int n= Integer.parseInt(br.readLine());
		
	 System.out.println(f1);
		System.out.println(f2);
	 while(count<n)
		{
			int f=f1+f2;
			System.out.println(f);
			f1=f2;
			f2=f;
			count++;
			
		}
	}

}
