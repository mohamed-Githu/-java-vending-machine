import java.util.Scanner;

/**
 * A simple program that simulates a vending machine. It calculates the change due.
 */
public class Main {
    static final int PENNIES_PER_DOLLAR = 100;
    static final int PENNIES_PER_QUARTER = 25;

    /**
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter the bill (1$ bill, 5$ bill, etc): ");
        int bill = in.nextInt();

        System.out.print("Enter the price of the desired item in pennies: ");
        int itemPricePennies = in.nextInt();

        // calculate the due bills
        int billInPennies = bill * PENNIES_PER_DOLLAR;
        int changeDueInPennies = billInPennies - itemPricePennies;

        // if the bill is not enough, throw an error and exit!
        if (changeDueInPennies < 0) {
            System.out.println("Not Enough Money!");
            return;
        }

        int dollarCoins = changeDueInPennies / PENNIES_PER_DOLLAR;
        System.out.printf("%nDollar Coins: %4d%n", dollarCoins);
        changeDueInPennies %= PENNIES_PER_DOLLAR;

        int quarterCoins = changeDueInPennies / PENNIES_PER_QUARTER;
        System.out.printf("Quarter Coins: %3d%n", quarterCoins);
    }
}