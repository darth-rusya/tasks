import java.util.*;

public class Task26{

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