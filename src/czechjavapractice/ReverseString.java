package czechjavapractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		
/*		String[] temp = s.split("");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=temp.length-1; i>=0; i--)
			sb.append(temp[i]);
		
		String rev = sb.toString();
		System.out.println(rev);
*/

		char str[]=new char[s.length()];
		s.getChars(0, s.length(), str, 0);
		
		char rev[]=new char[s.length()];
		
//		
//		int t = 0;
//		for(int i=str.length-1; i>=0; i--) {
//			rev[t] = str[i];
//			t++;
//		}
		
		
			for(int j=0;j<rev.length;j++)
			{
				rev[j]=str[str.length-1-j];
			}
		System.out.println(rev);
		
	}

}
