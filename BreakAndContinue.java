public class BreakAndContinue {
    public static void main(String[] args) {

        // 🔵 break example
        System.out.println("Break Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;   // loop stops when i = 3
            }
            System.out.println(i);
        }

        // 🔵 continue example
        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // skip 3 and continue loop
            }
            System.out.println(i);
        }
    }
}
