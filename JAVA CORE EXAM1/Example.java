class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos.");
    }
}

public class Example {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.makeSound(); 
        dog.makeSound();   
        cat.makeSound();   
        cow.makeSound();  
    }
}

