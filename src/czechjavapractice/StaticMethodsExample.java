package czechjavapractice;

public class StaticMethodsExample {
	
	int x=10;
	static int y=20;
	
	void sum()
	{
		System.out.println("This is instance method");
	}
	
	static void add()
	{
		System.out.println("this is static method");
		StaticMethodsExample sme=new StaticMethodsExample();
		System.out.println(sme.x);
	}
	
	 
	void sub()
	{
		System.out.println(x);
		System.out.println(y);
		sum();
		add();
		
		
	}

	public static void main(String[] args) {
		
		StaticMethodsExample sme=new StaticMethodsExample();
		sme.sub();
		//add();

	}

}
