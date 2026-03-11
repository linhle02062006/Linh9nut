package newpackage;

abstract class XeMay {

    abstract void brake();
}

class XeMayTheThao extends XeMay {

    void brake() {
        System.out.println("Xe may the thao dang phanh");
    }
}

class XeMayLeoNui extends XeMay {

    void brake() {
        System.out.println("Xe may leo nui dang phanh");
    }
}

public class XeMayApp {

    public static void main(String[] args) {

        XeMay x1 = new XeMayTheThao();
        XeMay x2 = new XeMayLeoNui();

        x1.brake();
        x2.brake();
    }
}