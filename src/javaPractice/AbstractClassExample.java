package javaPractice;

import java.util.Date;

/**
 * 
 * @author MyWorld
 *
 */

abstract class Myclass
{
	/**
	 * 
	 * @param x
	 */
	abstract void calculate(double x);
}

class sub1 extends Myclass
{
	/**
	 * 
	 */
	void calculate(double x)
	{
		System.out.println("The square of the number is:" +(x*x));
	}
	
}

class sub2 extends Myclass
{
	void calculate(double x)
	{
		System.out.println("The Squareroot of the number is:"+ Math.sqrt(x));
	}
}

class sub3 extends Myclass
{
	void calculate(double x)
	{
		System.out.println("cube of the number is:"+(x*x*x));
	}
}

public class AbstractClassExample {
	
	
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		
		
		sub1 obj1=new sub1();
		sub2 obj2=new sub2();
		sub3 obj3=new sub3();
		
		obj1.calculate(5);
		obj2.calculate(625);
		obj3.calculate(8);
		
		Myclass ref; // object cannot be created to abstract class due to incomplete methods,so only reference can be created
		
		ref=obj1;
		ref.calculate(6);
		Date d=new Date();
		System.out.println(d);

	}

}
