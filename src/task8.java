import java.util.Random;
import java.util.Scanner;

public class task8
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String response;

        do {
            int rollCount = 0;
            int die1, die2, die3;
            int sum;

// Print the table header
            System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------");

// Keep rolling until we get a triple
            do {
                rollCount++;
                die1 = random.nextInt(6) + 1; // 1–6
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                sum = die1 + die2 + die3;

// Print each row using printf
                System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3)); // stop when all three match

            System.out.println("\nTriple found after " + rollCount + " roll(s)!\n");

// Ask if the user wants to continue
            System.out.print("Do you want to roll again? (y/n): ");
            response = scanner.nextLine().trim().toLowerCase();

        } while (response.equals("y") || response.equals("yes"));

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }
}
