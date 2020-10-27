import java.util.Scanner;

/**
 * helloWorld
 */

 public class helloWorld {

    public static void main(String[] args) {
        // String firstName = "Diamond";
        // String lastName = "Ryan";

        // System.out.println("Hello World!");
        // System.out.println("Today is awesome!");

        // System.out.printf("Hello %s!\n", firstName);
        // System.out.printf("Goodbye %s %s!\n", firstName, lastName);
        Scanner input = new Scanner(System.in);
        System.out.println("What's yo name, shawty?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);
        System.out.println("Okay, what's your last name?");
        String lastName = input.nextLine();
        System.out.printf("Oh your last name is %s, eh %s!\n", lastName, firstName);
    }
}