package javaPractice;

interface Father
{
	float HT=6.0f;
	void height();
	
}
interface Mother
{
	float HT=5.2f;
	void height();
}

class Child implements Father , Mother
{
	public void height()
	{
		float HT=(Father.HT+Mother.HT)/2;
		System.out.println("Avg height of the child is:" + HT);
	}
}

public class MultipleInheritanceUsingInterfaces {

	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.height();

	}

}
