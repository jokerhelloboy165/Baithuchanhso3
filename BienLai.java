package Baithuchanhso3;
import java.util.*;
class KhachHang{
	String hoTen;
	String soNha;
	String macongto;
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap so nha: ");
		soNha = sc.nextLine();
		System.out.println("Nhap ma cong to: ");
		macongto = sc.nextLine();
	}
	public void inTT() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("So nha: " + soNha);
		System.out.println("Ma cong to: " + macongto);
	}
 }
class BienLai1{
	KhachHang kh = new KhachHang();
	int chisocu;
	int chisomoi;
	int soTien;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chi so cu: ");
		chisocu = sc.nextInt();
		System.out.println("Nhap chi so moi: ");
		chisomoi = sc.nextInt();
		kh.nhapTT();
	}
	public void hienthi() {
		System.out.println("Chi so cu: " + chisocu);
		System.out.println("Chi so moi: " + chisomoi);
		System.out.println("So tien: " + (chisomoi-chisocu)*850000);
		kh.inTT();
	}
	
}
public class BienLai{
	int n;
	BienLai1 Mang[];
	public void nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ho dan : ");
		n = sc.nextInt();
		Mang= new BienLai1[n];
		for(int i=0; i<n;i++) {
			System.out.println("Nhap thong tin cho ho dan thu: " + (i+1));{
				Mang[i] = new BienLai1();
				Mang[i].nhap();
			}
		}
	}
	public void htmang() {
		System.out.println(".................Hien thi..............");
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin cho ho dan thu:  " + (i+1));
			Mang[i].hienthi();
		}
	}
	public static void main(String[] args) {
		BienLai ql = new BienLai();
		ql.nhapMang();
		ql.htmang();
		}
}