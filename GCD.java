package recursion;
import java.util.Scanner;
public class GCD {

	public int gcd(int n1,int n2) {
		if( n1 % n2 == 0 ) {
			return n2;
		}
		else
		{
			return gcd( n2 , n1 );
		}
	}
	public static void main(String[] args) {
		GCD obj = new GCD();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(obj.gcd(a, b));
	}

}
