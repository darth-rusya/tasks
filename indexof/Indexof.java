public class Indexof{

	public static void main(String[] args){
		String string = args[0];
		String substring = args[1];
		int n = 0;
		for (int i = 0; i < string.length(); i++){
			if (string.charAt(i)==substring.charAt(n)){
				n++;
			} else {
				n = 0;
			}
			if (n==substring.length()){
				i-=n-1;
				System.out.println(i);
				break;
			}
		}
		if (n==0){
			System.out.println(-1);
		}
	}
}
