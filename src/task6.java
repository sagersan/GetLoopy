public class task6
{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // outer loop: rows (5 down to 1)
            for (int j = 1; j <= i; j++) { // inner loop: stars in each row
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}

