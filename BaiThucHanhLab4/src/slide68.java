import java.util.Scanner;
import java.util.TreeSet;

public class slide68 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	TreeSet<Integer> Ts= new TreeSet<>();
	Ts.add(6);
	Ts.add(2);
	int b=1;
	while(b==1) {
	System.out.println("\nNhập vào phần tử cần thêm");
	int a= sc.nextInt();
	if(!Ts.contains(a)) {
	Ts.add(a);
	System.out.println("Danh sách sau khi thêm");
	System.out.println(Ts);
	}
	else System.out.printf("Đã tồn taị %d trong dãy ",a);
	}
}
}