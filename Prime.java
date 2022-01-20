import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=2;
        boolean isPrime=true;
        while(i<n){
            if(n%i==0){
                isPrime=false;
                System.out.println("No Prime");
                break;
            }
            i+=1;
        }
        if(isPrime){
            System.out.println("Prime");
        }
    }
}
