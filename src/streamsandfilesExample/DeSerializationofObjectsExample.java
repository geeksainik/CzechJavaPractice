package streamsandfilesExample;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationofObjectsExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis=new FileInputStream("E:\\MyNewWorkspace\\czechjavapractice\\Employee.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Employee e;
		try {
			while((e = (Employee)ois.readObject())!= null)
			{
				e.display();
			}
		} catch (EOFException ee) {
			System.out.println("End of file reached");
		}finally{
			ois.close();
		}
		
	}

}
