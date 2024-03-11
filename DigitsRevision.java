import java.util.*;
public class DigitsRevision {
    public static void main(String[]args){
        int number;
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        number = input.nextInt();
        num3 = (number%10);
        num2 = (((number%100)-num3)/10);
        num1 = ((number%1000)/100);
        input.close();
  
        System.out.println("The hundreds digit is " + num1);
        System.out.println("The tens digit is " + num2);
        System.out.println("The ones digit is " + num3);
      }
      
}
