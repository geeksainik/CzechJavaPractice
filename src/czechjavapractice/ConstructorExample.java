package czechjavapractice;

public class ConstructorExample {
	
	int a,b; // instance variables
	
	ConstructorExample()
	{
		System.out.println("This is the default constructor & used only for initialization of instance variables not for processing data for it we use methods");
	}

	ConstructorExample(int x, int y)
	{
		System.out.println("this is the default constructor used to intialise instance variables,not for processing data for it we use methods");
	    a=x;
	    b=y;
	}
	
	public void sum()
	{
		System.out.println("The sum of a&b  is:" +(a+b));
	}
	

	public static void main(String[] args) {
		
		ConstructorExample obj=new ConstructorExample();
		ConstructorExample obj1= new ConstructorExample(5,7);
		obj1.sum();
		

		
	}

}
