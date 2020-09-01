package czechjavapractice;

class Squared{
	static void calcu(double x)
	{
		System.out.println("Square of x:" + (x*x));
	}
}
class Squareroot extends Squared
{
	static void calcu(double x)
	{
		System.out.println("Squareroot of x:"+ Math.sqrt(x));
	}
}


public class StaticPolymorphismwithStaticMethods {

	public static void main(String[] args) {
		
		Squared s= new Squareroot();
		s.calcu(8);
		
		Squareroot sr=new Squareroot();
		sr.calcu(25);

	}

}
