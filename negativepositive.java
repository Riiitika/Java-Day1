import java.util.*;
public class negativepositive {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Number is negative");
        } else{
            System.out.println("Number is positive");
        }
    }
}
    
}
