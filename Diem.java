package Baithuchanhso4;
import java.util.*;

public class Diem {
	double x,y,x1,y1;
	public Diem() {
		
	}
	public Diem(double x1, double y1) {
		x=x1;y=y1;
	}
	public void inTTDiem() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
	public double tinhKhoangCach(Diem d) {
		double kc;
		return kc = Math.sqrt((x - d.x)*( x - d.x) + (y - d.y)*(y - d.y));
	}
	public static void main(String[] args) {
		Diem D1 = new Diem(3,7);
		Diem D2 = new Diem(9,3);
		System.out.println("Diem D1: ");
		D1.inTTDiem();
		System.out.println("Diem D2: ");
		D2.inTTDiem();
		System.out.println("Khoang cach D1, D2 la: " + D1.tinhKhoangCach(D2));
	}

}
