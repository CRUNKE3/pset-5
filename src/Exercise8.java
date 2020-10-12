import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String temperature = scn.nextLine();

        int length = temperature.length();

        double tempNumber;
        String tempLabel = temperature.substring(length-1);

        for(int i = 0; i<=length; i++) {
            if(i==length){
                tempNumber=Double.parseDouble(temperature.substring(0, (length-2)));
                if (tempLabel.equals("F")) {
                    if (tempNumber >= 212) {
                        System.out.print("Gas.");
                    } else if (tempNumber <=32) {
                        System.out.print("Solid.");
                    } else {
                        System.out.print("Liquid.");
                    }
                } else if (tempLabel.equals("C")){
                    if (tempNumber >= 100) {
                        System.out.print("Gas.");
                    } else if (tempNumber <=0) {
                        System.out.print("Solid.");
                    } else {
                        System.out.print("Liquid.");
                    }
                } else {
                    System.out.print("That's not a valid scale");
                }
            }
        }
        scn.close();
    }
}
