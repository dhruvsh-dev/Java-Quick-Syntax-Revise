public class ConstructorExample {

    int x;  // class attribute

    // class constructor (same name as class)
    public ConstructorExample() {
        x = 5;
    }

    public static void main(String[] args) {

        // create an object of the class
        ConstructorExample myObj = new ConstructorExample();

        System.out.println(myObj.x);  // print value of x
    }
}
