package Baithuchanhso5;
import java.util.Scanner;

class nguoi1 {
    public String hoTen;
    public String diaChi;
    public int namSinh;

    public nguoi1() {}

    public nguoi1(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = scanner.nextInt();
    }

    public void inTT() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nam sinh: " + namSinh);
    }
}

class SinhVien extends nguoi1 {
    public String maSV;
    public String tenLop;
    public float diem1;
    public float diem2;
    public float diem3;

    public SinhVien() {}

    public SinhVien(String hoTen, String diaChi, int namSinh, String maSV, String tenLop) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.tenLop = tenLop;
    }

    public void nhapTT() {
        super.nhapTT();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV = scanner.nextLine();
        System.out.print("Nhap ten lop: ");
        tenLop = scanner.nextLine();
        System.out.print("Nhap diem 1: ");
        diem1 = scanner.nextFloat();
        System.out.print("Nhap diem 2: ");
        diem2 = scanner.nextFloat();
        System.out.print("Nhap diem 3: ");
        diem3 = scanner.nextFloat();
    }

    public void inTT() {
        super.inTT();
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Diem 1: " + diem1);
        System.out.println("Diem 2: " + diem2);
        System.out.println("Diem 3: " + diem3);
        System.out.println("Diem trung binh: " + tinhDiemTrungBinh());
    }

    public float tinhDiemTrungBinh() {
        return (diem1 + diem2 + diem3) / 3;
    }
}

public class bai2 {
    public static void main(String[] args) {
        nguoi1 nguoi = new nguoi1();
        nguoi.nhapTT();
        nguoi.inTT();

        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapTT();
        sinhVien.inTT();
    }
}
