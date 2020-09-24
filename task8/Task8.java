public class Task8{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		float x = Float.parseFloat(args[1]);
		if (args.length == 2){
			if (n>0){
				double result = 0.0d;
				for (int i=n; i>0; i--){
					result = Math.cos(x+result);
				}
				System.out.println(result);
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}