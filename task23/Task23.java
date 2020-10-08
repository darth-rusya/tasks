public class Task23{

	public static void main(String[] args){
		int line = Integer.parseInt(args[0]);
 		if (line>0){
			for (int i = 0; i <= line; i++){
				for (int j = 0; j < (line-i); j++){
					System.out.print(" ");
				}
				for (int k = 0; k < i; k++){
					System.out.printf("* ");
				}
				System.out.println();
			} 			
 		} else {
 			System.out.println("You enter incorrect number");
 		}
	}
}
//second code
/*	public static void main(String[] args){
		int line = Integer.parseInt(args[0]);
 		if (line>0){
			for (int i = 0; i <= line; i++){
				for (int j = 0; j < (line-i); j++){
					System.out.print(" ");
				}
				for (int k = 0; k < i; k++){
					System.out.printf("*");
				}
				for (int l = 0; l < (i-1); l++){
					System.out.print("*");
				}
				System.out.println();
			} 			
 		}
	}
*/