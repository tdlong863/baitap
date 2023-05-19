package BaiThucHanh1905;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class slide110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arrlst = new ArrayList<>();
		System.out.println("Nhap so phan tu:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf("Nhap phan tu thu %d:",i+1);
			int so = sc.nextInt();
			arrlst.add(so);
		}
		Collections.sort(arrlst);
		for(int nb : arrlst) {
			System.out.print(nb + "  ");
		}
		System.out.printf("\nGia tri lon nhat la %d",arrlst.get(arrlst.size()-1));
		System.out.println("\nNhap gia tri muon xoa:");
		int xoa = sc.nextInt();
		for(int i=0;i<arrlst.size();i++) {
			if(arrlst.get(i)==xoa) {
				arrlst.remove(i);
			}
		}
		for(int nb : arrlst) {
			System.out.print(nb + "  ");
		}
	}
}