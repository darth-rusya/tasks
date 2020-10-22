import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		int n = 0;
		for ( int i = string.length()-1; i >= 0; i--) {
			if ( string.charAt(i) == string.charAt(n) ) {
				n++;
			} else {
				System.out.println("Wrong");
				break;
			}
			if ( n == string.length() ) {
				System.out.println("Right");
				break;
			}
		}
	}
}