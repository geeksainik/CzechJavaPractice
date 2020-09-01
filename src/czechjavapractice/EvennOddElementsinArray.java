package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvennOddElementsinArray {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array");

		int size= Integer.parseInt(br.readLine());

		System.out.println("the size of array is:"+size);
		
		int arr[]= new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number into array");
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		System.out.println("Even numbers \t  Odd numbers");
			
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]%2==0)
		
			System.out.println(arr[i]);
			
			else
				System.out.println("\t"+arr[i]);
			 
		}
		
	}

}
