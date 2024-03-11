import java.util.*;
public class GradeAve {
    public static void main(String[]args){
        int average;
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade 1: ");
        grade1 = input.nextInt();
        System.out.print("Enter grade 2: ");
        grade2 = input.nextInt();
        System.out.print("Enter grade 3: ");
        grade3 = input.nextInt();
        System.out.print("Enter grade 4: ");
        grade4 = input.nextInt();
        System.out.print("Enter grade 5: ");
        grade5 = input.nextInt();
        average = ((grade1+grade2+grade3+grade4+grade5)/5);
        System.out.println("The grade average is: "+average);
        input.close();

    }
}
