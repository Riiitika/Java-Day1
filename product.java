import java.util.*;
public class product {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2= sc.nextInt();
            int product = num1 * num2;
            System.out.println(" The product of 2 number is :" + product);
        }

    }
    
}
