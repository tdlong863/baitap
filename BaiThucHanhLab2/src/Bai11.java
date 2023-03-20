import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do{System.out.println("vui long nhap so phan tu cua mang");
		n = scan.nextInt();}while(n<1);
		int mang[] = new int[n];
		System.out.println("vui long nhap gia tri cac phan tu cua mang");
		for(int i = 0 ; i< mang.length ;i++) {
			System.out.printf("mang[%d] = ",i);
			mang[i] =  scan.nextInt();
		}
		int temp;
		System.out.println("mang truoc khi chinh sua la :");
		for(int i = 0 ; i<mang.length ; i++) {
			System.out.printf("mang[%d] = ",i);
			System.out.println(mang[i]);
		}
		
		for(int i = 0 ; i<mang.length-1 ; i++) {
			for(int j = i+1 ; j<mang.length; j ++) {
				if(mang[i]>mang[j]) {
					temp = mang[i];
					mang[i]= mang[j];
					mang[j] = temp;
					
				}
			}
		}System.out.println("mang sau khi chinh sua theo thu tu tang dan la :");
		for(int i = 0 ; i<mang.length;i++) {
			System.out.printf("mang[%d] = ",i);
			System.out.println(mang[i]);
		}
	}

}