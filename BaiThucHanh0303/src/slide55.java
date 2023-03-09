import java.util.Scanner;

public class Slide47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, tong = 0;
		String str = "";
		do {
			System.out.println("nhap so:");
			n = sc.nextInt();
			tong += n;
			str += n + " ";
		} while(tong <= 100);
		str=str.trim().replace(" ", "+");
		System.out.println(str + " = " + tong);
		
	}

}