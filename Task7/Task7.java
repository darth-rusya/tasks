public class Task7{

	public static void main(String[] args){
		if (args.length == 1){
			int Number = Integer.valueOf(args[0]);
			if (Number>0){
				int present = 1;
				int head_number = 1;
				double result = 0.0d;
				while(Number+1!=present){
					if (present%2!=0){
						result=result+1/Math.pow(head_number,2);
					}
					if (present%2==0){
						result=result-1/Math.pow(head_number,2);
					}
					head_number += 2;
					present += 1;
				}
				System.out.println("Result " + result);
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}
