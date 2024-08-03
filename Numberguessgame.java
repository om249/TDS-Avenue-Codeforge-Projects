import java.util.*;

public class Numberguessgame {

    public static void main(String[] args) {
        int player = 0;
        int attempt = 0;
        int umpire = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("***Welcome to the Number Guessing Game***");
        System.out.println("\nChoose the number between 1 to 100 : ");

        while (player != umpire) {
            System.out.print("\nEnter the Number : ");
            player = sc.nextInt();

            attempt++;

            if (player > umpire) {
                System.out.println("Too high!let's try again ");
            } else if (player < umpire) {
                System.out.println("Too low!let's try again");
            } else {
                System.out.println("Congratulation! You won the game in " + attempt + " attempts");
            }

        }
    }
}
