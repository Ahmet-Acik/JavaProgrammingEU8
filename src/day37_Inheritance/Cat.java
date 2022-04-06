package day37_Inheritance;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow () {
        System.out.println( name + " is meowing!");
    }

    public void scratch(){
        System.out.println( name + " is scratching!");
    }
}
