public class Operators {
    public static void main(String[] args) {

        // 1️⃣ Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2️⃣ Unary Operators
        int x = 10;
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("--x = " + (--x)); // pre-decrement
        System.out.println("x-- = " + (x--)); // post-decrement

        // 3️⃣ Relational (Comparison) Operators
        System.out.println(a > b);  
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // 4️⃣ Logical Operators
        boolean p = true, q = false;
        System.out.println(p && q);   // AND
        System.out.println(p || q);   // OR
        System.out.println(!p);       // NOT

        // 5️⃣ Assignment Operators
        int n = 10;
        n += 5;   // n = n + 5
        n -= 3;   // n = n - 3
        n *= 2;   // n = n * 2
        System.out.println("n = " + n);

        // 6️⃣ Bitwise Operators
        int m = 5, k = 3;
        System.out.println(m & k);  // AND
        System.out.println(m | k);  // OR
        System.out.println(m ^ k);  // XOR
        System.out.println(m << 1); // left shift
        System.out.println(m >> 1); // right shift

        // 7️⃣ Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
    }
}
