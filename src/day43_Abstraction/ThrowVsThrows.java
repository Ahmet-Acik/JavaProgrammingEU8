package day43_Abstraction;

import java.util.Scanner;

public class ThrowVsThrows {

    public static void main(String[] args) {

        System.out.println("Enter your score : ");
        int score = new Scanner(System.in).nextInt();

        if (score < 0 || score > 100) {
            throw new RuntimeException("Invalid score");

        }
        if (score > 90) {
            System.out.println("A" + score);
        } else if (score > 80) {
            System.out.println("B" + score);

        } else if (score > 70) {
            System.out.println("C" + score);

        } else if (score > 60) {
            System.out.println("D" + score);

        } else if (score > 50) {
            System.out.println("E" + score);

        } else {
            System.out.println("F : failed" + score);

        }
        method2();
    }



    public static void method1() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void method2 (){

        try {
            System.out.println(10 / 0);
        } catch (RuntimeException e) {
            e.printStackTrace();

        }



    }
}
