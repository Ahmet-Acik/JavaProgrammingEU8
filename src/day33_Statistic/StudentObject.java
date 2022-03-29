package day33_Statistic;

public class StudentObject {

    public static void main(String[] args) {
        
        
        Student student = new Student("Ahmet");
        System.out.println("student = " + student);
        
        Student student1 = new Student("Burak", 'M');
        System.out.println("student1 = " + student1);
        
        Student student2 =new Student("Mehmet", 12345);
        System.out.println("student2 = " + student2);

        Student student3 = new Student("Ali", 'M', 25, 1234567, 'A');
        System.out.println("student3 = " + student3);

        Student student4 = new Student("Osman", 'M', 25, 12345678);
        System.out.println("student4 = " + student4);


        Student [] students = {student1,student2,student3,student4};
    }
}
