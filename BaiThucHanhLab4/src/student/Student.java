package student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
	public String fullName;
	public int age;
	
	
	public Student() {
		super();
	}
	public Student(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return fullName +" "+age+" tuoi";
	}
//array list
public static void nhapNhieuThongTin(ArrayList<Student>o,int n) {
	for(int i = 0 ;i<n;i++) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Student std = new Student(fullName, age);
		o.add(std);
	}
}
public static void nhapThongTin(ArrayList<Student>o) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Student std = new Student(fullName, age);
		o.add(std);
}
public static void xuatThongTin(ArrayList<Student>o) {
	for(Student std : o) {
		System.out.println(std);
		
	}
	
}
public static void suaThongTin(ArrayList<Student>o) {
	System.out.println("nhap ten student ban muon chinh sua");
	String sua = new Scanner(System.in).nextLine();
	for(Student std : o) {
		if(std.getFullName().equals(sua)) {
			System.out.println("nhap thong tin muon sua");
			System.out.println("nhap ten");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("nhap tuoi");
			int tuoi = new Scanner(System.in).nextInt();
			std.setFullName(ten);
			std.setAge(tuoi);
		}
	}
	
}
public static void xoaThongTin(ArrayList<Student>o) {
	System.out.println("nhap ten student muon xoa");
	String xoa = new Scanner(System.in).nextLine();
	for(int i = 0 ; i<o.size();i++) {
		if(o.get(i).getFullName().equals(xoa))o.remove(i);
	}
	
}
public static void menu(ArrayList<Student>o) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("vui long nhap lua chon ");
		System.out.println("1.Them doi tuong");
		System.out.println("2.Them nhieu doi tuong");
		System.out.println("3.Sua doi tuong");
		System.out.println("4.Xoa doi tuong");
		System.out.println("5.Xuat student list");
		System.out.println("6.Thoat");
		int chon = scan.nextInt();
		switch(chon) {
		case 1:nhapThongTin(o);break;
		case 2:
		System.out.println("nhap so luong student muon nhap");
		int n = new Scanner(System.in).nextInt();
		nhapNhieuThongTin(o, n);break;
		case 3:suaThongTin(o);break;
		case 4:xoaThongTin(o);break;
		case 5:xuatThongTin(o);break;
		case 6:System.exit(0);
	}
}
}
//linked list
public static void nhapNhieuThongTin(LinkedList<Student>o,int n) {
	for(int i = 0 ;i<n;i++) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Student std = new Student(fullName, age);
		o.add(std);
	}
}
public static void nhapThongTin(LinkedList<Student>o) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Student std = new Student(fullName, age);
		o.add(std);
}
public static void xuatThongTin(LinkedList<Student>o) {
	for(Student std : o) {
		System.out.println(std);
		
	}
	
}
public static void suaThongTin(LinkedList<Student>o) {
	System.out.println("nhap ten student ban muon chinh sua");
	String sua = new Scanner(System.in).nextLine();
	for(Student std : o) {
		if(std.getFullName().equals(sua)) {
			System.out.println("nhap thong tin muon sua");
			System.out.println("nhap ten");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("nhap tuoi");
			int tuoi = new Scanner(System.in).nextInt();
			std.setFullName(ten);
			std.setAge(tuoi);
		}
	}
	
}
public static void xoaThongTin(LinkedList<Student>o) {
	System.out.println("nhap ten student muon xoa");
	String xoa = new Scanner(System.in).nextLine();
	for(Student std : o) {
		if(std.getFullName().equals(xoa))o.remove(std);	}
	
}
public static void menu(LinkedList<Student>o) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("vui long nhap lua chon ");
		System.out.println("1.Them doi tuong");
		System.out.println("2.Them nhieu doi tuong");
		System.out.println("3.Sua doi tuong");
		System.out.println("4.Xoa doi tuong");
		System.out.println("5.Xuat student list");
		System.out.println("6.Thoat");
		int chon = scan.nextInt();
		switch(chon) {
		case 1:nhapThongTin(o);break;
		case 2:
		System.out.println("nhap so luong student muon nhap");
		int n = new Scanner(System.in).nextInt();
		nhapNhieuThongTin(o, n);break;
		case 3:suaThongTin(o);break;
		case 4:xoaThongTin(o);break;
		case 5:xuatThongTin(o);break;
		case 6:System.exit(0);
	}
}
}
//hash set
public static void nhapNhieuThongTin(HashSet<Student>o,int n) {
	for(int i = 0 ;i<n;i++) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Student std = new Student(fullName, age);
		o.add(std);
	}
}
public static void nhapThongTin(HashSet<Student>o) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Student std = new Student(fullName, age);
		o.add(std);
}
public static void xuatThongTin(HashSet<Student>o) {
	for(Student std : o) {
		System.out.println(std);
		
	}
	
}
public static void suaThongTin(HashSet<Student>o) {
	System.out.println("nhap ten student ban muon chinh sua");
	String sua = new Scanner(System.in).nextLine();
	for(Student std : o) {
		if(std.getFullName().equals(sua)) {
			System.out.println("nhap thong tin muon sua");
			System.out.println("nhap ten");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("nhap tuoi");
			int tuoi = new Scanner(System.in).nextInt();
			std.setFullName(ten);
			std.setAge(tuoi);
		}
	}
	
}
public static void xoaThongTin(HashSet<Student>o) {
	System.out.println("nhap ten student muon xoa");
	String xoa = new Scanner(System.in).nextLine();
	for(Student std : o) {
		if(std.getFullName().equals(xoa))o.remove(std);	}
	
}
public static void menu(HashSet<Student>o) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("vui long nhap lua chon ");
		System.out.println("1.Them doi tuong");
		System.out.println("2.Them nhieu doi tuong");
		System.out.println("3.Sua doi tuong");
		System.out.println("4.Xoa doi tuong");
		System.out.println("5.Xuat student list");
		System.out.println("6.Thoat");
		int chon = scan.nextInt();
		switch(chon) {
		case 1:nhapThongTin(o);break;
		case 2:
		System.out.println("nhap so luong student muon nhap");
		int n = new Scanner(System.in).nextInt();
		nhapNhieuThongTin(o, n);break;
		case 3:suaThongTin(o);break;
		case 4:xoaThongTin(o);break;
		case 5:xuatThongTin(o);break;
		case 6:System.exit(0);
	}
}
}
}