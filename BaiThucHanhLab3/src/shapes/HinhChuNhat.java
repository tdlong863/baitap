package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
	public float ChieuDai;
	public float ChieuRong;
	public float ChuVi;
	public float DienTich;
	
	public HinhChuNhat() {
		ten = "Hinh chu nhat";
	}
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap chieu dai: ");
		ChieuDai=sc.nextFloat();
		System.out.printf("Nhap chieu rong: ");
		ChieuRong=sc.nextFloat();
	}
	public float TinhChuVi() {
		ChuVi = (ChieuDai + ChieuRong)*2;
		return ChuVi;
	}
	public float TinhDienTich() {
		DienTich = ChieuDai*ChieuRong;
		return DienTich;
	}
	public void InThongTin() {
		System.out.printf("HCN co chieu dai = %.2f, chieu rong = %.2f, chu vi = %.2f, dien tich = %.2f",ChieuDai,ChieuRong,TinhChuVi(),TinhDienTich());
	}
}