import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ban muon nhap bao nhieu so");
		int n = scan.nextInt();
		int tong =0;
		for(int i = 1 ;i<=n ; i++) {
			System.out.println("nhap cac chu so");
			int so =scan.nextInt();
			tong = tong + so;
		}
		System.out.println("trung binh cong cua cac so nguyen da nhap la "+(tong/n));
	}

}
