import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your age");
    int age = Integer.parseInt(input.nextLine());
    if (age < 18) {
        System.out.println("No MadLib for you!");
        
    }else {System.out.println("Choose a name!");
    String name = input.nextLine();
    System.out.println("Choose a verb!");
    String verb1 = input.nextLine();
    System.out.println("Choose a noun!");
    String noun1 = input.nextLine();
    System.out.println("Choose another verb!");
    String verb2 = input.nextLine();
    System.out.println("Choose another noun!");
    String noun2 = input.nextLine();
    System.out.println("Choose another noun!");
    String noun3 = input.nextLine();
    System.out.println("What is your name?");
    String yourName = input.nextLine();
    System.out.printf("Dear %s, \nI %s on %s today. It %s like %s %s. \nSincerely, %s", name, verb1, noun1, verb2, noun2, noun3, yourName);
    }

    }
}
