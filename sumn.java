import java.util.*;
public class sumn {
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter first n natural number ");
        int num = sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=num) {
            sum = sum+i;
            i++;
    
        }
         System.out.println(sum);
           
    }
    
}
    
}
