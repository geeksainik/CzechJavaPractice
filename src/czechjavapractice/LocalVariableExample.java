package czechjavapractice;

public class LocalVariableExample {
	
	private int x; // instance varaible
	
	public void access(int a)
	{
		x=a;
	}
	
	public void display()
	{
		System.out.println("the value of x:" +x);
		//System.out.println("the value of a:"+ a); // it is a local variable so not accessible and giving error
	}
	

	public static void main(String[] args) {

		LocalVariableExample obj=new LocalVariableExample();
		obj.access(10);
		obj.display();
		
	}

}
