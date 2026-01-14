
package buoi3;

public class Bai1 {
    private String bienSo;
    private String chuXe;
    private String hieuXe;
    private int dungTich;
    private double giaXe;
public Bai1(String bienSo, String chuXe, String hieuXe, double giaXe, int dungTich){
    this.bienSo = bienSo;
    this.chuXe = chuXe;
    this.hieuXe = hieuXe;
    this.giaXe = giaXe;
    this.dungTich = dungTich;
}
public double tinhThue(){
    double thue;
    if (dungTich <100){
        thue = giaXe * 0.01;
    } else if (dungTich >=100 && dungTich <=200){
        thue = giaXe * 0.03;
    } else {
        thue = giaXe * 0.05;
    }
        return thue;
    }
}
