package Baithuchanhso3;

import java.util.Scanner;

class Nguoi1{
	public String hoten;
	public String diachi;
	public int namsinh;
	public void nhapTT()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		namsinh = sc.nextInt();
	}
	public void inTT()
	{
		System.out.println("ho ten: " + hoten);
		System.out.println("dia chi: " + diachi);
		System.out.println("nam sinh: " + namsinh);
	}
}
public class VanDung1 {

	public static void main(String[] args) {
		Nguoi1 n = new Nguoi1();
		n.nhapTT();
		n.inTT();

	}

}
