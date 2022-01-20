import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int count=i;
            while(j<=i){
                System.out.print(count+" ");
                j+=1;
                count+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
