import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        for(int c = 0; c < 31; c++)
        {
            System.out.print(c + " ");
        }

        System.out.println("\n");

        for(int c = 30; c > 0; c--)
        {
            System.out.print(c + " ");
        }

        System.out.println("\n");

        for(int c = 0; c < 19; c += 3)
        {
            System.out.print(c + " ");
        }

        System.out.println("\n");

        for(int c = 10; c >= 0; c -= 2)
        {
            System.out.print(c + " ");
        }

        System.out.println("\n");

        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for(int row = 5; row >= 1; row--)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col <= 5; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}