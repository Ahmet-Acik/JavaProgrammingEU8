package day37_Inheritance;

public class Parrots extends AnimalS {


    public Parrots(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void sing (){
        System.out.println( name + " is singing!");
    }
    public void speak (){
        System.out.println(name + " is speaking!");
    }
}
