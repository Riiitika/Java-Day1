import java.util.*;
public class days {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter one number from 1 to 7:  ");
        int number=sc.nextInt();

        switch(number){
            case 1 : System.out.println("sunday"); 
            break;
            case 2 : System.out.println("monday"); 
            break;
            case 3 : System.out.println("tuesday"); 
            break;
            case 4 : System.out.println("wednesday"); 
            break;
            case 5 : System.out.println("thursday"); 
            break;
            case 6 : System.out.println("friday"); 
            break;
            case 7 : System.out.println("saturday"); 
            break;
            default : System.out.println("not exist"); 
        }
    }
}
    
}
