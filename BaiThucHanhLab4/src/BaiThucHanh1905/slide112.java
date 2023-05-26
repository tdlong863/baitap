package BaiThucHanh1905;

import java.util.LinkedList;
import java.util.List;

public class slide112 {

	public static void main(String[] args) {
		List<SinhVien> svlst = new LinkedList<>();
		SinhVien.Nhap(svlst);
		int dem=0;
		for(SinhVien sv : svlst) {
			sv.Hien();
			if(sv.Diem < 5) dem++;
		}
		System.out.printf("\nCo %d sinh vien phai thi lai: \n",dem);
		for(SinhVien sv : svlst) {
			if(sv.Diem < 5) sv.Hien();
		}
	}

}