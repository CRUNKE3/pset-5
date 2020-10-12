import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String playingCard = scn.nextLine();

        String[] card = playingCard.split("");
        int check = 0;

        if (playingCard.length()!=2) {
            System.out.print("That's not a valid card");
        } else {
            switch (card[0]) {
                case "A":
                    System.out.print("\nAce");
                    break;
                case "2":
                    System.out.print("\nTwo");
                    break;
                case "3":
                    System.out.print("\nThree");
                    break;
                case "4":
                    System.out.print("\nFour");
                    break;
                case "5":
                    System.out.print("\nFive");
                    break;
                case "6":
                    System.out.print("\nSix");
                    break;
                case "7":
                    System.out.print("\nSeven");
                    break;
                case "8":
                    System.out.print("\nEight");
                    break;
                case "9":
                    System.out.print("\nNine");
                    break;
                case "T":
                    System.out.print("\nTen");
                    break;
                case "J":
                    System.out.print("\nJack");
                    break;
                case "Q":
                    System.out.print("\nQueen");
                    break;
                case "K":
                    System.out.print("\nKing");
                    break;
                default:
                    System.out.print("\nThat's not a valid rank.");
                    check = 1;
                    break;
            }
        }
        if (check == 0) {
            switch (card[1]) {
                case "C":
                    System.out.print(" of Clubs.");
                    break;
                case "D":
                    System.out.print(" of Diamonds.");
                    break;
                case "H":
                    System.out.print(" of Hearts.");
                    break;
                case "S":
                    System.out.print(" of Spades.");
                    break;
                default:
                    System.out.print("That's not a valid suit.");
            }
        }
    }
}
