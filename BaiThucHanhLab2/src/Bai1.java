import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap 2 so :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(" tong 2 so =" + (a+b) + "\nhieu 2 so = " + (a-b) +
				"\ntich 2 so = " + (a*b) + "\nthuong 2 so =" + ((a*1.0)/b) + 
				"\nso du cua 2 so = " + (a%b));
		if(a>b) System.out.println("so thu nhat lon hon so thu hai");
		else 
			if(a<b) System.out.println("so thu nhat nho hon so thu hai");
		else System.out.println("2 so bang nhau");
	}

}
