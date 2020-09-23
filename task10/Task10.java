public class Task10{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		if (args.length == 1){
			if (n>0){
				for (int i=1; i<=n; i++){
					System.out.print("* ");
					int x = n-2;
					while (x>0){
						System.out.print("* ");
						x-=1;
					}
					System.out.println("* ");
				}
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}