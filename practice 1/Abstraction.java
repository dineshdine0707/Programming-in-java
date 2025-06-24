abstract class Animal {
    abstract void bark();

    public void hunt() {
        System.out.println("Hunting");
    }
}
class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("Barking");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.bark();
        d.hunt();
    }
}

