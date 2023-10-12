package OOPS.polymorphism;

// basic code of polymorphism...
//Array with poli
// A class that represents a generic animal
class Animal {
    // A method that prints "Animal makes sound" to the console
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// A class that represents a cat
class Cat extends Animal {
    // A method that overrides the makeSound() method of Animal and prints "Cat
    // meows" to the console
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// A class that represents a dog
class Dog extends Animal {
    // A method that overrides the makeSound() method of Animal and prints "Dog
    // barks" to the console
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// A class that tests the polymorphism of animal objects
public class new_poli {
    public static void main(String[] args) {
        // Create an array of animal objects
        Animal[] animals = new Animal[3];
        // Assign different types of animal objects to the array elements
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();
        // Loop through the array and invoke the makeSound() method on each animal
        // object
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
