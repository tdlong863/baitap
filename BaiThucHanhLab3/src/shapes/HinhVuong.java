package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
	public HinhVuong() {
		ten = "Hinh Vuong";
	}
	public void NhapLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai canh:");
		ChieuDai=ChieuRong=sc.nextFloat();
	}
}