import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int count=n-i+'A';
            while(j<=i){
                System.out.print((char)count+" ");
                j+=1;
                count+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
