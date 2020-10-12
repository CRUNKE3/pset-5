import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scn.nextInt();

        if (year%4==0) {
            System.out.print(year+" is a leap year.");
        } else {
            System.out.print(year+" is not a leap year.");
        }

        scn.close();
    }
}
