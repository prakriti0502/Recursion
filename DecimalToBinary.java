package recursion;
import java.util.Scanner;
public class DecimalToBinary {

	public static void convert(int n) {
		if(n > 0)
		{
			convert(n / 2);
			System.out.print(n % 2); 
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		convert(a);
	}

}
