package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        Employee employee = null;

        System.out.println("Test Started ");

        try {
            System.out.println(employee.getSalary());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("1. catch bloc got the exception ");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("2. catch bloc got the exception ");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("3. catch bloc got the exception ");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("4. catch bloc got the exception ");
            e.printStackTrace();
        }

        System.out.println("Test Completed ");



        try {
            System.out.println("Java".charAt(-1));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


    }
}
