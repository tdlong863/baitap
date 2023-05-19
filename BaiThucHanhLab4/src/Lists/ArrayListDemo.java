package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrlst = new ArrayList<>();
		Student.menu(arrlst);
	}
}
