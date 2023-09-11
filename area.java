import java.util.*;
public class area {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Radius of circle: ");
            float Radius = sc.nextFloat();
            float area = (float)(3.14 * (Radius * Radius));
            System.out.println("The area of circle is : " + area);
        }
    }
    
}
