import java.util.Scanner;

public class ConditionalAndLoops {
    public static void main(String[] args) {
       /* int a;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>0){
            System.out.println("A is positive");
        }else{
            System.out.println("A is negative");
        }
        sc.close();
        */
        /*
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        if(a>b){
            System.out.println("A is greater");
        }else{
            System.out.println("B is greater");
        }
        sc.close();
        */
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        if(a==0){
            System.out.println("A is 0");
        }
        else if(a<0){
            System.out.println("A is negative");
        }
        else{
            System.out.println("A is positive");
        }
        sc.close();
    }
}
