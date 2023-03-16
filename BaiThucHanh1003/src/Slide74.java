
import java.util.Scanner;

public class Slide74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap kich thuoc cua mang: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.printf("Arr[%d] = ",i);
			a[i] = sc.nextInt();
		}
		int tong = 0;
		System.out.println("Cac phan tu chan trong mang:");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0) 
			{
				System.out.printf(a[i] + "  ");
				tong+=a[i];
			}
		}
		System.out.println("\nTong cac phan tu chan trong mang = " + tong);
	}

}