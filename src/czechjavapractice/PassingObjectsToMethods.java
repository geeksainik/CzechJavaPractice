package czechjavapractice;

public class PassingObjectsToMethods {

	int id1,id2;
	
	PassingObjectsToMethods(int x, int y)
	{
		id1=x;
		id2=y;
	}
	
	public void swap(PassingObjectsToMethods obj)
	{
		int temp;
		temp=obj.id1;
		obj.id1=obj.id2;
		obj.id2=temp;
	}
	
	public static void main(String[] args) {
		
		PassingObjectsToMethods obj= new PassingObjectsToMethods(10,20);
		System.out.println("Before swap:"+obj.id1 +"&"+ obj.id2);
		obj.swap(obj);
		
		System.out.println("After swap:" + obj.id1+"&"+obj.id2);
		

		
	}

}
