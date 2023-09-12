// Write aprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.

import java.util.*;
public class pro {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number");
            int num = sc.nextInt();
            int sum =0;
           for(int i=1; i<=num; i++){

            if(num % 2==0){
                sum = sum + num;
                System.out.println(sum);
            } else{
                if( num % 2 !=0){
                    sum = sum+num;
                    System.out.println(sum);
                }
            }
           }
        }
    }
    
}
