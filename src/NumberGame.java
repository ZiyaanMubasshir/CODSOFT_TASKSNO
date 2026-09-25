import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("Enter your guess: ");
        int n = sc.nextInt();

        while (n != number) {

            if (n > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            System.out.print("Enter your guess: ");
            n = sc.nextInt();
        }

        System.out.println("Correct!");

    }
}