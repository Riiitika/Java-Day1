// Inaprogram,input the side ofasquare.You have too utput the area ofthesquare.


import java.util.*;
public class square {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the sides of square:");
        float sqr= sc.nextFloat();
        float sides= sqr*sqr;
        System.out.println(sides);
    }
}
    
}
