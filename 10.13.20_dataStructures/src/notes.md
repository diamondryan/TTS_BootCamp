JAVA DATA STRUCTURES


JAVA COLLECTIONS (2 TYPES): ArrayLists
- all elements inside must be the same
Example: ArrayList<String> is an arraylist of strings

Arrays: a specific location in memory; you cannot change the size
String[] myArray = {"A", "B", "C"};
- A = 0, B = 1, C = 2

import java.util.ArrayList;

public class Array {

    String[] myArray = {"A", "B", "C"};
    ArrayList

    public Array(){}
    *Java will make a default Array unless you make one yourself*
    
    public void run() {
        System.out.printf("%s\n", myArray[1]);

    }
}
*type           variableName = new ObjectType       INSTANTIATING*
ArrayList<Integer> otheArray = newArrayList<Integer>(3);

<Integer> is a wrapper class bc it's an object
(3) tells the size of the Array but not needed if you have default constructor

Use Array when you know the specific # of items

JAVA COLLECTIONS (2 TYPES): HashMaps
- collection of data
- stores item as "key"/"value" pairs

keySet: item + value

LINKEDLIST

QUEUE- FIFO
first in, first out