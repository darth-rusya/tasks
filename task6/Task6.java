public class Task6{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double sum = 0.0d;
		for (int i = 1; i <= n; i++){
			double resultOne = 1.0d;
			for (int j = 1; j < i; j++){
				resultOne *= j;
			}
			double resultTwo = 1.0d;
			for (int k = i; k <= (2*i); k++){
				resultTwo *= k;
			}
			sum += resultOne/resultTwo;
		}
		System.out.println(sum);
	}
}