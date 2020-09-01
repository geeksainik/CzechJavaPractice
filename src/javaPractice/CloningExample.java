package javaPractice;

class Employee implements Cloneable
{
	int id;
	String name;
	
	Employee(int i,String s)
	{
		this.id=i;
		this.name=s;
	}
	
	void getData()
	{
		System.out.println("Id="+id);
		System.out.println("Name"+ name);
	}
	
	public Object myclone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class CloningExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1= new Employee(10,"SaiBaba");
		System.out.println("Details Before clone:");
		e1.getData();
		Class c=e1.getClass();
		System.out.println(c.getName());

		Employee e2= new Employee(20,"Omsairam");
		e2.getData();
		
		System.out.println("After cloning Details:");
		Employee e3= (Employee) e1.myclone();
		e3.getData();
		
		Employee e4= (Employee)e2.myclone();
		
		e4.getData();
		
	}

}
