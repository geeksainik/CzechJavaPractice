package javaPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import javax.swing.plaf.synth.SynthSpinnerUI;

interface Printer
{
	void printit(String s);
	void disconnect();
}

class IBMPrinter implements Printer
{
	public void printit(String s)
	{
		System.out.println(s);
	}
	
	public void disconnect()
	{
		System.out.println("Printing IBM completed");
		System.out.println("discconected");
	}

}

class EpsonPrinter implements Printer
{
	public void printit(String s)
	{
		System.out.println(s);
	}
	
	public void disconnect()
	{
		System.out.println("Printing completed");
		System.out.println("discconected");
	}
}

public class InterfaceExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		 FileReader fr= new FileReader("E:\\config.txt");
		 LineNumberReader lnr= new LineNumberReader(fr);
		 String printername=lnr.readLine();
		 System.out.println(printername);
		 Class c=Class.forName("javaPractice."+printername);
		 Printer ref=(Printer)c.newInstance();
		 ref.printit("Hello,this is printed on printer");
		 ref.disconnect();
	}

}
