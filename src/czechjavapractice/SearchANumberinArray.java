package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchANumberinArray {

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
		
		System.out.println("Enter the number to search");
		int num=Integer.parseInt(br.readLine());
		boolean found=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
				System.out.println("Number found at location"+ (i+1));
			 found=true;
		}
		
		if(!found)
			System.out.println("Number not found");

	}

}
