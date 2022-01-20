import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            int j=1;
         //   int count=i;
            while(j<=i){
                System.out.print((i-j+1)+" ");
                j+=1;
           //     count-=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
