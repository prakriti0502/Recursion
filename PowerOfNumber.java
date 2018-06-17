package recursion;
import java.util.Scanner;
public class PowerOfNumber {

	public static int power(int a,int n)
	{
		if(n == 0)
			return 1; 
		return a*power(a,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int d = sc.nextInt();
		System.out.println("Enter the power");
		int p = sc.nextInt();
		sc.close();
		System.out.println(power(d,p));
	}

}
