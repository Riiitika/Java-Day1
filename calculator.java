import java.util.*;
public class calculator {
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter secont number: ");
        int num2= sc.nextInt();
        System.out.println("enter your operator +, -, /, *");
        char oprtor = sc.next().charAt(0);

        switch(oprtor){
            case '+' : System.out.println(num1+num2); break;
            case '-' : System.out.println(num1-num2); break;
            case '/' : System.out.println(num1/num2); break;
            case '*' : System.out.println(num1*num2); break;
            default : System.out.println("Wrong operator"); 
        }

        
    }
    
}
    
}
