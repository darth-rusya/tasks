import java.util.*;
public class Task27{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sizeFirstList = Integer.parseInt(args[0]);
		int sizeSecondList = Integer.parseInt(args[1]);
		int[] array = new int[sizeFirstList];
		int[] subarray = new int[sizeSecondList];
		System.out.println("Enter numbers separated by space for the first array ");
		for (int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		System.out.println("Enter numbers separated by space for the second array ");
		for (int j = 0; j < subarray.length; j++){
			subarray[j] = input.nextInt();
		}
		int n = 0;
		for ( int k = 0; k < array.length; k++ ){
			if (array[k] == subarray[n]){
				n++;
			} else {
				n = 0;
			}
			if (n==subarray.length){
				k -= n-1;
				System.out.println(k);
				break;
			}
		}
		if (n==0){
			System.out.println(-1);
		}
	}
}
