import java.util.Scanner;

public class JPD104 {

	public static void main(String[] args) {

		try {
			double x1, x2, y1, y2;
			Scanner sc = new Scanner(System.in);

			// TO DO

			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();

			double dx = (x1 - x2);
			double dy = (y1 - y2);
			double d = Math.sqrt(dx*dx + dy*dy);
			System.out.printf("%.4f",d);

		} catch (Exception e) {
			System.out.print("error");
            System.exit(0);
		}
	}
}
