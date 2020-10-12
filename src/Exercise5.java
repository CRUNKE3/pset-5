import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double numberGrade = scn.nextDouble();

        if (numberGrade >= 0 && numberGrade < 60) {
            System.out.println("You received an F.");
        } else if (numberGrade >= 60 && numberGrade < 70) {
            System.out.print("You received a D.");
        } else if (numberGrade >= 70 && numberGrade < 80) {
            System.out.print("You received a C.");
        } else if (numberGrade >= 80 && numberGrade < 90) {
            System.out.print("You received a B.");
        } else if (numberGrade >= 90 && numberGrade <= 100) {
            System.out.print("You received an A.");
        } else if (numberGrade > 100) {
            System.out.print("Grades above 100 are invalid");
        } else {
            System.out.print("Grades below 0 are invalid");
        }
        scn.close();
    }
}