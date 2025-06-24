class Animal {
    public void hunt() {
        System.out.println("hunting");
    }
}

class Dog extends Animal {
    public void bark() {
        super.hunt();
        System.out.println("barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();  
        d.bark();
    }
}
