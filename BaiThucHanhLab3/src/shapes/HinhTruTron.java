package shapes;

import java.util.Scanner;

public class HinhTruTron extends HinhTron {
	public float TheTich;
	public float ChieuCao;
	public HinhTruTron() {
		ten = "Hinh tru";
	}
	
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu cao:");
		ChieuCao=sc.nextFloat();
	}
	
	public float TinhTheTich() {
		TheTich = DienTich*ChieuCao;
		return TheTich;
	}
	public void InThongTin() {
		System.out.printf("Hinh tru tron co chieu cao %.2f, the tich %.2f",ChieuCao,TinhTheTich());
	}
}