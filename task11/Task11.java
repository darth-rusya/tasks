public class Task11{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		if (args.length==1){
			if (n>0){
				for (int i=1; i<=n; i++){
					System.out.println("");
					System.out.println("");
					for (int j=1; j<=n; j++){
						System.out.print(i*j+"\t");
					}
				}
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}