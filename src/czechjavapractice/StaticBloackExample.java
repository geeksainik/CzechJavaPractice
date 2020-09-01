package czechjavapractice;

public class StaticBloackExample {
	
	/* static block is the piece of code that is excuted even before main method
	 * jvm will execute the main method only after completion of execution of the static block code
	 * so we can execute & compile a program even without the main method by using the static block,
	 * but after completion of execution of static block if main() method is not present it will display an error
	 * NosuchmethodError:main
	 * 
	 */
	
	static {
		System.out.println("This is the static block of code");
	}

	public static void main(String[] args) {
		
		System.out.println("This is the code in main method");

		
		
	}

}
