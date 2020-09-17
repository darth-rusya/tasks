public class Task3 {

	public static void main(String[] args){
		double result;
		result = 1;
		int N = Integer.valueOf(args[0]);
		for (int i=1; i<=N; i+=2) {
		    result*=Math.pow(i+1,2)/(i*(i+2));
		}
		System.out.println(result*2);
	}
}