// Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apen and an eraser. You have to output the total cost of the items 
// back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.*;

public class price {
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen: ");
        float pen= sc.nextFloat();
        System.out.print("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();

        float totaBill= (pencil+pen+eraser);
        System.out.print("Your Total Bill is: " + totaBill );

        // include gst 
        float gst = (totaBill * 18)/100;
        float netPrice = totaBill + gst;
        System.out.print("  After including 18% GST, your Total Bill is: " + netPrice);
    }
        
    }
    
}
