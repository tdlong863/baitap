import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("Nhap so dong :");
		m=sc.nextInt();
		System.out.println("Nhap so cot : ");
		n=sc.nextInt();
		int[][] a = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("Nhap phan tu thu %d%d :",i,j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Mang vua nhap: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf(a[i][j] + "  ");
			}
			System.out.println();
		}
		int check;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(a[i][j] > a[i][k]) {
						check = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = check;
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<m-1;i++) {
			if(a[i][n-1] < a[i+1][n-1])
				max = a[i+1][n-1];
		}
		System.out.println("Phan tu co gia tri lon nhat : " + max);
	}

}
