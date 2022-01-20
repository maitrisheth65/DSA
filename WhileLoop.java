import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        i=1;
        System.out.println("Enter number");
        n=sc.nextInt();
        while(i<=n){
            System.out.print(i+" 10");
            i++;
        }
        sc.close();
    }
}
