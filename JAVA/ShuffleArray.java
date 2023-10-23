import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        Collections.shuffle(Arrays.asList(myArray));

        // Print the shuffled array
        System.out.println(Arrays.toString(myArray));
    }
}
