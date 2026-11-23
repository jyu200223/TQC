import java.util.Scanner;

public class JPD108 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			// TO DO
			double a = sc.nextDouble();
			System.out.println(f(a));

		} catch (Exception e) {
			System.out.print("error");
		}
	}

	public static double f(double x) {
		// TO DO
		return 2*x*x*x + 3*x - 1;
	}
}