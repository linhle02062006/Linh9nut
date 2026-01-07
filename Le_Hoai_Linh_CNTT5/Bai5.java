import java.util.Scanner;
public class Bai5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap vao so n:");
        n=sc.nextInt();
        System.out.println("cac so nguyen to tu 1 den " + n + "la:");
        for (int i=2;i<=n;i++){
            int dem = 0;
            for (int j=1;i<=i;j++){
                if (i%j==0){
                    dem++;
                }
            }
            if (dem==2){
                System.out.println( i + "n");
            }
        }
    }
}
