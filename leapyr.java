import java.util.*;
public class leapyr {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if(year%4==0 || year%100==0 || year%400==0){
            System.out.println("Year is leap year");
        } else{
            System.out.println("Year is not a leap year");
        }
    }
}
    
}
