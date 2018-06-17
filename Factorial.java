package recursion;
import java.util.Scanner;
public class Factorial {

	public static int find_fac(int n)
	{
		if(n == 1)
			return 1;
		int s = find_fac(n-1);
		return n*s;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println(find_fac(a));
	}

}
