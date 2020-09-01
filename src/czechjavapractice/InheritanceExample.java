
package czechjavapractice;

class Teacher
{
	int id;
	String name;
	String address;
	double sal;
	
	void setid(int i)
	{
	   this.id=i;
	   
	}
	
	int getid() 
	{
		return id;
	}
	
	void setname(String name)
	{
		this.name= name;
	}
	
	String getname()
	{
		return name;
	}
	
	void setaddress(String addres)
	{
		this.address=addres;
	}
	String getaddress()
	{
		return address;
	}
	
	void setsal(double sal)
	{
		this.sal=sal;
	}
	
	double getsal()
	{
		return sal;
	}
}

class Students extends Teacher
{
	int marks;
	
	void setmarks(int marks)
	{
		this.marks=marks;
	}
	
	int getmarks()
	{
		return marks;	
		}
	
}

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		Students s=new Students();
		s.setid(101);
		s.setname("Sai");
		s.setaddress("Kukutpally");
		s.setmarks(120);
		
		System.out.println(s.getid());
		System.out.println(s.getname());
		System.out.println(s.getaddress());
		System.out.println(s.getmarks());		

	}

}
