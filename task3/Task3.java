public class Task3 {

	public static void main(String[] args){
		double result = 1;
		int N = Integer.valueOf(args[0]);
		for (int i=1; i<=N; i++) {
		    double Number = Math.pow(i*2,2);
		    result *= Number/(Number-1);
		}
		System.out.println(result*2);
	}
}