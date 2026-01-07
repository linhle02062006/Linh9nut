import java.util.Scanner;
public class Bai2 {
    public static void main (String[]args){
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap vao so n: ");
        int n = nhap.nextInt();
        int tong =0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                tong+=i;
            }
        }
        System.out.println("Tong cac so chan tu 0 den "+ n + "la"+ tong );
    }
}
