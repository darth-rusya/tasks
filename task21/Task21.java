import java.util.Scanner;

public class Task21{

	public static void main(String[] args){
     	int[] array = new int[2];
     	Scanner input = new Scanner(System.in);
     	for (int i = 0; i < array.length; i++){
     		array[i] = input.nextInt();
     	}
          if (array[0]*array[1]>0){
               int common = array[0] * array[1];
               for (int i = 1; i <= common; i++){
                    if (i%array[0]==0 && i%array[1]==0){
                         common = i;
                         break;
                    }
               }
          } else {
               System.out.println("Enter a natural number");
          }
          System.out.println(common);
	}
}