import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a month: ");

        String month = scn.nextLine();

        switch(month.toLowerCase()) {
            case "feb":
            case "febr":
            case "february":
                System.out.print("\n28 or 29 days.");
                break;
            case "apr":
            case "apri":
            case "april":
            case "jun":
            case "june":
            case "sep":
            case "sept":
            case "september":
            case "nov":
            case "nove":
            case "november":
                System.out.print("\n30 days.");
                break;
            case "jan":
            case "janu":
            case "january":
            case "mar":
            case "marc":
            case "march":
            case "may":
            case "jul":
            case "july":
            case "aug":
            case "augu":
            case "august":
            case "oct":
            case "octo":
            case "october":
            case "dec":
            case "dece":
            case "december":
                System.out.println("\n31 days.");
                break;
            default:
                System.out.print("\nThat's not a valid month");
                break;
        }
        scn.close();
    }
}
