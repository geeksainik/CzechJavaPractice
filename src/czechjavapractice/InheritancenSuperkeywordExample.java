package czechjavapractice;

class Upper
{
	int i;
	Upper()
	{
		System.out.println("This is the Default Constructor of the super class");
	}
	
	Upper(int i)
	{
		this.i=i;
		System.out.println("This is the Parameterized Constructor of the Super class");
	}
}
class Lower extends Upper
{
	int i;
	
	Lower()
	{
		System.out.println("Default Constructor of subclass");
	}
	Lower(int x,int y)
	{
		super(x);
		i=y;
	}
	
	void show()
	{
		System.out.println("This is subclass i=" + i);
		System.out.println("This is Super Class i=" + super.i);
	}
}


public class InheritancenSuperkeywordExample {

	public static void main(String[] args) {
		
		Lower t1=new Lower();
		
		Lower t=new Lower(10,20);
		t.show();

	}

}
