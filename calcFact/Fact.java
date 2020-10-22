public class Fact {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n>=0) {
			int t = n;
			long result = 1;
			if (t == 0){
				result = 1;
			}
			long startTimeOne = System.currentTimeMillis();
			while (t > 0) {
				result*=t;
				t--;
			}
			long timeSpentOne = System.currentTimeMillis() - startTimeOne;
			System.out.println(result);
			long startTimeTwo = System.currentTimeMillis();
			System.out.println(calcFact(n));
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
 	public static long calcFact(int nums) {
  		if ( nums == 0) {
 			return 1;
 		}
 		if ( nums < 0 ) {
 			return -1;
 		}
 		return nums * calcFact(nums-1);
 	}
}

