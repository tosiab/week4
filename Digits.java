public class Digits {
    public static void main(String[]args){
      int number;
      int num1;
      int num2;
      int num3;
      number = 258;
      num3 = (number%10);
      num2 = (((number%100)-num3)/10);
      num1 = (((number%1000)-(number%100))/100);

      System.out.println("The hundreds digit is " + num1);
      System.out.println("The tens digit is " + num2);
      System.out.println("The ones digit is " + num3);
    }
    
}
