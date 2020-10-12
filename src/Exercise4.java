import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#.00");

        System.out.print("Enter a letter grade: ");
        String letterGrade = scn.next();

        String[] letters = {
                "A", "A-", "B+",
                "B", "B-", "C+",
                "C", "C-", "D+",
                "D", "D-", "F+", "F"
        };

        double[] numbers = {
                4.00, 3.66, 3.33,
                3.00, 2.66, 2.33,
                2.00, 1.66, 1.33,
                1.00, 0.66, 0.33, 0.00
        };

        for (int i = 0; i<13; i++) {
            if (letters[i].equals(letterGrade)) {
                System.out.print("\nYour GPA is "+dFormat.format(numbers[i])+".");
            }
        }
        scn.close();
    }

}
