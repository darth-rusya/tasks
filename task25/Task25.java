import java.util.Arrays;

public class Task25{

	public static void main(String[] args){
		int size = Integer.parseInt(args[0]);
		int[] array = new int[size];
		for (int i=0; i < array.length; i++){
			array[i] = ((int)(Math.random()*100));
		}
		System.out.println(Arrays.toString(array));
		for (int k=0; k < array.length; k++){
			for (int l = 0; l < array.length; l++){
				if (array[k]<array[l]){
					int t = array[k];
					array[k] = array[l];
					array[l] = t;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}