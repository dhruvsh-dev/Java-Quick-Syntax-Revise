// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverrideExample {
    public static void main(String[] args) {

        Animal obj = new Dog();  // Upcasting
        obj.sound();  // Calls overridden method
    }
}
