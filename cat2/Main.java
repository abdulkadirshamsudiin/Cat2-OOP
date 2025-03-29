// Question 1(B):

class MathOperations {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println("Result1: " + m.multiply(3,4));
        System.out.println("Result2: " + m.multiply(2,5,6));

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();
    }
}
