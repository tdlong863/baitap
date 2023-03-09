
import java.util.Scanner;

public class Slide30 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		n=sc.nextInt();
		int tong=0;
		while(n>0) {
			tong+=(n%10);
			n/=10;
		}
		System.out.println("Tong cac chu so: "+tong);

	}

}