public class LoopsExample {
    public static void main(String[] args) {

        // 1️⃣ for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2️⃣ while loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3️⃣ do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // 4️⃣ for-each loop
        System.out.println("\nFor-Each Loop:");
        int[] nums = {1, 2, 3, 4, 5};
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
