import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            int j=n;
            while(j>=1){
                System.out.print(j+" ");
                j-=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
