import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rowCount=0;
       
        while(rowCount<n){
            int colCount=0;
            while(colCount<n){
                System.out.print("*"+" ");
                colCount++;
            }
            System.out.println();
            rowCount++;
        }
    }
}
