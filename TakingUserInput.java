import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Value of a is: " + a);

        sc.close();
    }
}
