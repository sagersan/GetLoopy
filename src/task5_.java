public class task5_
{
    public static void main (String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            // rows
            for (int j = 1; j <= i; j++)
            {
               // asterisks in the current row
                System.out.print("*");
                if (j < i)
                    System.out.print(" "); // space between asterisks

            }
        }
        System.out.println(); // this must be here (after the inner loop)
    }
}
