package Baithuchanhso3;
import java.util.Scanner;

//hoten, diachi, namsinh
public class Nguoi {
	
	//thuoc tinh cua lop nguoi
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

