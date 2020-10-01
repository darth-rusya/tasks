public class Indexofv2{

	public static void main(String[] args){
		String string = args[0];
		String substring = args[1];
		if (string.length()!=0){
			if (substring.length()!=0){
				int n = 0;
				for (int i = 0; i < string.length(); i++){
					int p = (int) string.charAt(i);
					int l = (int) substring.charAt(n);
					if (p==l || Math.abs(p-l)==32){
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
			} else {
				System.out.println("Incorrect length of substring");
			}
		} else {
			System.out.println("Incorrect length of string");
		}

	}
}