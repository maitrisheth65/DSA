import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int ch='A';
            int j=1;
            while(j<=n){
                System.out.print((char)ch+" ");
                j+=1;
                ch+=1;
            }
            System.out.println();
            i+=1;
        }
    } 
}
