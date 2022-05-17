package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

import static java.lang.Long.parseLong;

public class MultiCatchBlocks {

    public static void main(String[] args) {




//
//        Employee employee = null;
//
//        System.out.println("Test Started ");
//
//        try {
//            System.out.println(employee.getSalary());
//
//        } catch (IndexOutOfBoundsException | ArithmeticException | ClassCastException | NullPointerException e) {
//            System.out.println("1. catch bloc got the exception ");
//            e.printStackTrace();
////        } catch (ArithmeticException e) {
////            System.out.println("2. catch bloc got the exception ");
////            e.printStackTrace();
////        } catch (ClassCastException e) {
////            System.out.println("3. catch bloc got the exception ");
////            e.printStackTrace();
////        } catch (RuntimeException e) {
////            System.out.println("4. catch bloc got the exception ");
////            e.printStackTrace();
////        }
//        }
//            System.out.println("Test Completed ");

        String abcL = "222345";
        String abcI = "222345";
        String abcD = "222.345";
        String abc = "222345";


        long parsedLong = Long.parseLong(abcL);
        System.out.println("parsedLong = " + parsedLong);

        int parsedInt = Integer.parseInt(abcI);
        System.out.println("parsedInt = " + parsedInt);

        double parsedDouble = Double.parseDouble(abcD);
        System.out.println("parsedDouble = " + parsedDouble);


        String str = "JAVA";
        String str1 = "12345";
        int inta = 12345;


        System.out.println("str1 = " + str1);
        Integer intValueOf = Integer.valueOf(inta);
        System.out.println("intValueOf = " + intValueOf);
        Integer strValueOf = Integer.valueOf(str);
        System.out.println("strValueOf = " + strValueOf);




//
//        try {
//            System.out.println("Java".charAt(-1));
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//
//        finally {
//
//        }


    }
}

