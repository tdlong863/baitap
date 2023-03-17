import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tong = 0 ;
		int n;
		String s ="";
		while(tong<=100);
		{
			 System.out.println("vui long nhap so nguyen");
			 n = scan.nextInt();
			 s = s + n +" ";
			 tong +=n;
		}
		String d = s.trim().replace(" ", " + ")+" = "+tong;
		System.out.println("tong cua cac so nguyen : "+d);
	}

}
