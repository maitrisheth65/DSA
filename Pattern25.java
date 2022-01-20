import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int space=i-1;
            while(space!=0){
                System.out.print(" ");
                space-=1;
            }
            int j=1;
            int count=i;
            while(j<=n-i+1){
                System.out.print(count);
                j+=1;
                count+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
