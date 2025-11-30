public class StringMethodsExample {
    public static void main(String[] args) {

        String str = "  Hello Java  ";

        // 1️⃣ length()
        System.out.println("Length: " + str.length());

        // 2️⃣ charAt()
        System.out.println("Char at index 1: " + str.charAt(1));

        // 3️⃣ toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4️⃣ toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5️⃣ trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 6️⃣ substring()
        System.out.println("Substring(2): " + str.substring(2));
        System.out.println("Substring(2, 7): " + str.substring(2, 7));

        // 7️⃣ contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 8️⃣ equals() & equalsIgnoreCase()
        String s2 = "hello java";
        System.out.println("Equals: " + str.equals(s2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(s2));

        // 9️⃣ startsWith() & endsWith()
        System.out.println("Starts with 'He': " + str.trim().startsWith("He"));
        System.out.println("Ends with 'va': " + str.trim().endsWith("va"));

        // 🔟 replace()
        System.out.println("Replace: " + str.replace("Java", "World"));

        // 1️⃣1️⃣ split()
        String words[] = str.trim().split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 1️⃣2️⃣ indexOf()
        System.out.println("Index of 'J': " + str.indexOf("J"));
    }
}
