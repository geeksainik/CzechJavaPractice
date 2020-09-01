package czechjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class BankAcc{

	private double bal;

	BankAcc(double bal)
	{
		this.bal= bal;
	}

	void Contact(double r) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the password");

		String password= br.readLine();

		if(password.equals("xyz123"))
		{
			Interest in=new Interest(r);
			in.calculateInterest();
		}
		else
		{
			System.out.println("you are not authorized person");
			return;
		}
	}

		private class Interest
		{
			private double rate;

			Interest(double r)
			{
				rate=r;
			}

			void calculateInterest()
			{
				double interest=bal*rate/100;

				bal+=interest;

				System.out.println("Updated Balance="+ bal);

			}

		}


	}

public class RelatingObjectsthroughInnerClasses 
{
	public static void main(String[] args) throws IOException 
	{
		
		
		BankAcc account= new BankAcc(10000);
		account.Contact(9.5);
		
		
	}
		
		
		
		
}
		
		
	

	


