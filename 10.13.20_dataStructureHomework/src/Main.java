import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("List 5 numbers");
        int number = Integer.parseInt(scanner.nextLine());

        Numbers five = new Numbers(number);

        System.out.println(five.numbers);
        




    }
}
