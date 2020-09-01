package czechjavapractice;

class Overload{
	
	void sum(int x)
	{
		
		System.out.println(x);
	}
	
	void sum(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
	
	void sum(int x,int y,int z)
	{
		int res1=x+y+z;
		System.out.println(res1);
	}
	
}				
				
public class DynamicOverloadingExample 
{

	public static void main(String[] args) 
	{
		Overload obj=new Overload();
		obj.sum(10);
		obj.sum(20, 30);
		obj.sum(40, 20, 10);
		
		
		
	}
		
		

	

}
