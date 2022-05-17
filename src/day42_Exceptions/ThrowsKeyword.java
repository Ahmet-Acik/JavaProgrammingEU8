package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {


        /*
            throws

        throws is a keyword in Java which is used in the signature of method to indicate that
        this method might throw one of the listed type exceptions.
        The caller to these methods has to handle the exception using a try-catch block.

        We can use throws keyword to delegate the responsibility of exception handling to the caller
        (It may be a method or JVM) then caller method is responsible to handle that exception.
            Important points to remember about throws keyword:

        throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
        throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
        By the help of throws keyword we can provide information to the caller of the method about the exception.


                The throw keyword is used to create a custom error.

                The throw statement is used together with an exception type.
                There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

                The exception type is often used together with a custom method, like in the example above.


         */


        System.out.println("-------- Test 1------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------- Test 1 Completed------------");


        System.out.println("-------- Test 2------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-------- Test 2 Completed------------");



    }

}