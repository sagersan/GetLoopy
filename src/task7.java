public class task7
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop: 5 rows
            for (int j = 1; j <= 5; j++) { // inner loop: 5 stars per row
                System.out.print("* ");
            }
            System.out.println(); // move to the next line
        }
    }
}
