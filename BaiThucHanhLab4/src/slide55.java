import java.util.HashSet;
import java.util.Scanner;

public class slide55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs=new HashSet<>();
		hs.add("Hà");
		hs.add("Mạnh");
		hs.add("Kiên");
		System.out.println(hs);
		System.out.println("Nhap phan tu can them:");
		String number = sc.nextLine();
		if(!hs.contains(number)) {
			hs.add(number);
			System.out.println(" Kết quả sau khi thêm");
			System.out.println(hs);
		}
		else 
		{
			System.out.println("đã tồn tại");
		}
		System.out.println("Nhập phần tử cần xóa:");
		String number1=sc.nextLine();
	if(hs.contains(number1)) {
		hs.remove(number1);
		System.out.println("Sau khi xóa thành công");
		System.out.println(hs);
	}
	else 
	{
		System.out.printf("Không tồn tại %s  trong danh sách", number1);
	}
	}
}