import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

    // ArrayList<Integer> otherArray = new ArrayList<Integer>(3);
    
    // int[] myArray = {5, 1, 3};

    // String myString = "I really love ice cream";

    // String[] stringArray = myString.split(" ");

    // List<String> arrayList = new ArrayList<String>();

    ArrayList<String> fruitList = new ArrayList<String>();
    
    public Array(){
    }
    
    public void run() {
        
        fruitList.add("Peach");
        fruitList.add("Strawberries");
        fruitList.add("Mangoes");

        for (String iterator : fruitList) {
            System.out.println(iterator); 
        }   
        
        // // System.out.printf("\n\n%s\n", myArray[1]);
        // System.out.println(otherArray.size());
        // System.out.println();
        // System.out.println();
        // otherArray.add(5);
        // otherArray.add(10);
        // otherArray.add(15);
        // otherArray.add(20);
        // otherArray.add(25);
        // otherArray.add(0,1); /*will add int to specific element*/
        // otherArray.remove(0);
        // Collections.reverse(otherArray);

        // // System.out.println(otheArray.add(5));
        // // System.out.println(otheArray.add(6));
        // // System.out.println(otheArray.add(8));
        // System.out.println(otherArray.toString());
        // System.out.println();
        // System.out.println(otherArray.size());
        // System.out.println(otherArray.get(3));
        // System.out.println("[");
        // for (int i = 0; i < stringArray.length; i++){
        //     System.out.print(stringArray[i] + ", ");
        // }
        // System.out.println("]");
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();

        // arrayList = Arrays.asList(myString);
        // System.out.println(arrayList);
        // // otherArray.clear();
        // // System.out.println(otherArray.size());
        
    }
}