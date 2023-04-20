package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
	public float BanKinh;
	public HinhTron() {
		ten = "Hinh tron";
	}
	public void NhapBanKinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh:");
		BanKinh=sc.nextFloat();
	}
	public float TinhChuVi() {
		ChuVi = 2*Pi*BanKinh;
		return ChuVi;
	}
	public float TinhDienTich() {
		DienTich = Pi*BanKinh*BanKinh;
		return DienTich;
	}
	public void InThongTin() {
		System.out.printf("\nHinh tron co ban kinh %.2f, co chu vi %.2f, co dien tich %.2f",BanKinh,TinhChuVi(),TinhDienTich());
	}
}