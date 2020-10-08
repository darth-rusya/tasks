import java.util.Scanner;
public class Task20{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Long n = input.nextLong();
		if (n>1){
			int k = 2;
			while ( n > 1 ){
				if ( n % k == 0 ){
					System.out.print(k + " ");
					n /= k;
				} else {
					k++;
				}
			}
		} else {
			System.out.println("Enter a natural number");
		}
	}
}