package czechjavapractice;

class Override{
	
	int x;
	
	void square(int x) 
	{
		System.out.println("the square of num is:" + (x*x));
	}
}

class Overridden extends Override
{
	double x;
	void square(int x)
	{
		System.out.println("the squareroot of num:" + Math.sqrt(x));
	}
}


public class DynamicOverridingExample {

	public static void main(String[] args) {
		
		Override ov=new Overridden();
		
		ov.square(25); // only subclass method is called superclass method is overridden
		
		//Overridden or=new Overridden();
		
		//ov.square(25);

	}

}
