public class rusya{

	public static void main(String[] args){
		double result;
		int Number = Integer.valueOf(args[0]);
		int present = 1;
		int head_number = 1;
		result = 0;
		while(Number+1!=present){
			if (present%2!=0){
				result=result+1/Math.pow(head_number,2);
			}
			if (present%2==0){
				result=result-1/Math.pow(head_number,2);
			}
			head_number = head_number + 2;
			present = present + 1;
		}
		System.out.println(result);
	}

}
