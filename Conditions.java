public class Conditions {
    public static void main(String[] args) {

        int number = 10;

        // 1️⃣ if statement
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // 2️⃣ if-else statement
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 3️⃣ else-if ladder
        int age = 18;
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        // 4️⃣ switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
