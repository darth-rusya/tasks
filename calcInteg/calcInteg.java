import java.util.Scanner;

public class calcInteg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of segments");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("Enter limits: left variable, right variable");
			double xA = sc.nextDouble();
			double xB = sc.nextDouble();
			if (xA < xB) {
				double dx = (xB-xA)/n;
				System.out.println("Method of Rectangle: " + calcSquareRectangle(xA, xB, dx));
				System.out.println("Method of Trapeze: " + calcSquareTrapeze(xA, xB, dx));
				System.out.println("Simpson's method: " + calcSimpson(xA, xB));			
			} else {
				System.out.println("The first variable must be large than the second");
			}
		} else {
			System.out.println("Enter the pozitive number");
		}
	}
	public static double calcSquareRectangle(double x1, double x2, double x3) {
		double x0 = x1;		
		double sum = 0.0;
		while (x0 <= x2) {
			sum += x3*calcFunc(x0);
			x0 += x3;
		}
		return sum;
	}
	public static double calcSquareTrapeze(double x1, double x2, double x3) {
		double x0 = x1;
		double sum = 0.0;
		while (x0 < x2) {
			sum += (x3*(calcFunc(x0)+calcFunc(x0+x3)))/2.0;
			x0 += x3;
		}
		return sum;
	}
	public static double calcSimpson(double x1, double x2) {
		double x0 = x1;
		double sum = 0.0;
		sum = (((x2-x0) / 6) * (calcFunc(x0) + 4*calcFunc((x0+x2)/2) + calcFunc(x2)));
		return sum;
	}
	public static double calcFunc(double x) {
		double y = x*x;
		return y;
	}
}