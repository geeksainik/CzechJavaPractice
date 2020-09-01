package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArrayexample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int students[][] = new int[3][5];
		
		System.out.println("enter student marks");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("enter mark");
				students[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(students[i][j] +"\t");
				
			}
			System.out.println();
		}
	}

}
