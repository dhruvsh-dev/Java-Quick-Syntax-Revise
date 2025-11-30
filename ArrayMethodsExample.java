import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {

        // 1️⃣ Creating an array
        int[] numbers = {30, 10, 50, 20, 40};

        // Printing original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2️⃣ Sorting array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3️⃣ Searching element (array must be sorted)
        int index = Arrays.binarySearch(numbers, 20);
        System.out.println("Index of 20: " + index);

        // 4️⃣ Copying array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        // 5️⃣ Comparing two arrays
        System.out.println("Arrays equal? " + Arrays.equals(numbers, copy));

        // 6️⃣ Filling array with a value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 100);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // 7️⃣ Multi-dimensional array + deepToString()
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("2D Array: " + Arrays.deepToString(matrix));
    }
}
