package BaiThucHanh1905;

import java.util.List;
import java.util.Scanner;

public class SinhVien {
	public String Hoten;
	public double Diem;
	
	public static void Nhap(List<SinhVien> svlst) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i==0) {
			SinhVien a = new SinhVien();
			System.out.println("Nhap ho ten sinh vien:");
			a.Hoten = sc.nextLine();
			if(a.Hoten=="") {
				i++;
				continue;
			}
			System.out.println("Nhap diem sinh vien:");
			a.Diem = sc.nextInt();
			sc.nextLine();
			svlst.add(a);
		}
		
	}
	public void Hien() {
		System.out.println(Hoten + "---" + Diem);
	}
}