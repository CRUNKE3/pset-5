import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three integers. ");
        System.out.print("\nEnter integer: ");
        int value1 = scn.nextInt();
        System.out.print("Enter integer: ");
        int value2 = scn.nextInt();
        System.out.print("Enter integer: ");
        int value3 = scn.nextInt();

        if (value2>value1) {
            if (value3>value2) {
                System.out.print("\nStrictly increasing.");
            } else if (value3==value2) {
                System.out.print("\nIncreasing.");
            } else {
                System.out.print("\nUnordered.");
            }
        } else if (value2<value1) {
            if (value3<value2) {
                System.out.print("\nStrictly decreasing.");
            } else if (value3==value2) {
                System.out.print("\nDecreasing.");
            } else {
                System.out.print("\nUnordered.");
            }
        } else if (value1==value2) {
            if (value3>value2) {
                System.out.print("\nIncreasing.");
            } else if (value3<value2) {
                System.out.print("\nDecreasing.");
            } else {
                System.out.print("\nSame.");
            }
        } else {
            System.out.print("\nUnordered");
        }
        scn.close();
    }
}
