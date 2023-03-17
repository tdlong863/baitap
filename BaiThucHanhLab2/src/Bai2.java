import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("mời nhập số bất kì mà bạn thích ");
		int n = scan.nextInt();
		if(n==0) {
			System.out.println("n la so 0");
		}
		else {
			if(n%2==0) {
				System.out.println("n la so chan bạn nhé");
			}
			else {
				System.out.println("n la so le bạn nhé ");
			}
		}
	}

}
