import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        int ch='A';
        int i=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char)ch+" ");
                j+=1;
                ch+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
