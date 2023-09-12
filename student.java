import java.util.*;
public class student {
public static void main(String[] args) {
try(Scanner sc = new Scanner(System.in)){
    System.out.print("Enter your marks: ");
    int marks = sc.nextInt();

    if(marks>=33){
        System.out.println("Pass");
    } else{
        System.out.println("Fail");
    }
}
    
}
    
}
