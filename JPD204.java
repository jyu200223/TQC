import java.util.Scanner;

public class JPD204 {
	static boolean prime(int n){
		if(n==1) return false;
		for(int i=2;i<n;i++){
			if(n%i == 0)return false;
		}
		return true;
	}

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		// TO DO
		int a,b;
		try {
			// TO DO
			a = sc.nextInt();
			b = sc.nextInt();
			if (a<1 || b>100) throw new Exception();
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
		// TO DO
		
			for(int i=a;i<b;i++){
			if(prime(i)){
				System.out.println(i);
			}
		}
		}  
		
		

             
	

}
