import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int val='A'+i-1;
            while(j<=n){
                System.out.print((char)val+" ");
                val+=1;
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
