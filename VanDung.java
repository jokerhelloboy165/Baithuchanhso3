package Baithuchanhso4;
import java.util.Scanner;
class ToanHoc{
	//kiem tra so nguyen to
		public static boolean ktsongto(int a){
			//so nguyen nho hon 2 khong phai la snt
			if (a < 2){
				return false;
			}
			//kiem tra so nguyen to khi a lon hon 2
			int squareRoot = (int) Math.sqrt(a);
			for (int i = 2 ; i <= squareRoot; i++){
				if( a%i == 0){
					return false;
				}
			}
			return true;
		}
		//kiem tra so hoan hao
		public static boolean ktsohoanhao(int a){
			int sum = 0;
			for(int i = 1 ; i<=a/2; i++){
				if (a%i==0)
					sum+=i;
			}
			if(sum==a)return true;
			return false;
		}
		//kiem tra so chinh phuong
		public static boolean ktchinhphuong(int a){
			if(a >= 1){
				if(Math.sqrt(a) == ((int)Math.sqrt(a))) {
					return true;
				}
				return false;
			}
			else return false;
		}
		public static int fibo(int a){
			if(a == 0 || a == 1){
				return 1;
			}
			return fibo(a - 2) + fibo(a - 1);
		}
		public static int giaiThua(int n) {
			if(n == 1) {
				return 1;
			}
			return n * giaiThua(n-1);
		}
		public static double tinhTong4(int n) {
			double s = 0.0;
			for(int i = 1; i <= n; i++) {
				s += giaiThua(i);
			}
			return s;
		}
		public static double tinhTong1(int n) {
			double s = 0.0;
			for(int i = 1; i <= n; i++) {
				s += (double)i/(i+1);
			}
			return s;
		}
}
public class VanDung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		System.out.println("Nhap chuc nang ban muon su dung : \n1 : kiem tra so nguyen to\n2 : kiem tra so hoan hao\n3 : in ra cac so chinh phuong nho hon so da nhap\n4 : Tinh phan tu thu n cua day Fibonaci\n5 : Tong day S=1/2+2/3+...+n-1/n\n6 : Tong day S=1!/(x+k)+2!/(x^2-k^2)+...+n!/(x^n+(-1)^(n+1)*k^n\n7 : Tong day S=1+2-3+...(-1)^n-1*n\n8 : Tong day S=1!+2!+...+n! ");
		op = sc.nextInt();
		switch(op){
		case 1:
			int a;
			System.out.println("Nhap a :");
			a = sc.nextInt();
			if(ToanHoc.ktsongto(a)){
				System.out.println(a + " la so nguyen to");
			}
			else{
				System.out.println(a + " khong phai la so nguyen to");
			}
			break;
		case 2:	
			int b;
			System.out.println("Nhap b :");
			b = sc.nextInt();
			if(ToanHoc.ktsohoanhao(b)){
				System.out.println(b + " la so hoan hao");
			}
			else{
				System.out.println(b + " Khong phai la so hoan hao");
			}
			break;
		case 3:
			int c;
			System.out.println("Nhap c :");
			c = sc.nextInt();
			System.out.println("cac so chinh phuong nho hon so da nhap la : ");
			int i = 1;
			do{
				if(ToanHoc.ktchinhphuong(i)){
					System.out.println(i);
				}
				i++;
			}while(i < c);
		case 4:
			int d;
			System.out.println("Nhap d :");
			d = sc.nextInt();
			System.out.println("Phan tu thu " + d + " cua day Fibonaci la : " + ToanHoc.fibo(d));
			break;
		case 5:
			int e;
			System.out.println("Nhap e: ");
			e = sc.nextInt();
			System.out.println("Tong day S=1/2+2/3+...+n-1/n voi n bang" + e + "la: " + ToanHoc.tinhTong4(e));
			break;
		case 6:
		case 7:
		case 8:
			int h;
			System.out.println("Nhap h :");
			h = sc.nextInt();
			System.out.println("Tong day S=1!+2!+3!+...+n! voi n = " + h +" la : " + ToanHoc.tinhTong4(h));
			break;
		default:
			System.out.println("Nhap sai!!! Ket thuc chuong trinh");	
		}
	}

}