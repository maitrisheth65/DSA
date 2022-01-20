import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        int count=1;
        int i=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(count+" ");
                j+=1;
                count++;
            }
            System.out.println();
            i+=1;
        }
    }
}
