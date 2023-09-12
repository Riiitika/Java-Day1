import java.util.*;
public class table {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){

        System.out.println("Enter number");
        int num = sc.nextInt();
        
        for(int i=1; i<=10 ; i++){
        
            System.out.println(num *i);
        }  
    }
}
    
}
