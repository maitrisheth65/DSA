import java.util.Scanner;

public class FibonacciSeries {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int prev=0;
       int next=1;
       System.out.print(prev+" "+next);
       for(int i=2;i<=n;i++){
           System.out.print(" "+(prev+next));
           //int temp=prev;
           next=prev+next;
           prev=next;
          
       }
   } 
}
