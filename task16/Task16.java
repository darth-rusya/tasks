public class Task16{
	public static void main(String[] args){
		int n = Integer.valueOf(args[0]);
		if (args.length==1){
			if (n>=0){
				int result = 0;
				int d = 1;
				while (n>0){
					result += d*(n%2);
					n /= 2;
					d *= 10;
				}
				System.out.println("Result " + result);
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}