package newpackage2;

import java.util.Scanner;

abstract class HinhHoc {

    final float PI = 3.14f;
    String ten;
    float chuVi;
    float dienTich;
    float theTich;

    void xuatTen() {
        System.out.println("Ten hinh: " + ten);
    }

    abstract void tinhChuVi();
    abstract void tinhDienTich();
    void tinhTheTich() {}
}

class HinhTron extends HinhHoc {

    float banKinh;

    void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }

    void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}

class HinhTru extends HinhTron {

    float chieuCao;

    void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }

    void tinhTheTich() {
        theTich = PI * banKinh * banKinh * chieuCao;
    }
}

class HinhChuNhat extends HinhHoc {

    float dai;
    float rong;

    void nhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }

    void nhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
    }

    void tinhChuVi() {
        chuVi = (dai + rong) * 2;
    }

    void tinhDienTich() {
        dienTich = dai * rong;
    }
}

class HinhVuong extends HinhChuNhat {

    void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        dai = rong = sc.nextFloat();
    }
}

public class HinhHocApp {

    public static void main(String[] args) {

        HinhTron ht = new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();

        System.out.println("Chu vi hinh tron: " + ht.chuVi);
        System.out.println("Dien tich hinh tron: " + ht.dienTich);

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        System.out.println("Chu vi HCN: " + hcn.chuVi);
        System.out.println("Dien tich HCN: " + hcn.dienTich);
    }
}