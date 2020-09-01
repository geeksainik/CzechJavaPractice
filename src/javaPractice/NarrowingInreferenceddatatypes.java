package javaPractice;

class One
{
	void show1()
	{
		System.out.println("Super Class Method");
	}
	
}

class Two extends One
{
	void show2() {
		
		System.out.println("This is Sub class Method");
	}
}




public class NarrowingInreferenceddatatypes {

	public static void main(String[] args) {
		
		/*Two t;
		
		t= (Two)new One();
		
		t.show1();*/
		One o;
		
		o=new Two();
		
		Two t= (Two) o;
		
		t.show1();
		t.show2();

	}

}
