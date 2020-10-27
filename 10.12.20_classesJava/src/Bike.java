public class Bike {
    /*out representation of a bike in code*/

/*How would you describe a bike?*/

private String color /*= red*/;

private int /*a number*/ wheels /*= 2*/;

private int /*a number*/ gears /*= 8*/;

private boolean /*(true or false)*/ bell /*= true*/;

private int currentGear = 1;

private int currentSpeed = 0;


/*CONSTRUCTOR*/

public Bike(String color, int wheels, int gears){
    this.color = color;
    this.wheels = wheels;
    this.gears = gears;
}

/*OVERLOADED CONSTRUCTOR*/
/*if descriptors placed at the end the constructor below isn't needed to instantiate*/

public Bike(String c, int w, int g, boolean b){
    this /*("this" speaks to class "Bike"; This -> Bike -> color)*/.color = c;
    this.wheels = w;
    this.gears = g;
    this.bell = b;

}

// public Bike(){
//     color = "red";
//     wheels = 2;
//     gears = 8;
//     bell = true;

// }

/*METHOD
method declaration:
availability- public or private or protected
return type- void
method name- changeGear*/

public void changeGear(int gearSelection) {
    System.out.println("The bike is now in gear " + gearSelection);
    this.currentGear = gearSelection;
}

public void speedUp(int accelerationRate) {
    System.out.printf("The bike speeds up from %d to %d", currentSpeed, accelerationRate);
    this.currentSpeed = this.calculateNewSpeed(currentSpeed, accelerationRate);
}

public void getCurrentSpeed(){
    System.out.println("\nCurrent speed is " + currentSpeed);
}

public void getCurrentGear(){
    System.out.println("\nCurrent gear is " + currentGear);
}

public String getColor() {
    return this.color;
}

public void paintBike(String color) {
    System.out.println("The color of the bike is now " + color);
    this.color = color;
}

private int calculateNewSpeed(int currentSpeed, int accelerationRate) {
    return currentSpeed + accelerationRate;
}



}
