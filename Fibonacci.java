package recursion;
import java.util.Scanner;
public class Fibonacci {

	public static int findFib(int a) {
		if(a == 0)
			return 0;
		else if(a == 1)
			return 1;
		return (findFib(a - 1) + findFib(a - 2));
	}
	public static void main(String[] args) {
		System.out.println("Enter at what index you want the number in fibonacci series");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println(findFib(a));
	}

}
