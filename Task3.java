import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    int s = 5;
    int[] totalZeroArray = generatetotalZeroArray(s);


        System.out.println("Generated Zero Sum Array for n = " + s + ": " + Arrays.toString(totalZeroArray));
}

    public static int[] generatetotalZeroArray(int n) {
        if (n <= 0 || n > 100) {
            System.out.println("Invalid, please input a positive integer between 1 and 100.");
            return new int[0];
        }

        int[] tempArray = new int[n - 1];


        for (int i = 0; i < n - 1; i++) {
            tempArray[i] = i + 1;
        }


        tempArray = Arrays.copyOf(tempArray, n);
        tempArray[n - 1] = -Arrays.stream(tempArray).sum();


        random(tempArray);

        return tempArray;
    }

 private static void random(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
