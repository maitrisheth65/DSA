import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int count=1;
            while(j<=n-i+1){
                System.out.print(count+" ");
                count+=1;
                j+=1;
            }
            int space1=i-1;
            while(space1!=0){
                System.out.print("*"+" ");
                space1-=1;
            }
            int space2=i-1;
            while(space2!=0){
                System.out.print("*"+" ");
                space2-=1;
            }
            int k=1;
            int val=n-i+1;
            while(k<=n-i+1){
                System.out.print(val+" ");
                k+=1;
                val-=1;
            }
            System.out.println();
            i+=1;
        }

    }
}
