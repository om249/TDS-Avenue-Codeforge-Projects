import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        double a, b;
        double c;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("************Welcome To Calculator************");
        System.out.println("\n               7     8     9     /"
                          +"\n               4     5     6     *"
                          +"\n               1     2     3     -"
                          +"\n               .     0    %     +");
        System.out.print("\nEnter the first number  : ");
        a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        b = sc.nextDouble();
        System.out.print("Enter the choice        : ");
        choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                c = a + b;
                System.out.println("Calculate . . . . . . . : "+c);

                break;
            case '-':
                c = a - b;
                System.out.println("Calculate . . . . . . . : "+c);

                break;
            case '*':
                c = a * b;
                System.out.println("Calculate . . . . . . . : "+c);

                break;
            case '/':
                c = a / b;
                System.out.println("Calculate . . . . . . . : "+c);

                break;
            case '%':
                c = a % b;
                System.out.println("Calculate . . . . . . . : "+c);

                break;

            default:
                break;
        }
        System.out.println("**********************************************");
        sc.close();

    }
}