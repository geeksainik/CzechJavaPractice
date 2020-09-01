package czechjavapractice;

public class StaticVariablesExample {
	
	 static int x=10;
	public void display()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {

		StaticVariablesExample obj= new StaticVariablesExample();
		++obj.x;
		obj.display();
		
		StaticVariablesExample obj1=new StaticVariablesExample();
		obj1.display();
		
	}


}
