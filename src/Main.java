import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        // Array Methods
        int[] numbers = { 4, 2, 7 };
        Arrays.sort(numbers);
        // for printing, we need to cast the array, otherwise we get the ref
        String result = Arrays.toString(numbers);
        System.out.println(result);

        // Loops
        String[] names = {"Cristina", "Paul", "Maria", "John"};

        System.out.println("==== For ====");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("==== Foreach ====");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==== While ====");
        int i =0;
        while(i < names.length) {
            System.out.println(names[i++]);
        }

        System.out.println("==== Do while ====");
        i = 0;
        do {
            System.out.println(names[i++]);
        } while(i < 0);

        // Exercise 1
        int[] inputArray = {5, 4, 3, 2, 1};
        int[] outputArray = multiplyByNext(inputArray);
        System.out.println();
        System.out.println("Exercise 1");
        System.out.println(Arrays.toString(outputArray));

        // Exercise 2
        int[] invertedArray = invertIntegersArray(inputArray);
        System.out.println();
        System.out.println("Exercise 2");
        System.out.println(Arrays.toString(invertedArray));

    }

    // Exercise 1
    public static int[] multiplyByNext(int[] integersArray) {
        int[] outputArray = new int[integersArray.length];

        for (int j = 0; j < integersArray.length; j++) {
            if (j == integersArray.length - 1) {
                outputArray[j] = integersArray[j] * integersArray[0];
            } else {
                outputArray[j] = integersArray[j] * integersArray[j+1];
            }
        }
        return outputArray;
    }

    // Exercise 2
    public static int[] invertIntegersArray(int[] integersArray) {
        int[] invertedArray = new int[integersArray.length];
        int n = integersArray.length;

        for (int k = 0; k < n; k++) {
            invertedArray[n-1-k] = integersArray[k];
        }

        return invertedArray;
    }
}