import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 50;
        int bet;
        int payout;
        String[] row;

        // Display welcome
        System.out.println("*************************");
        System.out.println("SLOT MACHINE");
        System.out.println("Symbols: \uD83D\uDE01 \uD83C\uDF4E \uD83C\uDF4D \uD83C\uDF3D \uD83C\uDF70");
        System.out.println("*************************");

        // Play if balance > 0
        while (balance > 0) {
            // Display balance
            System.out.println("Current balance: $" + balance);
            // Enter bet account
            System.out.print("Enter a bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("INSUFFICENT FUNDS");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("INVALID BET");
                continue;
            }
            else {
                balance = balance - bet;
            }
            System.out.println("Spinning...");
            row = spinRow();

            // Print row
            printRow(row);

            // Get payout
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("You loss the round...");
            }
        }

        // Ask play again
        // Exit

        scanner.close();
    }
    static String[] spinRow() {
        String[] symbols = {"\uD83D\uDE01", "\uD83C\uDF4E", "\uD83C\uDF4D", "\uD83C\uDF3D", "\uD83C\uDF70"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }


        return row;
    }

    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch(row[0]) {
                case "\uD83D\uDE01":
                    return bet * 3;
                case "\uD83C\uDF4E":
                    return bet * 4;
                case "\uD83C\uDF4D":
                    return bet * 5;
                case "\uD83C\uDF3D":
                    return bet * 10;
                case "\uD83C\uDF70":
                    return bet * 20;
                default:
                    return 0;
            }
        }
        return 0;
    }
}


