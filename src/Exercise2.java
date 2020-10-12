import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int value = scn.nextInt();

        if (value%2==0) {
            System.out.print("\nEven.");
        } else {
            System.out.print("\nOdd.");
        }
        scn.close();
    }
}
