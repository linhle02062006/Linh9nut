import java.util.Scanner;
public class Bai4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap vao so n");
        n=sc.nextInt();
       for (int i=1;i<=n;i++){
           for (int j=1;j<=i;j++){
               System.out.println(j + " ");
           }
           System.out.println("");
       }
    }
}