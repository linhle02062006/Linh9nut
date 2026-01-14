import java.util.Scanner;

public class Bai6 {
    public static void nhapMang(int[] a, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int timViTriX(int[] a, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static int timMax(int[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static int timMin(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static int viTriMax(int[] a, int n) {
        int max = a[0];
        int vt = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                vt = i;
            }
        }
        return vt;
    }
    public static void sapXepTangDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        nhapMang(a, n, sc);
        System.out.println("Mang vua nhap:");
        xuatMang(a, n);
        System.out.print("Nhap x can tim: ");
        int x = sc.nextInt();
        int vt = timViTriX(a, n, x);
        if (vt != -1) {
            System.out.println("x nam o vi tri: " + vt);
        } else {
            System.out.println("Khong tim thay x trong mang");
        }
        System.out.println("Gia tri lon nhat trong mang: " + timMax(a, n));
        System.out.println("Gia tri nho nhat trong mang: " + timMin(a, n));
        System.out.println("Vi tri phan tu lon nhat: " + viTriMax(a, n));
        sapXepTangDan(a, n);
        System.out.println("Mang sau khi sap xep tang dan:");
        xuatMang(a, n);
    }
}

