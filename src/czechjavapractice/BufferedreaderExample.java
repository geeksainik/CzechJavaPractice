package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedreaderExample {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name");
		
		String name= br.readLine();
		System.out.println("enter age");
		int age= Integer.parseInt(br.readLine()); // it reads integer as int and returns it as string so we need to use convert by using Wrapper class because string is class and cannot be casted to integer directly(class to dat type conversions is not allowed)
		System.out.println("enter sex");
		char sex=(char) br.read();// read() reads value as char and returns it as integer in ASCII so we need to do casting
		br.skip(2);
		//char sex= br.readLine().charAt(0);
		System.out.println("enter place");
		
		String place= br.readLine();
		
		System.out.println("Name \t"+name+"\tage\t"+age+"\tsex\t"+sex+"\tplace\t"+place);
		
		
		
	}

}
