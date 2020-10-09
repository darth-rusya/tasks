import java.util.*;

public class Task26{

	public static void main(String[] args){
	 	Scanner input = new Scanner(System.in);
	 	System.out.println("Enter the number");
	 	int size = input.nextInt();
	 	int array[][] = new int[size+1][size+1];
	 	for (int i = 0; i <= size; i++){
	 		for (int j = 0; j <= size; j++){
	 			array[i][j] = 0;
	 		}
	 	}
	 	int l = 1;
		for (int i = 1; i <= size - size/2; i++) {
			l = l * (size/2 + i) / i;
		}
		l = (int)(Math.log(l) / Math.log(10)); 
		l += 2 + l%2;
		System.out.println(l);
	 	array[0][0] = 1;
		for (int i = 1; i <= size; i++){
			for (int j = 0; j <= i; j++){
				if (j==0 || i==j){
					array[i][j] = 1;
				} else {
					array[i][j] = array[i-1][j] + array[i-1][j-1];
				}
			}
		}	
		for (int i = 0; i <= size; i++){
			for (int j = i; j <= (size*2-1)/2; j++) {
				for (int k = 0; k < l/2; k++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j <= i; j++){
				System.out.printf("%" + l + "d", array[i][j]);
			}
			System.out.println();
		}
	}
}
/*public class Task26{

	static long factorial(int k){
		long result = 1; 
		for (int i = 1; i <= k; i++){
			result*=i;
		}
		return result;
	}
	public static void main(String[] args){
		int line = Integer.parseInt(args[0]);
		if (line>0){
			for (int i = 0; i < line; i++){
				for (int l = 0; l < (line-i); l++){
					System.out.print("    ");
				}
				for (int j = 0; j <= i; j++){
					System.out.printf("%8d", factorial(i)/((factorial(i-j)*factorial(j))));
				}
				System.out.println();
			}
		} else {
			System.out.println("Incorrect number");
		}
	}
}
*/