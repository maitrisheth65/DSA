import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("sum="+sum);
        sc.close();

        */
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int i=2;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i+=2;
        }
        System.out.println("Value of sum is "+sum);
    }
}
