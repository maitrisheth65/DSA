import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        System.out.println("Enter the rows");
        int i=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*"+" ");
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
