package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArrayExample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no.of rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("enter no.of coloumns");
		int col=Integer.parseInt(br.readLine());

		int arr[][]= new int[row][col];

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("enter arr ["+i+"]"+"["+j+"] element");
				arr[i][j]= Integer.parseInt(br.readLine());


			}
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// Enhanced loop
		
		for(int r[]:arr)
		{
			for(int a:r)
			{
                System.out.println(a);				
			}
		}
	}
}
