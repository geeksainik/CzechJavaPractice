package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneDimensionalarrayexample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//To find the percentage of a student
		
		/*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int subject;
		float tot=0;
		float percent;
		
		System.out.println("enter total no.of subject");
		
		subject=Integer.parseInt(br.readLine());
		
		int marks[]= new int[subject];
		
		for(int i=0;i<subject;i++)
		{
			System.out.println("enter marks");
			marks[i]=Integer.parseInt(br.readLine());
		
		}
		System.out.println("length of array" +marks.length); 
		for(int i=0;i<subject;i++)
			 tot += marks[i];
		
		percent=tot/subject;
		
		System.out.println("percentage is:"+ percent); */
		
		// one dimensional character array
		
		char a[]= {'c','h','a','i','r'};
		System.out.println(a);
		
	}

}
