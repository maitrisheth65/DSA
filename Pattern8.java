import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(count+" ");
                count+=1;
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
