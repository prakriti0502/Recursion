package recursion;
import java.util.Scanner;
public class BinarySearch {

	public static int binary(int [] arr,int val, int low, int high)
	{
		if(low > high)
			return -1;
		int mid = (low + high)/2;
		if(val == arr[mid])
			return mid;
		else if(val < arr[mid])
			return binary(arr,val,low,mid-1);
		else if(val > arr[mid]) {
			return binary(arr,val,mid+1,high);
		}
		return mid;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter elements in sorted fashion");
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value to be searched");
		int v = sc.nextInt();
		sc.close();
		System.out.println("The value "+ v + " is at index " + binary(arr,v,0,n-1));
	}

}
