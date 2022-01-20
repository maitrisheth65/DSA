import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        int i=1;
        int count='A';
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print((char)count+" ");
                j+=1;
            }
            System.out.println();
            count+=1;
            i+=1;
        }
    }
}
