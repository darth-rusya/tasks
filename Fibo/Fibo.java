import java.util.Arrays;
public class Fibo {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if ( n > 0 ) {
			int[] array = new int[n];
			long startTimeOne = System.currentTimeMillis();
			for (int i = 0; i < n; i++) {
				if (i == 0 || i == 1) {
					array[i] = 1;
					continue;
				}	
				array[i] = array[i-1] + array[i-2];
			}
			long timeSpentOne = System.currentTimeMillis() - startTimeOne;
			System.out.println(array[n-1]);
			long startTimeTwo = System.currentTimeMillis();
			System.out.println(calcFib(n));
			long timeSpentTwo = System.currentTimeMillis() - startTimeTwo;
			if (timeSpentOne < timeSpentTwo){
					System.out.println("First programm was running faster than second");
				} else {
					System.out.println("Second programm was running faster than first");
				}	
		} else {
			System.out.println("Incorrect number");
		}
	}
	public static long calcFib(int nums) {
		if ( nums == 1 || nums == 2 ) {
			return 1;
		}
		if ( nums < 0 ) {
			return -1;
		}
		return calcFib(nums-2) + calcFib(nums-1);
	}
}