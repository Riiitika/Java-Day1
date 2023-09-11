import java.util.*;
public class average {
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter First number");
        float avg1= sc.nextFloat();
        System.out.println("Enter Secont number");
        float avg2 = sc.nextFloat();
        System.out.println("Enter third number");
        float avg3 = sc.nextFloat();

        float totalAvg= ((avg1 + avg2 + avg3 )/3);
        System.out.println(totalAvg);
    }
    
}
    
}
