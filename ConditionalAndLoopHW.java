import java.util.*;
public class ConditionalAndLoopHW {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Numeric value");
        }
        sc.close();
    }  
}
