package czechjavapractice;

public class BubbleSort {

	public static void main(String[] args) {
		int num[] = {5,1,4,2,8};

		for(int i=0; i<num.length-1; i++) {
			for (int j=0; j<(num.length-i-1); j++) {
				if(num[j] > num[j+1]) {
					int t = num[j+1];
					num[j+1] = num[j];
					num[j] = t;
				}
			}
		}
		for(int i=0; i<num.length; i++)
			System.out.println(num[i]);
	}
}
