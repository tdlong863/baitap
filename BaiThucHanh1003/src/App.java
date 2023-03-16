
import java.util.Scanner;

public class App {

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
		int check;
		for(int i = 0 ; i < a.length - 1 ; i++) 
		{
			for(int j = i+1 ; j < a.length ; j++) 
			{
				if(a[i]>a[j]) 
				{
					check =a[i];
					a[i]=a[j];
					a[j]=check;
				}
			}
		}
		for(int i=0;i<n;i++) 
		{
			System.out.printf("%d  ",a[i]);
		}
	}
	
}
