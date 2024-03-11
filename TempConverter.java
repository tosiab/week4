import java.util.*;
public class TempConverter {
    public static void main(String[]args){
        double F;
        double C;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        F = input.nextInt();
        C = (5.0/9.0*(F-32.0));

        System.out.println(C);


    }
    
    
}
