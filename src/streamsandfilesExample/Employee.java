package streamsandfilesExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	
	private int id;
	private String name;
	private float sal;
	private Date doj;
	 Employee(int i, String s, float sal, Date d)
	 {
		 id=i;
		 name=s;
		 this.sal=sal;
		 doj=d;
	 }
	 
	 void display()
	 {
		 System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
	 }
	 static Employee getData() throws IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("Enter the ID of employee:");
		 int id=Integer.parseInt(br.readLine());
		 
		 System.out.println("Enter name of Employee:");
		 String name= br.readLine();
		 
		 System.out.println("Enter salary:");
		 float sal= Float.parseFloat(br.readLine());
		 
		 Date d= new Date();
		 
		 Employee e= new Employee(id,name,sal,d);
		 
		 return e;
		 
	 }

}
