package BaiThucHanh1905;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class slide111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> linklst = new LinkedList<>();
		System.out.println("Nhap so phan tu muon nhap:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf(" Nhap phan tu thu %d:",i+1);
			int so = sc.nextInt();
			linklst.add(so);
		}
		int sum=0,dem=0;
		for(int nb : linklst) {
			if(nb%2==0) {
				sum+=nb;
				dem++;
			}
		}
		double TBC = (sum*1.0)/dem;
		for(int nb: linklst) {
			System.out.print(nb + "  ");
		}
		System.out.println("TBC các số chẵn : " + TBC);
	}

}