import java.util.Scanner;
public class Bai3 {
    public static void main (String[]args){
        Scanner nhap=new Scanner(System.in);
        int n;
        System.out.println("nhap vao so n: ");
        n=nhap.nextInt();
        for (int i=n;i<=n;i++){
            for (int j=1;j<=9;j++){
                System.out.println(i + "x" + j+ "=" +(i*j));
            }
        }
    }
}
