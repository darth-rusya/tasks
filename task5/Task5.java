public class Task5{
	public static void main(String[] args){
		int n = Integer.valueOf(args[0]);
		int x = Integer.valueOf(args[1]);
		if (args.length==2){
			if (n>0){
				double result = 0.0d;
				for (int i=n; i>0; i--){
					result = x/(i+1+result);
				}
				System.out.println(result+1);
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}