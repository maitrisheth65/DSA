import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int space=n-i;
            while(space!=0){
                System.out.print(" ");
                space-=1;
            }
            int j=1;
            int count=1;
            while(j<=i){
                System.out.print(count+" ");
                j+=1;
                count+=1;
            }
            int k=1;
            int val=i-1;
            while(k<=i-1){
                System.out.print(val+" ");
                k+=1;
                val-=1;
            }
            System.out.println();
            i+=1;
            }
        }
    }
