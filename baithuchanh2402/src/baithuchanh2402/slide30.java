package baithuchanh2402;

public class slide30 {

	public static void main(String[] args) {
		  int n, remainder, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhap n:");
	        n = sc.nextInt();

	        while(n > 0) {
	            remainder = n % 10;
	            n /= 10;
	            sum += remainder;
	        }
	        System.out.println("Tong cac chu so la: " + sum);
		// TODO Auto-generated method stub

	}

}
