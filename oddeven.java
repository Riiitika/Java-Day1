import java.util.*;
public class oddeven {
    
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
    
}
