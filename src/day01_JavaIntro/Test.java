package day01_JavaIntro;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);



    }



}

class StaticBlockTest {
    // Declare two instance blocks.
    {
        System.out.println("Instance block-1");
    }
    {
        System.out.println("Instance block-2");
    }
    // Declare two static blocks.

    static {
        System.out.println("Static block-1");
    }

    static {
        System.out.println("Static block-2");
    }
    // Declare zero parameter constructor.

    StaticBlockTest()
    {
        System.out.println("0-arg constructor");
    }
    // Declare one parameter constructor with int parameter named a.

    StaticBlockTest(int a)
    {
        System.out.println("1-arg constructor");
    }

    public static void main(String[] args)
    {
// Create an object of class.
        new StaticBlockTest(); // Nameless object.

// Create another object of class and pass an integer argument value.
        new StaticBlockTest(20); // Nameless object.
    }
}



