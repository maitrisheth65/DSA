import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count='A';
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print((char)count+" ");
                count+=1;
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
