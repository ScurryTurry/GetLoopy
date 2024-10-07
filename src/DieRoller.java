import java.util.Scanner;
import java.util.Random;

public class DieRoller
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int dieRoll = die1 + die2 + die3;
        int rollNum = 0;
        String continueYN = "";

        System.out.printf("%3s %10s %3s %3s %3s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("-----------------------------");

        while (!continueYN.equalsIgnoreCase("Q")) {
            rollNum++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;

            System.out.printf("Roll: %-5d %3d %3d %3d %4d\n", rollNum, die1, die2, die3, dieRoll);

            if (die1 == die2 && die3 == die1) {
                System.out.println("You rolled a triple!");
                System.out.print("Press any key to continue. Press Q to Quit: ");
                continueYN = in.nextLine();

                if (!continueYN.equalsIgnoreCase("Q"))
                {
                    System.out.printf("%3s %10s %3s %3s %3s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
                    System.out.println("-----------------------------");
                }
            }
        }
    }
}