import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#.00");
        dFormat.setGroupingUsed(true);
        dFormat.setGroupingSize(3);

        System.out.print("Enter wage: ");
        double wage = scn.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = scn.nextDouble();
        double weeklyPay = 0;
        if (hours>40) {
            weeklyPay = (wage*40) + ((wage*1.5)*(hours-40));
        }

        if (wage<0){
            System.out.print("Your wage must be greater than or equal to $0.00/hour.");
        } else if (hours<0) {
            System.out.print("Your hours must be greater than or equal to 0.0.");
        } else {
            System.out.print("You'll make $" + dFormat.format(weeklyPay) + " this week.");
        }
        scn.close();
    }
}
