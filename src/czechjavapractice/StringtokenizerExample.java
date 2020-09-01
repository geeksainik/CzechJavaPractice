package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringtokenizerExample {

	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter Name,age,salary,sex,place");
		
		String str= br.readLine();
		
		StringTokenizer st= new StringTokenizer(str,",");
		
		String name= st.nextToken();
		int age = Integer.parseInt(st.nextToken());
		float sal= Float.parseFloat(st.nextToken());
		char sex=st.nextToken().charAt(0);
		String place=st.nextToken();
		
		System.out.println("Name,Age,Salary,Sex,Place are:" + name+"\t"+ age+"\t"+sal+"\t"+sex+"\t"+place);
		
		
	}

}
