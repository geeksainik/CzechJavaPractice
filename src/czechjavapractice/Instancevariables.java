package czechjavapractice;

public class Instancevariables {

	/*instance variables are available to object,and separate 
	copy of all the instance variables is given to the objects 
	if an value of one object's variable is changed also rest are not effected.*/
	/* static variables are not available to objects because 
	 * static methods are excuted first and then objects are created
	 */
	
	
	
	int x=10;
	public void display()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {

		Instancevariables obj= new Instancevariables();
		++obj.x;
		obj.display();
		
		Instancevariables obj1=new Instancevariables();
		obj1.display();
		
	}

}
