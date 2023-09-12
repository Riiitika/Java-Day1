import java.util.*;
public class multipleoften {
public static void main(String args[]){
    try( Scanner sc = new Scanner(System.in)){
        System.out.println("Enter number which is multiple of 10 ");
        
        do{
            int num = sc.nextInt();
            if(num%10 ==0){
                continue;
            }
            System.out.println(num);
        } while(true);


    }
}
    
}
