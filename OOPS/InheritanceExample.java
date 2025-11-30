// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        Dog d = new Dog(); // object of child class

        d.eat();   // inherited method
        d.bark();  // child class method
    }
}
