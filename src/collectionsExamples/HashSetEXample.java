package collectionsExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEXample {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("India");
		hs.add("America");
		hs.add("China");
		hs.add("Prague");
		hs.add("Canada");
		hs.add("India");
		
		System.out.println("Elements in hashset are:" +hs);
		System.out.println(hs.size());
		
		Iterator is=hs.iterator();
		
		while(is.hasNext())
		{
			String s=(String) is.next();
			System.out.println(s);
		}
		
		

	}

}
