package recursion;
import java.util.Scanner;
public class Inc_no {
	public static void inc(int n)
	{
		if(n == 0)
		{
			return;
		}
		inc(n-1);
		System.out.println(n);
		//inc(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		inc(a);
	}

}
