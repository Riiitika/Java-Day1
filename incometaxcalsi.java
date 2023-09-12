import java.util.*;
public class incometaxcalsi {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter your Income: ");
        int income = sc.nextInt();

        if(income<500000){
            System.out.println("0% Tax");
        }
        else if(income<=500000 && income>=1000000){
            int tax = (income * 20)/100;
            int total = tax+ income;
            System.out.println(total);
        }
        else{
            int tax = (income * 30)/100;
            int total = tax+income;
            System.out.println(total);
        }
    }
}
    
}
