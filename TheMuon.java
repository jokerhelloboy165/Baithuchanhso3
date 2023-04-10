package Baithuchanhso3;
import java.util.Scanner;

class SinhVien{
	String hoten;
	String lop;
	int namsinh;
	public void nhapTT()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.println("Nhap lop: ");
		lop = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		namsinh = sc.nextInt();
	}
	public void inTT()
	{
		System.out.println("ho ten: " + hoten);
		System.out.println("lop: " + lop);
		System.out.println("nam sinh: " + namsinh);
	}
}
public class TheMuon {
	String sophieumuon;
	String ngaymuon;
	String hantra;
	String solieu;
	SinhVien sv = new SinhVien();
	public void nhapTT()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("so phieu muon: ");
		sophieumuon = sc.nextLine();
		System.out.println("ngay muon: ");
		ngaymuon = sc.nextLine();
		System.out.println("han tra: ");
		hantra = sc.nextLine();
		System.out.println("so lieu: ");
		solieu = sc.nextLine();
		sv.nhapTT();
	}
	public void inTT()
	{
		System.out.println("so phieu muon: " + sophieumuon);
		System.out.println("ngay muon: " + ngaymuon);
		System.out.println("han tra: " + hantra);
		System.out.println("so lieu: " + solieu);
		sv.inTT();
	}
	public static void main(String[] args) {
		TheMuon tm = new TheMuon();
		tm.nhapTT();
		tm.inTT();
	}
}
