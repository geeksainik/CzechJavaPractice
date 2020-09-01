package streamsandfilesExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class SerializationofObjectsExample {
	
	public static void main(String[] args) throws IOException {
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 FileOutputStream fos= new FileOutputStream("E:\\MyNewWorkspace\\czechjavapractice\\Employee.txt");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 
		 System.out.println("Enter no.of objects?");
		 
		 int n= Integer.parseInt(br.readLine());
		 
		 for(int i=0;i<n;i++)
		 {
			 Employee e1=Employee.getData();
			 
			 oos.writeObject(e1);
		 }
		 oos.close();
		
	}

}
