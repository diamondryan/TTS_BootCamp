// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike("Pink", 2, 8);
        Bike differentBike = new Bike("Brown", 3, 8, true);
        
        // bike.color = "blue"; directly modifying property is bad

        bike.paintBike("gold");

        System.out.println("\nThe bike color is " + bike.getColor());

        




        bike.getCurrentGear();
        bike.getCurrentSpeed();

        bike.changeGear(2);
        bike.speedUp(5);

        bike.getCurrentGear();
        bike.getCurrentSpeed();





        // // public Banana(String color, String brand) {
        // //     this.color = color;
        // //     this.brand = brand;
        // //     bananas = 5;
        // // }

        // Banana banana = new Banana("Yellow", "Chiquita");


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What color are the bananas?");
        // String color = scanner.nextLine();
        // System.out.println("What brand are the bananas?");
        // String brand = scanner.nextLine();
        // System.out.println("How many bananas are there?");
        // int bananas = Integer.parseInt(scanner.nextLine());

        // Banana banana = new Banana(color, brand, bananas);

        // System.out.println(banana.color);
        // System.out.println(banana.brand);
        // System.out.println(banana.bananas);

         // Scanner scanner = new Scanner(System.in);
        // System.out.println("What color is the bike?");
        // String color = scanner.nextLine();
        // System.out.println("How many wheels does the bike have?");
        // int wheel = Integer.parseInt(scanner.nextLine());
        // System.out.println("How many gears does the bike have?");
        // int gears = Integer.parseInt(scanner.nextLine());

        // Bike wynn = new /*go into class and look for this specific method:*/ Bike(color, wheels, gears, true);
        // Bike diamond = new Bike("purple", 1, 4, false);

        // Unicycle honda = new Unicycle("scarlett", "honda", 36);

        // System.out.println(wynn.color);
        // System.out.println(wynn.wheels);
        // System.out.println(wynn.gears);
        // System.out.println(wynn.bell);

        // System.out.println("\n----------------\n");

        // System.out.println(diamond.color);
        // System.out.println(diamond.wheels);
        // System.out.println(diamond.gears);
        // System.out.println(diamond.bell);

        // System.out.println("\n----------------\n");

        // System.out.println("The color of our unicycle is: " + honda.color);
        // System.out.println(honda.brand);
        // System.out.println(honda.height);

    }
}