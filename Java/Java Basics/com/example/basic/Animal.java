class Species extends Object {
    private String name;
    private int legs;

    public Species() {
        super(); // Calls the constructor of Object class
        System.out.println("Species created with default values.");
    }

    public Species(String name, int legs) {
        this.name = name;
        this.legs = legs;
        System.out.println("Species created with name: " + name + " and legs: " + legs);
    }
}

class Dog extends Species {
    private String breed;
    public Dog() {
        super("Mia", 4  );
        System.out.println("Dog created with default values.");
    }

    public Dog(String name, int legs, String breed) {
        this(); // Calls the default constructor of Dog, which calls the parameterized constructor of Species
        this.breed = breed;
        System.out.println("Dog created with name: " + name + ", legs: " + legs + ", and breed: " + breed   );
    }
}

abstract class ExtinctSpecies {
    String name;
    int legs;

    public ExtinctSpecies(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }       

    public abstract void displayInfo();

    public void extinctMessage() {
        System.out.println(this.name + " is an extinct species with " + 
        this.legs + " legs.");
    }   

}

class Dinosaur extends ExtinctSpecies {
    public Dinosaur(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void displayInfo() {
        System.out.println("Dinosaur Name: " + name + ", Legs: " + legs +"extinct 100 million years ago.");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 4, "Golden Retriever");

        Dinosaur dino1 = new Dinosaur("Tyrannosaurus Rex", 2);
        dino1.extinctMessage();
        dino1.displayInfo();

        //autoboxing
        Integer num1 = 10; // Autoboxing: int to Integer
        Double num2 = 3.14; // Autoboxing: double to Double

        //unboxing

        int primitiveNum1 = Integer.parseInt("101"); // Unboxing: Integer to int
        double primitiveNum2 = Double.parseDouble("3.14"); // Unboxing: Double to double

        System.out.println("Unboxing results: " + primitiveNum1 + ", " + primitiveNum2 );

    }
}
