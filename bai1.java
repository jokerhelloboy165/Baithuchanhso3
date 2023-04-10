package Baithuchanhso5;

import java.util.Scanner;

class Nguoi {
    String hoTen, diaChi;
    int namSinh;

    public Nguoi() {}

    public Nguoi(String ht, String dc, int ns) {
        hoTen = ht;
        diaChi = dc;
        namSinh = ns;
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
    }

    public void inTT() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nam sinh: " + namSinh);
    }

}

class NhanSu extends Nguoi {
    String maNhanSu;
    double heSoChucVu, heSoLuong;
    static int luongCoBan;

    public static void setLuongCoBan(int lcb) {
        luongCoBan = lcb;
    }

    public void nhapTTNhanSu() {
    	super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan su: ");
        maNhanSu = sc.nextLine();
        System.out.print("Nhap he so chuc vu: ");
        heSoChucVu = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
    }

    public void inTTNhanSu() {
    	super.inTT();
        System.out.println("Ma nhan su: " + maNhanSu);
        System.out.println("He so chuc vu: " + heSoChucVu);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Tinh tong luong: " + tinhLuong());
    }

    public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * luongCoBan - heSoLuong * luongCoBan * 0.05;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap luong co ban cho NhanSu
        System.out.print("Nhap luong co ban: ");
        int lcb = sc.nextInt();
        NhanSu.setLuongCoBan(lcb);

        // Tao hai doi tuong Nguoi va hai doi tuong NhanSu
        Nguoi nguoi1 = new Nguoi();
        Nguoi nguoi2 = new Nguoi();
        NhanSu nhanSu1 = new NhanSu();
        NhanSu nhanSu2 = new NhanSu();

        // Nhap thong tin cho 4 doi tuong
        System.out.println("Nhap thong tin cho nguoi 1:");
        nguoi1.nhapTT();
        System.out.println("Nhap thong tin cho nguoi 2:");
        nguoi2.nhapTT();
        System.out.println("Nhap thong tin cho nhan su 1:");
        nhanSu1.nhapTTNhanSu();
        System.out.println("Nhap thong tin cho nhan su 2:");
        nhanSu2.nhapTTNhanSu();
        
        // In thong tin cua 4 doi tuong
        System.out.println("Thong tin nguoi 1:");
        nguoi1.inTT();
        System.out.println("Thong tin nguoi 2:");
        nguoi2.inTT();
        System.out.println("Thong tin nhan su 1:");
        nhanSu1.inTTNhanSu();
        System.out.println("Thong tin nhan su 2:");
        nhanSu2.inTTNhanSu();
}
}