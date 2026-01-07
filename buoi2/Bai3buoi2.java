import java.util.Scanner;
public class Bai3buoi2 {
    public static void main(String[]args){
        Scanner nhap=new Scanner(System.in);
        int n;
        System.out.println("nhap vo so n:");
        n=nhap.nextInt();
        int sum =0;
        for (int i=1;i<n;i++){
            sum +=i;
            
        }
        System.out.println("Tong tu 1 den" +n +"la: "+sum);
    }
}
