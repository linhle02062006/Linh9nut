package newpackage4;

abstract class PhuongTienDiChuyen {
    String loaiPhuongTien;

    public PhuongTienDiChuyen(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String layTenLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void batDau() {
        System.out.println(loaiPhuongTien + " bat dau di chuyen");
    }

    public void tangToc() {
        System.out.println(loaiPhuongTien + " dang tang toc");
    }

    public void dungLai() {
        System.out.println(loaiPhuongTien + " da dung lai");
    }

    abstract double layVanToc();
}

class MayBay extends PhuongTienDiChuyen {

    String loaiNhienLieu;

    public MayBay(String loaiNhienLieu) {
        super("May bay");
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("May bay dang cat canh");
    }

    public void haCanh() {
        System.out.println("May bay dang ha canh");
    }

    double layVanToc() {
        return 800;
    }
}

class XeOto extends PhuongTienDiChuyen {

    String loaiNhienLieu;

    public XeOto(String loaiNhienLieu) {
        super("Xe oto");
        this.loaiNhienLieu = loaiNhienLieu;
    }

    double layVanToc() {
        return 120;
    }
}

class XeDap extends PhuongTienDiChuyen {

    public XeDap() {
        super("Xe dap");
    }

    double layVanToc() {
        return 25;
    }
}

public class PhuongTienDiChuyenApp {

    public static void main(String[] args) {

        MayBay mb = new MayBay("Xang");
        XeOto oto = new XeOto("Xang");
        XeDap xd = new XeDap();

        mb.batDau();
        mb.catCanh();
        System.out.println("Van toc may bay: " + mb.layVanToc());

        System.out.println();

        oto.batDau();
        System.out.println("Van toc oto: " + oto.layVanToc());

        System.out.println();

        xd.batDau();
        System.out.println("Van toc xe dap: " + xd.layVanToc());
    }
}