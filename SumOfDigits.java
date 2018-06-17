package recursion;
import java.util.Scanner;
public class SumOfDigits {
	public static int sum(int n)
	{
		if(n == 0)
			return 0;
		return n % 10 + sum(n / 10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println("The sum of digits is: " + sum(a));
	}

}
