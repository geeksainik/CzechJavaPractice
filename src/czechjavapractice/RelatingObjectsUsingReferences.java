package czechjavapractice;

class One{

	int x;
	Two t;

	One(Two t)
	{
		this.t=t;
		x=10;
	}

	void display()
	{
		System.out.println("One's class instance variable x=" +x);
		t.display();
		System.out.println("Two class instance variable y=" +t.y);
	}
}
class Two{

	int y;

	Two(int y){

		this.y=y;

	}

	void display()
	{
		System.out.println("Two class instance variable y=" +y);

	}

}

public class RelatingObjectsUsingReferences {

	public static void main(String[] args) {

		Two obj2= new Two(22);
		One obj1=new One(obj2);
		obj1.display();

	}

}
