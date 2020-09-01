package czechjavapractice;

public class ClassesnObjects {
	
	
	public void display()
	{
		System.out.println("this is how methods are called using objects");
	}

	public static void main(String[] args) {
		
		ClassesnObjects obj= new ClassesnObjects();
		obj.display();
		System.out.println("This the hashcode or unique reference no.of object \t" + obj.hashCode());

		
	}

}
