import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		System.out.println("Nhap ho ten:");
		b=sc.nextLine();
		System.out.println("Nhap nam sinh :");
		a=sc.nextInt();
		if((2023-a) < 16) System.out.println(b + " o do tuoi vi thanh nien");
		else if((2023-a) >= 16 && (2023-a) < 18) System.out.println(b + " o do tuoi truong thanh");
		else System.out.println(b + " da gia");
	}
}