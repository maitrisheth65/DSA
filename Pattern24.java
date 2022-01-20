import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int space=n-i+1;
            while(space!=0){
                System.out.print(" ");
                space-=1;
            }
            while(j<=i){
                System.out.print(i);
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
