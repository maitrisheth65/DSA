import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            int val='A'+i;
            while(j<=i){
                System.out.print((char)val+" ");
                j+=1;
                val+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
