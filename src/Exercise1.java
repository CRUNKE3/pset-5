import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int value = scn.nextInt();

        if (value>0) {
            System.out.print("\nPositive.");
        } else if (value<0) {
            System.out.print("\nNegative.");
        } else {
            System.out.print("\nZero.");
        }
        scn.close();
    }
}
