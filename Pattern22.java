import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int space=i-1;
            while(space!=0){
                System.out.print(" ");
                space-=1;
            }
            while(j<=n-i+1){
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i+=1;

        }
    }
}
