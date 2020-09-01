package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Additionof2Matrices {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int row2;
		int col2;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no.of rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("enter no.of coloumns");
		int col=Integer.parseInt(br.readLine());

		int arr1[][]= new int[row][col];

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("enter arr ["+i+"]"+"["+j+"] element");
				arr1[i][j]= Integer.parseInt(br.readLine());


			}
		}
		printMatrix(1, row, col, arr1);

		System.out.println("enter 2nd Array details");
		System.out.println("enter no.of rows");
		int row1=Integer.parseInt(br.readLine());
		System.out.println("enter no.of coloumns");
		int col1=Integer.parseInt(br.readLine());

		int arr2[][]= new int[row1][col1];

		for(int k=0;k<row1;k++)
		{
			for(int l=0;l<col1;l++)
			{
				System.out.println("enter arr ["+k+"]"+"["+l+"] element");
				arr2[k][l]= Integer.parseInt(br.readLine());


			}
		}
		printMatrix(2, row1, col1, arr2);


		row2=(row>row1)?row:row1;
		col2=(col>col1)?col:col1;
		int arr3[][]= new int[row2][col2];

		for(int m=0; m<row2;m++)
		{
			for(int n=0;n<col2;n++)
			{
				int var1=(m<row && n<col)?arr1[m][n]:0;
				int var2=(m<row1 && n< col1)? arr2[m][n]:0;

				arr3[m][n]=var1+var2;
			}
		}

		printMatrix(3, row2, col2, arr3);
	}

	private static void printMatrix(int n, int row, int col, int[][] array) {
		System.out.println("Elements of " + n + " Array are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
