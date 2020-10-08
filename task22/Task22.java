public class Task22{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		if (args.length!=2){
			int t = n;
			int k = m;
			long startTimeOne = System.currentTimeMillis();
			while (k-t!=0){
				if (k>t){
					k-=t;
				} else if(k<t){
					t-=k;
				}
			}
			long timeSpentOne = System.currentTimeMillis() - startTimeOne;
			System.out.print(k + " ");
			int l = 1;
			long startTimeTwo = System.currentTimeMillis();
			for (int i = 1; i <= n || i <= m; i++){
				if (n%i==0 && m%i==0 && i>l){
					l = i;
				}
			}
			long timeSpentTwo = System.currentTimeMillis() - startTimeTwo;
			System.out.println(l);
			if (timeSpentOne < timeSpentTwo){
				System.out.println("First programm was running faster than second");
			} else {
				System.out.println("Second programm was running faster than first");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}