import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
