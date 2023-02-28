import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất : ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        int minNum = num1 < num2 ? num1 : num2;
        System.out.println("Số nhỏ nhất là: " + minNum);
    }
}
