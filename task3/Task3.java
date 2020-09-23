public class Task3 {

	public static void main(String[] args){
		if (args.length==1){
			int n = Integer.valueOf(args[0]);
			if (n>0){
				double result = 1;
				for (int i=1; i<=n; i++) {
			    	double number = Math.pow(i*2,2);
			    	result *= number/(number-1);
				}
				System.out.println(result*2);
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}