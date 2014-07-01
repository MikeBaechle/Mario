import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // n is number of lines, i is counter
        // s is spaces, h is hashes
        int n, i, s, h;

        // prompts for input from the user, checking for a valid response
        do
        {
            System.out.print("Height: ");
            Scanner in = new Scanner(System.in);

            n = in.nextInt();
        }
        while (n < 0 || n > 23);

        // main loop to generate the pyramid based on 'n' height
        for (i = 0; i < n; i++)
        {

            // as the loop goes up, the number of spaces needed goes down
            for (s = n - i; s > 1; s--)
            {
                System.out.print(" ");
            }

            // as the loop goes up, the number of hashes goes up
            for (h = 0; h < i + 2; h++)
            {
                System.out.print("#");
            }

            // prints a line at the end of each iteration
            System.out.println();
        }
    }
}
