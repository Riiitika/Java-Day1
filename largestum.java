import java.util.*;
public class largestum {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter First number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            if(num1>num2){
                System.out.print("The largest number is: " + num1);
            } 
            else{
                    System.out.print("The Largest number is: " + num2);
                }
        }
    }
    
}
