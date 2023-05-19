import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrlst = new ArrayList<>();
		System.out.println("Nhap so phan tu muon them vao list:");
		int n = sc.nextInt();
		int a;
		for(int i=0; i<n; i++) {
			System.out.printf("Nhap phan tu thu %d: ",i);
			a = sc.nextInt();
			arrlst.add(a);
		}
		int max = arrlst.get(0);
		for(int i=0; i<arrlst.size(); i++) {
			if (max < arrlst.get(i))
				max = arrlst.get(i);
		}
		System.out.println("Phan tu lon nhat la : " + max);
	}
}
