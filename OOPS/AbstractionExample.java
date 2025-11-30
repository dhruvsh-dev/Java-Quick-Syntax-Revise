// Abstract class
abstract class Animal {
    abstract void sound();   // abstract method

    void sleep() {           // non-abstract method
        System.out.println("Animal is sleeping...");
    }
}

// Child class implementing abstract method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Animal a = new Dog();   // upcasting
        a.sound();              // calls overridden method
        a.sleep();              // non-abstract method
    }
}
