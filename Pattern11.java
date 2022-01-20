import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int x='A';
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char)x+" ");
                j+=1;
            }
            System.out.println();
            i+=1;
            x+=1;
        }
    }
}
