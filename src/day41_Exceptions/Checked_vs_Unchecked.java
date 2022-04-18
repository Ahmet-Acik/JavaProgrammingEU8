package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        /*

    An exception (or exceptional event) is a problem that arises during the execution of a program.
    When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally,
    which is not recommended, therefore, these exceptions are to be handled.

    An exception can occur for many different reasons.
    Following are some scenarios where an exception occurs.

            A user has entered an invalid data.

            A file that needs to be opened cannot be found.

            A network connection has been lost in the middle of communications or the JVM has run out of memory.

    Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.



    A) Checked exceptions − A checked exception is an exception that is checked (notified) by the compiler at compilation-time, these are also called as compile time exceptions.
    These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

    For example, if you use FileReader class in your program to read data from a file, if the file specified in its constructor doesn't exist, then a FileNotFoundException occurs,
     and the compiler prompts the programmer to handle the exception.

    B) Unchecked exceptions − An unchecked exception is an exception that occurs at the time of execution.
    These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API.
    Runtime exceptions are ignored at the time of compilation.

    For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an ArrayIndexOutOfBoundsExceptionexception occurs.


         */

//unchecked exception:

        int a = 10;
        int b = 0;

        // System.out.println(  a / b  );
        //System.out.println("Wooden Spoon");
        System.out.println("Silver Spoon");
        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

        //  System.out.println( characters[99] );

        Student student = null;

        // System.out.println( student.getName() );
        //student.study();

        final String str = "Wooden Spoon";

        // str = null;

        //   System.out.println( str.toUpperCase() );

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());



        // checked Exception:

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked


        System.out.println("------------------------------");

        System.out.println("Hello");









    }
}
