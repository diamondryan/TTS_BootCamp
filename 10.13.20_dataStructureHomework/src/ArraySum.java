import java.io.Console;

public class ArraySum {
    public static int ArraySum (int[] array){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
