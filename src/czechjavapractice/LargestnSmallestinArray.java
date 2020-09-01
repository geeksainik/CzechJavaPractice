package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestnSmallestinArray {

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
		int large = arr[0];
		int small = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
				large=arr[i];
			else if(small>arr[i])
				small=arr[i];
		}
		System.out.println("The Largest of the Array is:"+ large);
		System.out.println("The Smallest of the Array is:"+ small);
	}

}
