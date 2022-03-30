package day_34_GarbagaCollection_AccessModifiers;



import static day_34_GarbagaCollection_AccessModifiers.Circle.numbers;
import static day_34_GarbagaCollection_AccessModifiers.Circle.pi;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(numbers);

        System.out.println("----------------------------");

        // find the sum of 10, 20
        int r1 = sum(10, 20);

        // find the sum of 100, 200
        int r2 = sum(100, 200);


        int r3 = subtract(100,50);

        int r4 = max(1000, 2000);


    }

}
