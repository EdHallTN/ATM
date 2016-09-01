
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, customer.");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        if (!(name.isEmpty())) {
            System.out.println("Welcome, " + name + ".");
        }
        else {
            throw new Exception("Invalid name.");
        }

        System.out.println("What would you like to do?");
        System.out.println("Enter 1 to check your balance");
        System.out.println("Enter 2 to withdraw funds");
        System.out.println("Enter 3 to cancel");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1")) {
            System.out.println("Your balance is $100.");
            System.out.println("Thank you and please come again!");
        }
        else if (choice.equalsIgnoreCase("2")) {
            System.out.println("How much would you like to withdraw?");
            int x = Integer.parseInt(scanner.nextLine());
            if (x <= 100)    {
                System.out.println("Please take your money. Thank you and please come again!");
            }
            else {
                throw new Exception("Invalid amount.");
            }
        }
        else if (choice.equalsIgnoreCase("3")) {
            System.out.println("Thank you and please come again!");
        }
        else {
            throw new Exception("Invalid choice.");
        }

    }
}