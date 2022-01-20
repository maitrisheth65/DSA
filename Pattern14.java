import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=1;
            int ch='A'+i;
            while(j<=n){
                System.out.print((char)ch+" ");
                ch+=1;
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
