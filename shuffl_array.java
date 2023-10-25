
//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Random;

public class shuffl_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
