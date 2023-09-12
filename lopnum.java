import java.util.*;
public class lopnum {
    public static void main(String args[]){
//         int num=1;
//         while(num<=10){
//             System.out.println(num);
//             num++;
//         }
//     }
    
// }
 try(Scanner sc = new Scanner(System.in)){
    System.out.println("Enter number");
    int num = sc.nextInt();
    int i=1;
    while(i<=num){
        System.out.println(i);
        i++;
    }
 }

    }
}