package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchAStringInStringArray {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array");

		int size= Integer.parseInt(br.readLine());

		System.out.println("the size of array is:"+size);

		String str[]= new String[size];


		for(int i=0;i<str.length;i++)
		{
			System.out.println("enter the word");
			String s=br.readLine();
			System.out.println("your entered \t"+(i+1)+"\t word is:" +s);
			System.out.println("Is this the word you wanted to enter or do you want to change it?");

			System.out.println("If you want to change press 'y',if no press 'n'");

			while(true) {
				String ch=br.readLine();
				if(ch.equals("y"))
				{
					System.out.println("Please re-enter the word");
					i--;
					break;
				}
				else if(ch.equals("n")) {
					str[i]=s;
					break;
				}
				else
				{
					System.out.println("you enter and invalid character");
					System.out.println("If you want to change press 'y',if no press 'n'");

				}
			}
			//		
			//			if(str[i].equals(""))
			//				i--;
		}

		System.out.println("enter word to search");

		String searchword= br.readLine();
		boolean found= false;

		for(int i=0;i<str.length;i++)
		{
			if(searchword.equalsIgnoreCase(str[i]))				
				System.out.println("Search word found at location:" + (i+1));
			found=true;
		}

		if(!found)
			System.out.println("Word not found");
	}

}
