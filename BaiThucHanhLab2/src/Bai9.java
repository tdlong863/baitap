import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		char arr[] = a.toCharArray();
		int soInHoa = 0;
		int soInThuong = 0;
		int soChuSo = 0;
		for (int i = 0 ; i< arr.length ; i++)
		{
			char c = arr[i];
			if(Character.isUpperCase(c)) {
				soInHoa++;
			}
			if(Character.isLowerCase(c)) {
				soInThuong++;
			}
			if(Character.isDigit(c)) {
				soChuSo++;
			}
		}
		System.out.println("chuỗi có "+soInHoa+" chữ cái in hoa");
		System.out.println("chuỗi có "+soInThuong+" chữ cái in thường");
		System.out.println("chuỗi có "+soChuSo+" chữ số");
	}

}
